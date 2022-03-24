package Adapter;

public class AnimalAdapter implements Reptiles {

    Ianimal animal;

    public AnimalAdapter (Ianimal animal)
    {
        this.animal = animal;
    }



    @Override
    public void crawling() {
        animal.run();
        
    }
    
}
