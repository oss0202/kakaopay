package com.oss.kakaopay.barofn.sampleError;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder(value = { "error_code", "error_message", "error_data" })
public class ApiException extends Exception {
	@JsonProperty("error_code")
	private String code;

	@JsonProperty("error_message")
	private String message;

	@JsonProperty("error_data")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Map data;

	public ApiException(String code, String message) {

		this.code = code;
		this.message = message;
	}

	public ApiException(String code, String message, ApiExceptionData data) {

		this.code = code;
		this.message = message;
		this.data = data.getData();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Map getData() {
		return data;
	}

	public void setData(Map data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ApiException [code=" + code + ", message=" + message + "]";
	}
	
	
}
