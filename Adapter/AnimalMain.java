package Adapter;

public class AnimalMain {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        Reptiles sneak = new Sneak();

        Reptiles animalAdapter = new AnimalAdapter(wolf);

        wolf.eat();
        wolf.run();

        sneak.crawling();

        animalAdapter.crawling();

    }
    
}
