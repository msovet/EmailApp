package com.company.bankaccountapp;

public interface IBaseRate {
    default double getBaseRate() {
        return 2.5;
    }
}
