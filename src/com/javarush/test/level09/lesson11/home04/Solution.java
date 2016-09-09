package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        //Вводим данные
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Date date = new Date(reader.readLine());

        //Форматируем данные. Подсказка есть тут
        // http://www.seostella.com/ru/article/2012/02/05/formatirovanie-daty-v-java.html
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM d, y");

        //Выводим на экран, не забыв все буквы сделать большими
        System.out.println(simpleDateFormat.format(date).toUpperCase());
    }
}