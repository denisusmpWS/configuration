package com.mysql.ws.model.api;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OperationRequest {

	@ApiModelProperty(
			name="operation",
			value="Operacion de Trade",
			dataType="Operation",
			required=true)
	private Operation operation;

	
	public OperationRequest() {
	}

}
