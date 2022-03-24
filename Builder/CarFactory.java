package Builder;

public class CarFactory {

    private carBulider carBulider;

    public CarFactory(carBulider carBulider)
    {
        this.carBulider = carBulider;
    }

    public Car getCar()
    {
        return this.carBulider.getCar();
    }

    public void buildCar()
    {
        this.carBulider.buildModel();
        this.carBulider.buildEngine();
        this.carBulider.buildWheel();
        this.carBulider.buildBody();
    }

    
}
