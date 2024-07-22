package animals.birds;

import animals.Animal;

public class Bird extends Animal {
    private String featherColor;

    @Override
    public void move() {
        System.out.println("Flying");
    }

    @Override
    public void eat() {
        System.out.println("Eating worms");
    }

    @Override
    public void emitSound() {
        System.out.println("animals.birds.Bird sound");
    }

    public void makeNest(){
        System.out.println("Built a nest");
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }
}
