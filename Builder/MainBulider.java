package Builder;

public class MainBulider {

    public static void main(String[] args) {
        
        carBulider bmw = new BMWcarBulider();
        CarFactory bmwcar = new CarFactory(bmw);

        bmwcar.buildCar();

        Car car = bmwcar.getCar();
        System.out.println(car);

    }
    
}
