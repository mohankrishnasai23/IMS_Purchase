package com.cts.imsproj.purchase.handler;

@SuppressWarnings("serial")
public class PurchaseDepartmentException extends RuntimeException {

    private String message;

    public PurchaseDepartmentException(String message) {
        this.setMessage(message);
    }

    @Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}