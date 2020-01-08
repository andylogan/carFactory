
package factorypattern_carfactory;

public abstract class Car {
    int doorQuantity;
    double price;
    String engineType;
    
    public Car(CarType model){
//        System.out.println("inside Car class");
        this.model = model;
        arrangeParts();
    }
    private void arrangeParts(){
        // do one time processing here
//        System.out.println("inside arrangeParts()");
    }
    protected abstract void construct();
    
    private CarType model = null;
    
    public CarType getModel(){
//        System.out.println("inside getModel");
        return model;
    }
    public void setModel(CarType model){
        this.model = model;
    }
    
}
