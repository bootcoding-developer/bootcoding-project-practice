package com.bootcoding.data.metrics;

import com.bootcoding.data.model.House;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NeighbourhoodMetrics implements MetricCollector{
    @Override
    public void collect(List<House> data) {
        Map<String, List<House>> collect =
                data.stream().collect(Collectors.groupingBy(House::getNeighbourhood));
        collect.forEach((neighbour,values) ->
                System.out.println(neighbour + ":" + values.size())
        );
    }


    private long getNeighbourhoodCount(List<House> data, String condition){
        return data.stream()
                .filter(row -> condition.equals(row.getNeighbourhood()))
                .count();
    }
}
