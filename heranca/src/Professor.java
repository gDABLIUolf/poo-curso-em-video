public class Professor extends Person{
    private String specialisation;
    private double salary;

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public double getSalary() {
        return salary;
    }

    public void getRaise(double raise){
        setSalary(getSalary()+raise);
    }
}
