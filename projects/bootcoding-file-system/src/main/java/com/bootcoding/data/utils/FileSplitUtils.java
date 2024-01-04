package com.bootcoding.data.utils;

import com.bootcoding.data.reader.file.csv.CsvFileReader;
import com.bootcoding.data.report.CsvFileWriter;
import com.google.common.collect.Lists;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.List;

public class FileSplitUtils {


    public static void main(String[] args) {
        split("/Users/bootcoding/Downloads/bank_transactions.csv", 50000, "/Users/bootcoding/code/bootcoding-real-time-project-practice/projects/bootcoding-file-system/src/main/resources");
    }
    public static void split(String inputPath, int partitionCount, String outputFolder){
        try{

            CSVReader csvReader = new CSVReader(new FileReader(inputPath));
            List<String[]> data = csvReader.readAll();

            List<List<String[]>> partitionData = Lists.partition(data, partitionCount);

            for(List<String[]> subList: partitionData){
                CSVWriter csvWriter = new CSVWriter(new FileWriter(outputFolder + "/" + (Instant.now().getNano()) + ".csv"));
                csvWriter.writeAll(subList);


            }

        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
