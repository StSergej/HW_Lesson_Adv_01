package hm_01_03;

public class Car implements Comparable<Car>{
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.speed + " " + this.price + " " + this.model + " " + this.color;
    }

    @Override
    public int compareTo(Car anotherCar) {
        int result = this.speed - anotherCar.speed;   //сравниваем по скорости
         if (result == 0){
            result = this.price - anotherCar.price;   //сравниваем по прайсу
        }if (result == 0) {
            result = this.model.compareTo(anotherCar.model);   //сравниваем по модели
        }if (result == 0) {
            return this.color.compareTo(anotherCar.color);  //сравниваем по цвету
        }
            return result;
    }
}
