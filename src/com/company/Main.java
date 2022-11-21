package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // 508
        // c11 = 2
        List<Car>  carList = List.of (new Car (1, "a", "a", "a", 123),
                new Car (12, "b", "b", "b", 9000),
                new Car (0, "b", "b", "b", 19000));
        CarComparator carComparator = new CarComparator ();
        carComparator.compareByNumber (carList).forEach (System.out::println);
        carComparator.compareByPower (carList).forEach (System.out::println);
    }
}
