package week1.day2.car;


public class MainCar {
    public static void main(String[] args) {

        Wheel wheel1 = new Wheel(14, "Dunlop");
        Wheel wheel2 = new Wheel(14, "Dunlop");
        Wheel wheel3 = new Wheel(14, "Dunlop");
        Wheel wheel4 = new Wheel(14, "Dunlop");

        Wheel extraWheel = new Wheel(14, "Toyo");

        Wheel[] wheels = {wheel1, wheel2, wheel3, wheel4};

        Engine engine = new Engine(1.5, 86);

        Car car = new Car("Deawoo", "Lanos", engine, wheels,extraWheel);

        System.out.println(car.asString());
        System.out.println();
        car.showWheels(wheels);
        System.out.println();
        car.changeWheel(2);
        System.out.println();
        car.showWheels(wheels);
    }



}
