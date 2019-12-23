package com.oss.kakaopay.barofn.sampleError;

import java.util.HashMap;
import java.util.Map;

public class ApiExceptionData {
	private Map<String, Object> data;

	public ApiExceptionData add(String key, Object value) {

		if (this.data == null) {
			this.data = new HashMap<String, Object>();
		}
		this.data.put(key, value);

		return this;
	}

	public Map<String, Object> getData() {
		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ApiExceptionData [data=" + data + "]";
	}
	
}
