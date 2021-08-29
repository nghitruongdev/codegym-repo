package com.codegym.task.task18.task1810;

/*
DownloadException
If the input file is less than 1000 bytes, throw DownloadException
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        Scanner sc = new Scanner(System.in);
        while(true){
            String file = sc.nextLine();
            FileInputStream inputStream = new FileInputStream(file);
            if(inputStream.available()<1000){
                throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}