package animals.mammals;

import animals.Animal;

public class Mammal extends Animal {
    private String furColor;

    @Override
    public void move() {
        System.out.println("Running");
    }

    @Override
    public void eat() {
        System.out.println("Suckling");
    }

    @Override
    public void emitSound() {
        System.out.println("Mammal sound");
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
}
