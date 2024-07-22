package animals.mammals;

public class Dog extends Mammal {
    public void buryBone(){
        System.out.println("Bone buried");
    }

    public void wagTail(){
        System.out.println("Wag Tail");
    }

    @Override
    public void emitSound(){
        System.out.println("Au au au au au au au au au au");
    }
}
