package animals.mammals;

public class Kangaroo extends Mammal {
    public void usePurse(){
        System.out.println("Use Purse");
    }

    @Override
    public void move(){
        System.out.println("Jumping");
    }
}
