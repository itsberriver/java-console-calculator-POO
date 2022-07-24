package OOP_EX_car;

public class Main {
    public class Car{
        //Atributos
        int velocity;
        String model;
        int wheels;

        public void main(String[] args) {
            Car car1 = new Car();
            Car car2 = new Car();

            car1.velocity = 200;
            car1.model = "audi";
            car1.wheels = 4;

            car2.velocity = 300;
            car2.model = "volksvagen";
            car2.wheels = 4;

            System.out.println("La velocidad del coche1 es:" +car1.velocity);
            System.out.println("Las características del coche2 son: " +car2);

        }


    }
}
