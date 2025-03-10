package com.java.advice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.java.Exception.UserNotFoundException;

@RestControllerAdvice
public class ApplicationExceptionHandler {
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handlerInvalidArgument(MethodArgumentNotValidException ex)
	{
		Map<String, String> errorMap=new HashMap<>();
		ex.getBindingResult().getFieldErrors().forEach(error->
		{
			errorMap.put(error.getField(), error.getDefaultMessage());
		});
		return errorMap;
	}
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(UserNotFoundException.class)
	public  Map<String, String> handeleBusinessException(UserNotFoundException exception)
	{
		Map<String, String> errorMap=new HashMap<>();
		errorMap.put("Errormessage", exception.getMessage());
		return errorMap;
	}

}
