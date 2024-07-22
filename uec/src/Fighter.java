public class Fighter {
    private String name;
    private String nationality;
    private int age;
    private double height;
    private double weight;
    private String category;
    private int victories;
    private int losses;
    private int draws;

    public Fighter(String name, String nationality, int age, double height, double weight,
                   int victories, int losses, int draws) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.height = height;
        this.setWeight(weight);
        this.victories = victories;
        this.losses = losses;
        this.draws = draws;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    private void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    private void setWeight(double weight) {
        this.weight = weight;
        this.setCategory();
    }

    public String getCategory() {
        return category;
    }

    private void setCategory() {
        if (this.getWeight() < 52.2){
            this.category = "Invalid";
        } else if (this.getWeight() <= 70.3){
            this.category = "light weight";
        } else if (this.getWeight() <= 83.9){
            this.category = "medium weight";
        } else if (this.getWeight() <= 120.2){
            this.category = "heavy weight";
        } else {
            this.category = "invalid";
        }
    }

    public int getVictories() {
        return victories;
    }

    private void setVictories(int victories) {
        this.victories = victories;
    }

    public int getLosses() {
        return losses;
    }

    private void setLosses(int losses) {
        this.losses = losses;
    }

    public int getDraws() {
        return draws;
    }

    private void setDraws(int draws) {
        this.draws = draws;
    }

    public void present(){
        System.out.println("-------------------------");
        System.out.println("Fighter: " + getName());
        System.out.println("From: " + getNationality());
        System.out.println(getAge() + " Years old");
        System.out.println(getHeight() + " meters tall");
        System.out.println("weighting " + getWeight() + " kg");
        System.out.println("Won: " + getVictories() + " fights");
        System.out.println("Lost: " + getLosses());
        System.out.println("And tied: " + getDraws() + " fights");
    }

    public void status(){
        System.out.println("-------------------------");
        System.out.println(getName());
        System.out.println("Is a " + getCategory() + " fighter");
        System.out.println("With " + getVictories() + " victories");
        System.out.println(getLosses() + " losses");
        System.out.println("and " + getDraws() + " draws");
    }

    public void winFight(){
        this.setVictories(getVictories()+1);
    }

    public void loseFight(){
        this.setLosses(getLosses()+1);
    }

    public void draw(){
        this.setDraws(getDraws()+1);
    }
}