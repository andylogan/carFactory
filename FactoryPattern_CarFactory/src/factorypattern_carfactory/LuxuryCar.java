
package factorypattern_carfactory;

public class LuxuryCar extends Car {
    LuxuryCar() {
        super(CarType.LUXURY);
        construct();
    }
    @Override
    protected void construct(){
        doorQuantity = 5;
        price = 52999.99;
        engineType = "Gas";
        System.out.printf("Building a luxury car.%n Price:  $%.2f%n Engine: %s%n"
                + " Doors:  %d%n%n",price,engineType,doorQuantity);
    }
}
