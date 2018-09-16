/**
 * Copyright © 2018 abc corp
 */
package com.infogain.dto;

/**
 * @author Abhishek1.Singhal
 *
 * This class is
 */


public class MessageDTO {

	private boolean isErr;
	
	private String errDesc;
	
	public MessageDTO() {
		
	}

	public boolean isErr() {
		return isErr;
	}

	public void setErr(boolean isErr) {
		this.isErr = isErr;
	}

	public String getErrDesc() {
		return errDesc;
	}

	public void setErrDesc(String errDesc) {
		this.errDesc = errDesc;
	}
	
	
	
	
}
