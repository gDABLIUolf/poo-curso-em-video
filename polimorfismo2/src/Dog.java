public class Dog extends Wolf{
    @Override
    public void emitSound(){
        System.out.println("Au au au au au au au au au au");
    }
    public void react(String phrase){
        if (phrase.equals("Food") || phrase.equals("Hi")){
            System.out.println("wag tail and bark");
        } else {
            System.out.println("growl");
        }
    }
    public void react(int hour, int minute){
        if (hour < 12){
            System.out.println("Wag tail");
        } else if (hour >= 18) {
            System.out.println("Ignore");
        } else {
            System.out.println("Wag tail and bark");
        }
    }
    public void react(boolean owner){
        if (owner){
            System.out.println("Wag tail");
        } else {
            System.out.println("growl and bark");
        }
    }
    public void react(int age, double weight) {
        if (age < 5){
            if (weight<10){
                System.out.println("Wag tail");
            } else {
                System.out.println("bark");
            }
        } else {
            if (weight < 10){
                System.out.println("growl");
            } else {
                System.out.println("Ignore");
            }
        }
    }
}
