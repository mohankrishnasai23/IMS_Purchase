package com.cts.imsproj.purchase.controller;

@SuppressWarnings("serial")
public class SupplierNotFoundException extends RuntimeException {

    private final int id;

    public SupplierNotFoundException(int id) {
        super("supplier-not-found-" + id);
        this.id = id;
    }

    public int getSupplierId() {
        return id;
    }
}