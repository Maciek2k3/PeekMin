package com.Maciek;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        GetMin getMin = new GetMin();

        getMin.push(5);
        System.out.println(getMin.getMin());
        getMin.push(13);
        System.out.println(getMin.getMin());
        getMin.push(12);
        System.out.println(getMin.getMin());

    }

}
