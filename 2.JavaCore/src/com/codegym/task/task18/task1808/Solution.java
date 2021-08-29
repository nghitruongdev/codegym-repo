package com.codegym.task.task18.task1808;

/*
Splitting a file

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName1);
        FileOutputStream outputStream2 = new FileOutputStream(fileName2);
        FileOutputStream outputStream3 = new FileOutputStream(fileName3);

        int n = inputStream.available();
        if (n % 2 == 0) {
            byte[] data = new byte[n];
            if (inputStream.available() > 0) {
            inputStream.read(data);
             outputStream2.write(data,0,n/2);
             outputStream3.write(data,n/2,n/2);
            }
        }else{
            byte[] data = new byte[n];
            if(inputStream.available()>0){
                inputStream.read(data);
                outputStream2.write(data,0,n/2+1);
                outputStream3.write(data,n/2+1,n/2);
            }
        }
        inputStream.close();
        outputStream2.close();
        outputStream3.close();
    }
}
