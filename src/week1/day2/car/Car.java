package week1.day2.car;

/**
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку ав-
 * томобиля.
 */
public class Car {

    private String carBrend;
    private String carModel;
    private Engine engine;
    private Wheel[] wheels = new Wheel[4];
    private Wheel extraWheel;

    public Car(String carBrend, String carModel, Engine engine, Wheel[] wheels, Wheel extraWheel) {

        this.carBrend = carBrend;
        this.carModel = carModel;
        this.engine = engine;
        this.wheels = wheels;
        this.extraWheel = extraWheel;
    }

    public void move(double speed) {
        System.out.println("The car is moving with speed " + speed + " km/h");
    }

    public void fullUp(double volume) {
        System.out.println("The car was fueled up by " + volume + " lit");
    }

    public void changeWheel(int position) {

        // position: 1-"front left wheel"
        // position: 2-"front right wheel"
        // position: 3-"back fight wheel"
        // position: 4-"back left wheel"

        String positionStr = "";
        switch (position) {
            case 1:
                positionStr = "front left wheel";
                wheels[0] = extraWheel;
                break;
            case 2:
                positionStr = "front right wheel";
                wheels[1] = extraWheel;
                break;
            case 3:
                positionStr = "back fight wheel";
                wheels[2] = extraWheel;
                break;
            case 4:
                positionStr = "back left wheel";
                wheels[3] = extraWheel;
                break;
            default:
                System.out.println("You have to enter a number of wheel to change (From 1 to 4)");
        }
        if (!positionStr.equals("")) {
            System.out.println(positionStr + " was changed");
        } else {
            System.out.println("You haven't change any wheel");
        }
    }

    public void showWheels(Wheel[] wheels) {
        for (int i = 0; i < wheels.length; i++) {
            String positionStr = "";
            switch (i) {
                case 0:
                    positionStr = "front left: " + wheels[i].printWheel();
                    break;
                case 1:
                    positionStr = "front right: " + wheels[i].printWheel();
                    break;
                case 2:
                    positionStr = "back fight: " + wheels[i].printWheel();
                    break;
                case 3:
                    positionStr = "back left: " + wheels[i].printWheel();
                    break;
            }
            System.out.println(positionStr);
        }
    }

    public String asString() {
        return String.format("Car brend - %s", carBrend);
    }
}
