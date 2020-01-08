
package factorypattern_carfactory;

public class SedanCar extends Car {
    SedanCar() {
        super(CarType.SEDAN);
        construct();
    }
    @Override
    protected void construct(){
        doorQuantity = 4;
        price = 31799.99;
        engineType = "Gas/Electric";
        System.out.printf("Building a sedan car.%n Price:  $%.2f%n Engine: %s%n Doors:  %d%n%n",price,engineType,doorQuantity);
    }
}
