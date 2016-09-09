package com.javarush.test.level14.lesson08.home10;

import java.util.LinkedList;
import java.util.List;

/**
 * JavaRush.ru
 * Level 14, Lesson 08, Bonus 10
 * <p/>
 * 1. В класе NotIncapsulatedClass создать private методы initList, printListValues, processCastedObjects <b/>
 * 2. Метод initList должен заполнять значениями входящий параметр list: <b/>
 * найди нужный блок кода в конструкторе, в котором list заполняется значениями <b/>
 * перенеси его в метод initList <b/>
 * верни заполненный list <b/>
 * 3. Метод printListValues должен принимать параметр list и вывести в консоль все элементы из списка list: <b/>
 * метод ничего не возвращает <b/>
 * найди нужный блок кода в конструкторе, в котором в цикле из списка list выводятся в консоль все значения <b/>
 * перенеси его в метод printListValues <b/>
 * исправь 2 ошибки в этом методе <b/>
 * 4. Метод processCastedObjects должен проверить: <b/>
 * входящий параметр имеет тип Number <b/>
 * метод ничего не возвращает <b/>
 * найди нужный блок кода в конструкторе, в котором в цикле для каждого объекта из списка list проверяется
 * его тип <b/>
 * перенеси этот блок в метод processCastedObjects <b/>
 * исправь 2 ошибки в этом методе <b/>
 * учти, что для объекта типа Float нужно вывести "Is float value defined? " + <Float_object>.isNaN() <b/>
 * учти, что для объекта типа Double нужно вывести "Is double value infinite? " + <Double_object>.isInfinite()
 * <p/>
 * Date: 03.05.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        new NotIncapsulatedClass();
    }

    public static class NotIncapsulatedClass
    {
        public NotIncapsulatedClass()
        {
            List<Number> list = new LinkedList<Number>();
            initList( list );
            printListValues( list );
            processCastedObjects( list );
        }

        private List<Number> initList( List<Number> list )
        {
            list.add( new Double( 1000f ) );
            list.add( new Double( "123e-445632" ) );
            list.add( new Float( -90 / -3 ) );
            list.remove( new Double( "123e-445632" ) );
            return list;
        }

        private void printListValues( List<Number> list )
        {
            for ( int i = 0; i < list.size(); i++ )
            {
                System.out.println( list.get( i ) );
            }
        }

        private void processCastedObjects( List<Number> list )
        {
            for ( Number object : list )
            {
                if ( object instanceof Float )
                {
                    Float a = ( Float ) object;
                    System.out.println( "Is float value defined? " + a.isNaN() );
                }
                else if ( object instanceof Double )
                {
                    Double a = ( Double ) object;
                    System.out.println( "Is double value infinite? " + a.isInfinite() );
                }
            }
        }
    }
}

// Исходный вариант:
//public class Solution
//{
//    public static void main(String[] args)
//    {
//        new NotIncapsulatedClass();
//    }
//
//    public static class NotIncapsulatedClass
//    {
//        public NotIncapsulatedClass()
//        {
//            List<Number> list = new LinkedList<Number>();
//            //1
//            list.add(new Double(1000f));
//            list.add(new Double("123e-445632"));
//            list.add(new Float(-90 / -3));
//            list.remove(new Double("123e-445632"));
//
//            //2 - Исправь 2 ошибки
//            for (int i = 0; i <= list.size(); i--)
//            {
//                System.out.println(list.get(i));
//            }
//
//            //3
//            for (Number object : list)
//            {
//                //Исправь 2 ошибки
//                if (object instanceof Float)
//                {
//                    Double a = (Double) object;
//                    System.out.println("Is float value defined? " + a.isNaN());
//                } else if (object instanceof Double)
//                {
//                    Float a = (Float) object;
//                    System.out.println("Is double value infinite? " + a.isInfinite());
//                }
//            }
//        }
//    }
//}