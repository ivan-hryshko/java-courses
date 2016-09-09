package com.javarush.test.level18.lesson03.task03;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static java.lang.System.in;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        FileInputStream inStr = new FileInputStream(new File(br.readLine()));

        Map<Byte,Integer > byteFrecuence = new HashMap<Byte, Integer>();

        byte b=0;
        while (inStr.available()>0){
            b = (byte) inStr.read();
            if(byteFrecuence.containsKey(b)){
                byteFrecuence.put(b, (byteFrecuence.get(b)) +1);
            }
            else {
                byteFrecuence.put(b, 1);
            }
        }
        inStr.close();

        int max= 0;
        Collection<Integer> list = byteFrecuence.values();
        for(Integer x : list){
            if(x>max){
                max=x;
            }
        }

        for (Map.Entry<Byte, Integer> pair : byteFrecuence.entrySet()) {
            if (pair.getValue() == max) {
                System.out.print(pair.getKey() + " ");
            }
        }

    }
}
