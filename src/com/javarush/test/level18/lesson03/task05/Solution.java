package com.javarush.test.level18.lesson03.task05;

import java.io.*;
import java.util.*;

import static java.lang.System.in;




/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        FileInputStream inputStream = new FileInputStream(new File(br.readLine()));

        TreeSet<Integer> setByte = new TreeSet<Integer>();
        while (inputStream.available()>0){
            int data  = inputStream.read();
            setByte.add(data);
        }

        for(Integer x : setByte){
            System.out.println(x+" ");
        }
        br.close();
        inputStream.close();
    }
}
