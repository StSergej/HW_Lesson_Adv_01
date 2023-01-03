package hw_01_02;
/*  Вывод на экран элементов List:
    Создать список, заполнить его на 10 элементов и
    вывести на экран содержимое используя iterator.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Program {
    public static void main(String[] args) {

        List<String> countries = new ArrayList<>();
        countries.add("Germany");
        countries.add("France");
        countries.add("Italy");
        countries.add("Spain");
        countries.add("Ukraine");
        countries.add("Poland");
        countries.add("Romania");
        countries.add("Sweden");
        countries.add("Hungary");
        countries.add("Austria");

        System.out.println(countries);
        System.out.println("--------------------------");

        ListIterator<String> myNewList = countries.listIterator();
        while (myNewList.hasNext()) {
            String elem = myNewList.next();
            System.out.print(elem + " ");
        }
        System.out.println( "\n" + "--------------------------");
        Collections.sort(countries);    //отсортируем данные
        for (String temp : countries) {
            System.out.print(temp + " ");
        }
    }
}