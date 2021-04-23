package com.np.jpa.model;

import java.io.Serializable;

public class ResponseVO implements Serializable {

	private static final long serialVersionUID = -5415737907207904819L;

	private String responseCode;
	private String responseDesc;

	public ResponseVO() {
	}

	public ResponseVO(String responseCode, String responseDesc) {
		super();
		this.responseCode = responseCode;
		this.responseDesc = responseDesc;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseDesc() {
		return responseDesc;
	}

	public void setResponseDesc(String responseDesc) {
		this.responseDesc = responseDesc;
	}

}
