package animals;

public abstract class Animal {
    protected double weight;
    protected int age;
    protected int limbs;

    public abstract void move();
    public abstract void eat();
    public abstract void emitSound();

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLimbs() {
        return limbs;
    }

    public void setLimbs(int limbs) {
        this.limbs = limbs;
    }
}
