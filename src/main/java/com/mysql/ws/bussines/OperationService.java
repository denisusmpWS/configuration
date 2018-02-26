package com.mysql.ws.bussines;

import com.mysql.ws.model.api.OperationRequest;
import com.mysql.ws.model.api.OperationResponse;

public interface OperationService {

	public OperationResponse getValidTransactions(OperationRequest request);
}
