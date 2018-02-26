package com.mysql.ws.model.api;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity(name="operation")
@Getter
@Setter
@AllArgsConstructor
public class OperationResponse {
/**
 * JPA: Valida la nomenclatura que tengas los atributos de la tabla exigiendo lo siguiente:
 * palabra compuesta: char1_char2 (ambas con minuscula)
 */
	
	@ApiModelProperty(
			name="idOperation",
			value="Codigo de Operacion",
			example="3",
			dataType="int",
			required=true			
			)
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_operation")
	private int idOperation;
	
	@ApiModelProperty(
			name="extRef",
			value="Codigo de Referencia Externa",
			example="MINVD03",
			dataType="String",
			required=true			
			)
	@Column(name="external_reference")
	private String extRef;
	
	@ApiModelProperty(
			name="status",
			value="Estado de la Operacion",
			example="ACTIVO",
			dataType="String",
			required=true			
			)
	@Column(name="status")
	private String status;
	
	@ApiModelProperty(
			name="description",
			value="Descripcion de la Operacion",
			example="La operacion fue exitosa.",
			dataType="String",
			required=true			
			)
	@Column(name="description")
	private String description;
	
	@ApiModelProperty(
			name="code",
			value="Codigo de Error",
			example="SER01",
			dataType="String",
			required=true			
			)
	@Column(name="code")
	@JsonInclude(value=Include.NON_EMPTY) //Permite la no visualizacion del campo en caso tome el valor de null o ""
	private String code;
	
	@ApiModelProperty(
			name="excepError",
			value="Descripcion de Error",
			example="No se encontro trade para operacion.",
			dataType="String",
			required=true			
			)
	@Column(name="desc_error")
	@JsonInclude(value=Include.NON_EMPTY)
	private String excepError;
	
	@ApiModelProperty(
			name="trade_id",
			value="Codigo de Trade",
			example="425320",
			dataType="String",
			required=true			
			)
	@Column(name="trade_id")
	private String tradeId;
	
	public OperationResponse() {	
	}

}
