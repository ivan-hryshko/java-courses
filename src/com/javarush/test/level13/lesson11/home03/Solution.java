package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

import java.io.*;

import static java.lang.System.in;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        InputStream in = new FileInputStream(br.readLine());

        while (in.available()>0){
            System.out.print((char)in.read());
        }
        br.close();
        in.close();


        //add your code here
    }
}
