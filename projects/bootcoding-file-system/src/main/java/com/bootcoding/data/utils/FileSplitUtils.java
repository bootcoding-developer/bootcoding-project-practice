package com.bootcoding.data.utils;

import com.google.common.collect.Lists;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.List;

public class FileSplitUtils {

    public static void splitFiles(String inputPath, int partitionCount, String outputFolder) {

        try {
            CSVReader csvReader = new CSVReader(new FileReader(inputPath));
            List<String[]> data = csvReader.readAll();

            List<List<String[]>> partitionData = Lists.partition(data, partitionCount);

            for (List<String[]> subList : partitionData) {
                CSVWriter csvWriter = new CSVWriter(new FileWriter(outputFolder + "/" + (Instant.now().getNano()) + ".csv"));
                csvWriter.writeAll(subList);
                csvWriter.flush();
                csvWriter.close();
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }




    public static void main(String[] args) {
        splitFiles("/Users/bootcoding/Downloads/bank_transactions.csv", 50000, "/Users/bootcoding/code/bootcoding-real-time-project-practice/projects/bootcoding-file-system/src/main/resources");
    }


}
