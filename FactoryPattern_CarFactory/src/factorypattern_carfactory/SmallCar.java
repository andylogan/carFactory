
package factorypattern_carfactory;

public class SmallCar extends Car {
    SmallCar() {
        super(CarType.SMALL);
//        System.out.println("inside SmallCar prior to construct.");
        construct();
//        System.out.println("inside SmallCar after construct");
    }
    @Override
    protected void construct(){
        doorQuantity = 2;
        price = 18199.99;
        engineType = "Electric";
        System.out.printf("Building a small car.%n Price:  $%.2f%n Engine: %s%n Doors:  %d%n%n",price,engineType,doorQuantity);
    }
}
