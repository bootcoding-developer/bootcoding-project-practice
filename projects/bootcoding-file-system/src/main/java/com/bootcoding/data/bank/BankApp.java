package com.bootcoding.data.bank;

import com.bootcoding.data.bank.metrics.MetricsCollector;
import com.bootcoding.data.bank.metrics.TransactionByGenderMetrics;
import com.bootcoding.data.bank.model.BankTransaction;
import com.bootcoding.data.bank.reader.file.TransactionFileReader;

import java.util.List;

public class BankApp {
    public static void main(String[] args) {

        TransactionFileReader fileReader =  new TransactionFileReader();
        String filePath = "projects/bootcoding-file-system/src/main/resources/bank_transaction.csv";
        List<BankTransaction> bankTransactions = fileReader.read(filePath);
        MetricsCollector metric = new TransactionByGenderMetrics();
        metric.collect(bankTransactions);
    }
}
