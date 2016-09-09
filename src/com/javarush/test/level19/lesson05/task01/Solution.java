package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.*;

import static java.lang.System.in;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        String file1 = br.readLine();
        String fileName2 = br.readLine();

        FileInputStream fin = new FileInputStream(file1);

        byte[] buf = new byte[fin.available()];
        fin.read(buf);
        fin.close();

        FileOutputStream fout = new FileOutputStream(fileName2);
        for (int i = 0; i < buf.length; i++) {
            if (i % 2 == 1) {
                fout.write(buf[i]);
            }
        }
        fout.close();
    }
}