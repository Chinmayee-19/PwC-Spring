package com.lambda;

import java.util.Map;

public class GatewayResponse {
	private String body;
	private int statusCode;
	private Map<String,String> headers;
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public Map<String, String> getHeaders() {
		return headers;
	}
	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}
	public GatewayResponse(String body, int statusCode, Map<String, String> headers) {
		super();
		this.body = body;
		this.statusCode = statusCode;
		this.headers = headers;
	}
	public GatewayResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
