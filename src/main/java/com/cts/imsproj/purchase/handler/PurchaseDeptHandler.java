package com.cts.imsproj.purchase.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cts.imsproj.purchase.handler.PurchaseDepartmentException;

@ControllerAdvice
public class PurchaseDeptHandler {

	@ExceptionHandler
	@ResponseBody
	public String purchaseDeptException(PurchaseDepartmentException exception) {
		return  exception.getMessage();
	}
}
