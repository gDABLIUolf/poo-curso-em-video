package animals;

import animals.birds.Bird;
import animals.fishes.Fish;
import animals.mammals.Dog;
import animals.mammals.Kangaroo;
import animals.mammals.Mammal;
import animals.reptiles.Reptile;

public class Main {
    public static void main(String[] args) {
        /*
        Reptile reptile = new Reptile();
        Fish fish = new Fish();
        Bird bird = new Bird();


        fish.setWeight(0.35);
        fish.setAge(1);
        fish.setLimbs(1);
        fish.move();
        fish.eat();
        fish.emitSound();
        fish.releaseBubbles();

        bird.setWeight(0.89);
        bird.setAge(2);
        bird.setLimbs(2);
        bird.move();
        bird.eat();
        bird.emitSound();
        bird.makeNest();
        */
        Mammal mammal = new Mammal();
        mammal.setWeight(85.3);
        mammal.setFurColor("Orange");
        mammal.setAge(2);
        mammal.setLimbs(4);
        mammal.move();
        mammal.eat();
        mammal.emitSound();

        Dog dog = new Dog();
        dog.setWeight(3.94);
        dog.setAge(5);
        dog.setLimbs(4);
        dog.move();
        dog.eat();
        dog.emitSound();
        dog.wagTail();

        Kangaroo kangaroo = new Kangaroo();
        kangaroo.setWeight(55.5);
        kangaroo.setAge(6);
        kangaroo.setLimbs(4);
        kangaroo.move();
        kangaroo.eat();
        kangaroo.emitSound();
        kangaroo.usePurse();
    }
}