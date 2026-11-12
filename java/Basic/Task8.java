
class Vehicle {

    private String brand;
    private int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}

class Car extends Vehicle {

    private int doors;

    public Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Doj ors: " + doors);
    }
}

class Task8 {
    public static void main(String[] args) {

        Car c = new Car("Toyota", 180, 4);

        c.display();
    }
}
