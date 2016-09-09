package com.javarush.test.level18.lesson05.task02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName = console.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);

        byte[] buffer = new byte[fileInputStream.available()];
        while (fileInputStream.available() > 0) {
            fileInputStream.read(buffer);
        }
        fileInputStream.close();

        int commaCount = 0;
        for (byte b : buffer) {


            if (b == 44) {
                commaCount++;

            }

        }
        System.out.print(commaCount);
        console.close();
        fileInputStream.close();

    }
}