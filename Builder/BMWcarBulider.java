package Builder;

public class BMWcarBulider implements carBulider {

    private Car car;

    public BMWcarBulider()
    {

        this.car = new Car();
    }

    @Override
    public void buildModel() {
        
        car.setModel("BMW");
    }

    @Override
    public void buildEngine() {

        car.setEngine("5X");
        
        
    }

    @Override
    public void buildWheel() {

        car.setWheel("4 inch");
        
        
    }

    @Override
    public void buildBody() {

        car.setBody("Black body");
        
        
    }

    public Car getCar()
    {
        return this.car;
    }
    
}
