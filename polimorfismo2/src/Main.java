public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.react("Hi");
        dog.react(11,45);
        dog.react(21, 0);
        dog.react(true);
        dog.react(false);
        dog.react(2,12.5);
        dog.react(17,4.5);
    }
}