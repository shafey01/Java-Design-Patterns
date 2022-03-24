package Builder;

public class AudiCarBulider implements carBulider {

    private Car car;

    public AudiCarBulider()
    {

        this.car = new Car();
    }

    @Override
    public void buildModel() {
        
        car.setModel("Audi");
    }

    @Override
    public void buildEngine() {

        car.setEngine("7X");
        
        
    }

    @Override
    public void buildWheel() {

        car.setWheel("5 inch");
        
        
    }

    @Override
    public void buildBody() {

        car.setBody("White body");
        
        
    }

    public Car getCar()
    {
        return this.car;
    }
    
}
