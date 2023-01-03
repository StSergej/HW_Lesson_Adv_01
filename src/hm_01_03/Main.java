package hm_01_03;
/*  В папке с примерами, ex_004_comparable:
    дописать логику, чтобы метод compareTo() осуществил поиск по скорости
    (если же скорость у 2-х объектов равна, то ищем по цене)-> цене - > моделе -> цвету машины.
 */
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(190, 8000, "BMW", "Red");
        Car c2 = new Car(140, 2000, "Opel", "Black");
        Car c3 = new Car(185, 10000, "Mercedes", "White");
        Car c4 = new Car(195, 7500, "BMW", "Blue");
        Car c5 = new Car(140, 2000, "Fiat", "Green");
        Car c6 = new Car(140, 2000, "Opel", "Grey");
        Car c7 = new Car(185, 10500, "Mercedes", "Black");

        Car[] c = {c1, c2, c3, c4, c5, c6, c7};

        System.out.println("Вывод данных: ");
        for (Car arg : c) {
            System.out.println(arg);
        }
        System.out.println("------------------");
        Arrays.sort(c);
        System.out.println("Сортировка данных:");
        for (Car arg : c) {
            System.out.println(arg);
        }
    }
}
