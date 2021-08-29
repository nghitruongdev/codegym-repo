package com.codegym.task.task18.task1807;

/*
Counting commas

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        FileInputStream inputStream = new FileInputStream(name);
        int count =  0;
        while (inputStream.available() > 0) {
            if((char)inputStream.read()==','){
                count++;
            }
        }
        System.out.println(count);
        inputStream.close();
    }
}