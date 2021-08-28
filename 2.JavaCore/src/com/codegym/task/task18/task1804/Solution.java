package com.codegym.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
Rarest bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);
       Map<Integer, Integer> map = new HashMap<>();
       int min =1;
        while(inputStream.available()>0){
            int c = inputStream.read();
            if(!map.containsKey(c)){
                map.put(c, 1);
            }else{
                map.replace(c, map.get(c)+1);
            }
            min = Math.min(min, map.get(c));
        }

        StringBuilder sb = new StringBuilder();
        for(int i : map.keySet()){
            if(map.get(i)==min){
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb);
        inputStream.close();
    }
}