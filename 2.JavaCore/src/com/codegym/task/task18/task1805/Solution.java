package com.codegym.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
Sorting bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);
        ArrayList<Integer> list = new ArrayList<>();
        while (inputStream.available() > 0) {
            int i = inputStream.read();
            if (!list.contains(i)) {
                list.add(i);
            }
        }
        Collections.sort(list);
        for (int i : list) {
            System.out.print(i + " ");
        }
        inputStream.close();
    }

}
