package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        //Напишите тут ваш код


        int counterW = 0;
        int counterN = 0;
        for (int i=0;i<array.length;i++) {
            if (isNumber(array[i])){

                counterN++;
            }
            else    counterW++;

        }



        String[] words = new String[counterW];
        String[] numbers = new String[counterN];

        counterW=0;counterN=0;

        for (int i=0;i<array.length;i++) {
            if (isNumber(array[i])) {
                numbers[counterN]=array[i]; counterN++;
            }
            else {words[counterW]=array[i]; counterW++;}
        }

        //descending bubble sort:
        String temp;
        for (int i=0;i<numbers.length;i++) {
            for (int j=1;j<numbers.length-i;j++) {
                int a = Integer.parseInt(numbers[j-1]);
                int b = Integer.parseInt(numbers[j]);
                if(a<b) {
                    temp =numbers[j-1];
                    numbers[j-1]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        // increasing bubble sort
        for (int i=0;i<words.length;i++) {
            for (int j=0;j<words.length-1;j++) {
                if (isGreaterThen(words[j],words[j+1])){
                    temp = words[j];
                    words[j]=words[j+1];
                    words[j+1]=temp;

                }
            }
        }
        counterW=0;counterN=0;
        for (int i=0;i<array.length;i++) {
            if (isNumber(array[i])) {
                array[i]=numbers[counterN]; counterN++;
            }
            else {array[i]=words[counterW]; counterW++;}
        }

    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThen(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        for (char c : s.toCharArray())
        {
            if (!Character.isDigit(c) && c != '-') return false;
        }
        return true;
    }
}