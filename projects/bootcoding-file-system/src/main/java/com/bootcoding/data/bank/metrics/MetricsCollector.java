package com.bootcoding.data.bank.metrics;

import com.bootcoding.data.bank.model.BankTransaction;

import java.util.List;

public interface MetricsCollector {

    public void collect(List<BankTransaction> transactions);
}
