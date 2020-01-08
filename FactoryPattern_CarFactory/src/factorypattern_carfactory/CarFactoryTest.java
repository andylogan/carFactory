
package factorypattern_carfactory;

public class CarFactoryTest {

    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(CarType.SMALL));
        System.out.println();
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println();
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
        System.out.println();
    }
}
