package com.bootcoding.data.metrics;

import com.bootcoding.data.model.House;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NeighbourhoodMetrics implements MetricCollector{

    // flow
    // What is reuqirement
    // Calculate metrics for Neighbourhood
    // input: data of Houses
    // Houses - Neigbhours - Rural - count
    // Houses - Neigbhours - Suburb - count
    // Houses - Neigbhours - Urban - count
    @Override
    public void collect(List<House> data) {

        // data - 50000 records
        Map<String, List<House>> groups =
                data.stream().collect(Collectors.groupingBy(House::getNeighbourhood));

        // groups - Map (HashMap)
            // "Rural", houses (12k)
            // "Urban", houses (12k)
            // "Suburb", houses (12k)

        groups.forEach((neighbour,values) ->
                System.out.println(neighbour + ":" + values.size())
        );
    }


    private long getNeighbourhoodCount(List<House> data, String condition){
        return data.stream()
                .filter(row -> condition.equals(row.getNeighbourhood()))
                .count();
    }
}
