package com.bootcoding.data.processor;

import com.bootcoding.data.model.House;

import java.util.List;
import java.util.stream.Collectors;

public class BedroomProcessor {

    public List<House> getHouses(List<House> houses, int bedroomSize){
        return houses.stream().filter(h -> h.getBedrooms() == bedroomSize)
                .collect(Collectors.toList());

    }


}
