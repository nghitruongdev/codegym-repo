package com.codegym.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

/*
Most frequent bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);
        byte[] data = new byte[inputStream.available()];
        inputStream.read(data);
        HashMap<Byte, Integer> map = new HashMap<>();
        int max = 0;
        for (byte b : data) {
            if (!map.containsKey(b)) {
                map.put(b, 1);
            } else {
                map.replace(b, map.get(b) + 1);
                max = max > map.get(b) ? max : map.get(b);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Byte b : map.keySet()){
            if(map.get(b)==max){
                sb.append(b).append(" ");
            }
        }
        System.out.println(sb);
        inputStream.close();
    }
}