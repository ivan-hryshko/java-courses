package com.javarush.test.level18.lesson03.task02;

import java.io.*;

import static java.lang.System.in;

/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        FileInputStream in = new FileInputStream(new File(br.readLine()));

        int minBit=in.read();
        int readBit;

        while (in.available()>0){
            readBit = in.read();
            if(readBit<minBit){
                minBit = readBit;
            }
        }
        System.out.println(minBit);

        br.close();
        in.close();

    }
}
