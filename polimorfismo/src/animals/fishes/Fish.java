package animals.fishes;

import animals.Animal;

public class Fish extends Animal {
    private String scaleColor;

    @Override
    public void move() {
        System.out.println("Swimming");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void emitSound() {
        System.out.println("Fishes do not emits sound");
    }

    public void releaseBubbles(){
        System.out.println("Released a bubble");
    }

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }
}
