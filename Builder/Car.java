package Builder;

public class Car implements Icar{

    private String model;
    private String engine;
    private String wheel;
    private String body;


    @Override
    public void setModel(String model) {
        this.model = model;
        
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
        
    }

    @Override
    public void setWheel(String wheel) {
        this.wheel = wheel;
        
    }

    @Override
    public void setBody(String body) {
        
        this.body = body;
    }
    
}
