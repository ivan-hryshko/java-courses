package ru.lesson.lessons;

public class Calculator{

    private int result;
/*
* Сумиирование
* */
    public void add(int ... params) {
        for (Integer param : params){
            this.result += param;
        }
    }
    /*
    * Вычитание
    * Дважды приплюсовать первое значение, чтоб не изменить результат
    * */
    public void sub(int ... params) {
       this.result+=params[0]*2;
        for (Integer param : params){
            this.result-=param;
        }


    }

    /*
    * Умножение
    * */
    public void mult(int ... params) {
        this.result=1;
        for (Integer param : params){
            this.result *= param;
        }
    }

    /*
    * Деление
    * */
    public void div(int ... params) {

        for (Integer param : params){
            this.result /= param;
        }
    }
/*
* Вернуть результат
* */
    public int getResult(){
        return this.result;
    }

    public void clearResult() {
        this.result = 0;
    }
}