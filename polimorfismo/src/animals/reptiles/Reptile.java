package animals.reptiles;

import animals.Animal;

public class Reptile extends Animal {
    private String scaleColor;

    @Override
    public void move() {
        System.out.println("Crawling");
    }

    @Override
    public void eat() {
        System.out.println("Eating veggies");
    }

    @Override
    public void emitSound() {
        System.out.println("animals.reptiles.Reptile sound");
    }

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }
}
