package com.codegym.task.task18.task1809;

/*
Reversing a file
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String file1 = sc.nextLine();
        String file2 = sc.nextLine();

        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);

        byte[] data = new byte[inputStream.available()];
        inputStream.read(data);
        for (int i = data.length - 1; i >= 0; i--) {
            outputStream.write(data[i]);
        }

        inputStream.close();
        outputStream.close();
        sc.close();
    }
}