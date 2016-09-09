package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

import static java.lang.System.in;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String name1 = br.readLine();
        String name2 = br.readLine();
        br.close();

        BufferedReader fReader = new BufferedReader(new FileReader(name1));
        BufferedWriter fWriter = new BufferedWriter(new FileWriter(name2));
        String line;
        while ((line = fReader.readLine())!=null){
            fWriter.write(line.replace(".","!"));
        }
        fReader.close();
        fWriter.close();
    }
}
