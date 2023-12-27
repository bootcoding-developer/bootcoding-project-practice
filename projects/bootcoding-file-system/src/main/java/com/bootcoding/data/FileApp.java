package com.bootcoding.data;

import com.bootcoding.data.processor.BedroomProcessor;
import com.bootcoding.data.reader.DataReader;
import com.bootcoding.data.reader.file.FileReader;
import com.bootcoding.data.reader.file.csv.CsvFileReader;
import com.bootcoding.data.report.CsvFileWriter;
import com.bootcoding.data.report.IFileWriter;
import com.bootcoding.data.report.JsonFileWriter;

import java.io.FileWriter;
import java.util.List;

public class FileApp {
    public static void main(String[] args) {


        // 1 read data from File

        FileReader fileReader = new CsvFileReader("/Users/bootcoding/code/bootcoding-real-time-project-practice/projects/bootcoding-file-system/housing_price_dataset.csv");
        BedroomProcessor bp = new BedroomProcessor();
        IFileWriter fw = new CsvFileWriter();

        IFileWriter jsonWriter = new JsonFileWriter();

        List data = fileReader.read();
        fw.write(bp.getHouses(data, 2), "./2bhk.csv");
        fw.write(bp.getHouses(data, 3), "./3bhk.csv");
        fw.write(bp.getHouses(data, 4), "./4bhk.csv");
        fw.write(bp.getHouses(data, 5), "./5bhk.csv");


        jsonWriter.write(bp.getHouses(data, 2), "/Users/bootcoding/tasks/2bhk.json");


        // 2bhk, 2bhk.csv
        // 3 bhk , 3bhk.csv
        // Write data to File (Output / Report)
        // which files, filename, file extension
    }
}
