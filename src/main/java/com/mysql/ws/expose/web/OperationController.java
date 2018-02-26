package com.mysql.ws.expose.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.ws.bussines.OperationService;
import com.mysql.ws.model.api.OperationRequest;
import com.mysql.ws.model.api.OperationResponse;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.models.Response;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value="${server.controller.context-path}")
public class OperationController {
	
	@Autowired
	private OperationService operationService;

	@ApiOperation(value="Registrar una operacion bancaria.",
			produces=MediaType.APPLICATION_JSON_VALUE,
			consumes=MediaType.APPLICATION_JSON_VALUE,
			response=OperationResponse.class,
			httpMethod="POST",
			notes="classpath://swagger/notes/operation_trade.md",
			tags={"OperationRequest"})
	@ApiResponses({
			@ApiResponse(code=201, message="Proceso conforme.",
					response=OperationResponse.class),
			@ApiResponse(code=500, message="Error al registrar Operacion.",
					response = Response.class)})
	@RequestMapping(value="/operation",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> registrarOperacion(@RequestBody OperationRequest request){
		log.info("TRADE ID {} "+request.getOperation().getTradeId());
		OperationResponse response = operationService.getValidTransactions(request);
		return new ResponseEntity<>(response,HttpStatus.CREATED);
	}
	
}
