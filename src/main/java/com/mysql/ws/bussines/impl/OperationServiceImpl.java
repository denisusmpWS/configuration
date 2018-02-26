package com.mysql.ws.bussines.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.google.gson.Gson;
import com.mysql.ws.bussines.OperationService;
import com.mysql.ws.model.api.OperationRequest;
import com.mysql.ws.model.api.OperationResponse;
import com.mysql.ws.model.thirdparty.seriva.CalypsoMessage;
import com.mysql.ws.model.thirdparty.seriva.GetMessageRequest;
import com.mysql.ws.model.thirdparty.seriva.GetMessageResponse;
import com.mysql.ws.model.thirdparty.seriva.SerivaException;
import com.mysql.ws.repository.OperationRepository;

@Service
public class OperationServiceImpl implements OperationService {

	private WebServiceTemplate webServiceTemplate;
	@Autowired
	private OperationRepository repository;

	public OperationServiceImpl(@Qualifier("message") WebServiceTemplate webServiceTemplate) {
		this.webServiceTemplate = webServiceTemplate;
	}



	@Override
	public OperationResponse getValidTransactions(OperationRequest request) {

		/** LLENAR OBJETO WS REQUEST**/
		CalypsoMessage calypsoMessage = new CalypsoMessage();
		calypsoMessage.setTradeId(request.getOperation().getTradeId());
		calypsoMessage.setTradeSource(request.getOperation().getTradeSource());
		calypsoMessage.setTradeStatus(request.getOperation().getTradeStatus());
		calypsoMessage.setExternalReference(request.getOperation().getExternalReference());
		calypsoMessage.setProductSubType(request.getOperation().getProductSubType());
		calypsoMessage.setProductType(request.getOperation().getProductType());
		calypsoMessage.setSentDate(request.getOperation().getSentDate());
		
		/** ENVIAR OBJETO WS A METODO WS CLIENT SOAP Y CAPTURAR EL RESPONSE**/
		GetMessageRequest messageRequest = new GetMessageRequest();
		messageRequest.setCalypsoMessage(calypsoMessage);
		
		GetMessageResponse messageResponse = (GetMessageResponse) webServiceTemplate.marshalSendAndReceive(messageRequest);
		
		/** LLENAR VALOR DE RESPONSE DEL API**/
		OperationResponse response = new OperationResponse();
		response.setExtRef(messageResponse.getSerivaMessage().getExternalReference());
		response.setStatus(messageResponse.getSerivaMessage().getStatus());
		response.setDescription(messageResponse.getSerivaMessage().getDescription());
		List<SerivaException> serivaExcep = messageResponse.getSerivaMessage().getExceptionDetail();
		Gson gson =new Gson();
		String trama = gson.toJson(serivaExcep);
		System.out.println("TRAMA LISTA:"+trama);
		StringBuilder code = new StringBuilder();
		StringBuilder excepError= new StringBuilder();
		
		for (SerivaException p: serivaExcep){
			
			code.append(p.getCode());
			excepError.append(p.getDescription());
			
		}
		
		response.setCode(code.toString());
		response.setExcepError(excepError.toString());
		response.setTradeId(messageResponse.getSerivaMessage().getTradeId());
	
		return repository.save(response);
	}

}
