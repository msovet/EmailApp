package com.company.bankaccountapp;

public interface IBaseRate {
    default int getBaseRate() {
        return 250;
    }
}
