/**
 * Copyright © 2018 abc corp
 */
package com.infogain.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.infogain.dto.MessageDTO;

/**
 * @author Abhishek1.Singhal
 *
 * This class is
 */

@RestControllerAdvice
public class AddressAdvice {
	
	@ExceptionHandler(NumberFormatException.class)
	@ResponseBody
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public MessageDTO processNumberFormatException(NumberFormatException exception) {
		MessageDTO message = new MessageDTO();
		message.setErr(true);
		message.setErrDesc("Pincode should be of Integer Type");
		return message;
	}
}
