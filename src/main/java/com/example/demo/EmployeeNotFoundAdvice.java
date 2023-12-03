package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

// Этот клас как я понял для того чтобы обрабатывать http запрос под наше исключение, короче увидет в браузере наше исключение 


@ControllerAdvice
public class EmployeeNotFoundAdvice {

	@ResponseBody
	@ExceptionHandler(EmployeeNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	
	String employeeNotFoundHandler(EmployeeNotFoundException ex) {
		return ex.getMessage();
	}
	
}
/*
 * @ResponseBody -- Вы можете использовать @ResponseBody аннотацию к методу, чтобы сериализовать
 * возвращаемый результат в тело ответа через HttpMessageWriter .
 * 
 */