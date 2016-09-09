package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream2 = new FileOutputStream(fileName2);
        LinkedList<Byte> bytList = new LinkedList<Byte>();
        while (fileInputStream.available()>0){
            bytList.add(0, (byte)fileInputStream.read());
        }
        for(Byte x : bytList){
            fileOutputStream2.write(x);
        }
        bufferedReader.close();
        fileInputStream.close();
        fileOutputStream2.close();

    }
}
