package com.example.drools.test;

public enum CustomerType {
    LOYAL, NEW, DISSATISFIED, OTHER;

    public String getValue() {
        return this.toString();
    }
}