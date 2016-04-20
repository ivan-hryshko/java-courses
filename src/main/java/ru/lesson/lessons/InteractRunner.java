package ru.lesson.lessons;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class InteractRunner{
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

         /*
         * Создание нового обьекта калькуялтора
         * */
            Calculator calc = new Calculator();
            String exit = "no";

            /*
            *@ choice номер выбранной функции
            * */
            int choice =0;
            while(!exit.equals("yes")){
                System.out.println("Enter firts arg: ");
                int first = Integer.parseInt(br.readLine());
                while (choice==0){
                    System.out.println("Select a mathematical operation:");
                    System.out.println("1. Add (+)");
                    System.out.println("2. Sub (-)");
                    System.out.println("3. Mult (*)");
                    System.out.println("4. Div (/)");
                    choice = Integer.parseInt(br.readLine());
                    if(choice != 1&& choice !=2&& choice !=3&& choice !=4){
                        choice =0;
                    }
                }
                System.out.println("Enter second arg:");
                int second = Integer.parseInt(br.readLine());

                /*
                * Выбор функции в зависимости от выбора
                * */
                if(choice==1){
                    calc.add(first, second);

                }
                else if(choice ==2){
                    calc.sub(first, second);
                }
                else if(choice ==3){
                    calc.mult(first, second);

                }
                else if(choice ==4){
                    calc.div(first, second);

                }

                /*
                * Обнулить выбор мат действия, или не будет работать выбор
                * */
                choice = 0;
                System.out.println("Result: " + calc.getResult());

                /*
                * Очистить или сохранить результат
                * @ choiceEnd Храние выбора
                * */
                int choiceEnd =0;
                calc.clearResult();
                System.out.println("Exit: yes/no?");
                exit = br.readLine();



        }
    }
}
