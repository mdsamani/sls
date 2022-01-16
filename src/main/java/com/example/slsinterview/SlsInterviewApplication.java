package com.example.slsinterview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
public class SlsInterviewApplication {

    private static final List<Integer> sortedArray = Arrays.asList(1, 3, 5, 9, 11, 13);

    public static void main(String[] args) {
        SpringApplication.run(SlsInterviewApplication.class, args);
    }

    @GetMapping("/sum")
    public int sum(@RequestParam(value = "myNumber") int myNumber) {
        int count = 0;
        int arraySize = sortedArray.size();
        if (arraySize >1){
            int minMultiply = sortedArray.get(0) + sortedArray.get(1);
            int maxMultiply = sortedArray.get(arraySize - 1) + sortedArray.get(arraySize - 2);
            if (minMultiply <= myNumber && myNumber <= maxMultiply) {
                List<Integer> finalArray = new ArrayList<>();
                for (Integer n : sortedArray) {
                    if (n <= myNumber) {
                        finalArray.add(n);
                    }
                }
                int finalArraySize = finalArray.size();
                if (!finalArray.isEmpty() && finalArraySize > 1) {
                    for (int i = 0; i < finalArraySize - 1; i++) {
                        for (int j = i+1; j < finalArraySize; j++) {
                            int multiply = finalArray.get(i) + finalArray.get(j);
                            if (multiply == myNumber) {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam(value = "myNumber") int myNumber) {
        int count = 0;
        int arraySize = sortedArray.size();
        if (arraySize >1){
            int minMultiply = sortedArray.get(0) * sortedArray.get(1);
            int maxMultiply = sortedArray.get(arraySize - 1) * sortedArray.get(arraySize - 2);
            if (minMultiply <= myNumber && myNumber <= maxMultiply) {
                List<Integer> finalArray = new ArrayList<>();
                for (Integer n : sortedArray) {
                    if (myNumber % n == 0) {
                        finalArray.add(n);
                    }
                }
                int finalArraySize = finalArray.size();
                if (!finalArray.isEmpty() && finalArraySize > 1) {
                    for (int i = 0; i < finalArraySize - 1; i++) {
                        for (int j = i+1; j < finalArraySize; j++) {
                            int multiply = finalArray.get(i) * finalArray.get(j);
                            if (multiply == myNumber) {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}