package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarComparator {

    public List<Car> compareByNumber (List<Car> carList){
        return carList.stream ().sorted (Comparator.comparing(Car::getNumber)).collect (Collectors.toList ());
    }

    public List<Car> compareByPower (List<Car> carList){
        return carList.stream ().sorted(Comparator.comparing(Car::getPower).reversed ()).collect (Collectors.toList ());
    }
}
