package com.neuedu.Javabiji;

public class Car {
    public static void main(String[] args) {
        Car_class aodi = new Car_class();
   aodi.mark = "奥迪";
    aodi.price = 564654;
    aodi.speed = 55;
    aodi.test();
    aodi.drive();
    aodi.speedChange(80);

        Car_class benchi = new Car_class();

    benchi.mark = "奔驰";
    benchi.price = 654654;
   benchi.speed = 66;
   benchi.test();
    benchi.drive();
    benchi.speedChange(90);

    }
}
