package com.mysql.ws.model.api;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Operation {

  private String tradeId;
  private String externalReference;
  private String tradeStatus;
  private String tradeSource;
  private String productType;	  
  private String productSubType;
  private String sentDate;
	
	public Operation() {}

}
