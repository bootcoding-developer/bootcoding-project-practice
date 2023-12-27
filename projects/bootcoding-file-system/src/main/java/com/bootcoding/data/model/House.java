package com.bootcoding.data.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder

public class House {
    
     int squareFeet;
     int bedrooms;
     int bathrooms;
     String neighbourhood;
     int year;
     double price;


     public String toString(){
          return squareFeet + "," + bedrooms + "," + bathrooms + "," + neighbourhood + "," + year + "," + price;
     }
}
