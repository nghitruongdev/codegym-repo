package com.codegym.task.task18.task1812;

import java.io.IOException;
import java.util.Scanner;

/*
Extending AmigoOutputStream using Decorator pattern
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    private AmigoOutputStream outputStream;

    public QuestionFileOutputStream(AmigoOutputStream outputStream) {
        this.outputStream = outputStream;
    }


    @Override
    public void flush() throws IOException {
        outputStream.flush();
    }

    @Override
    public void write(int b) throws IOException {
        outputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        outputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        outputStream.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Do you really want to close the stream? Y/N");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.equalsIgnoreCase("y")) {
            outputStream.close();
        }
    }
}