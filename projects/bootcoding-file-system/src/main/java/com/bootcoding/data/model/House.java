package com.bootcoding.data.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class House {
    
     int squareFeet;
     int bedrooms;
     int bathrooms;
     String neighbourhood;
     int year;
     double price; 
}
