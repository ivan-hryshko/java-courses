package com.javarush.test.level19.lesson03.task02;

/* Адаптер
Используйте класс AdapterFileOutputStream,
чтобы адаптировать FileOutputStream к новому интерфейсу AmigoStringWriter
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class AdapterFileOutputStream implements AmigoStringWriter {
    private FileOutputStream outputStream;

    public AdapterFileOutputStream(FileOutputStream outputStream){
        this.outputStream = outputStream;
    }

    @Override
    public void flush() throws IOException {
        outputStream.flush();

    }

    @Override
    public void writeString(String s) throws IOException {
        outputStream.write(s.getBytes());
    }

    @Override
    public void close() throws IOException {
        outputStream.close();
    }
}

