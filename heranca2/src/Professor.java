public class Professor extends Person {
    private String specialty;
    private double salary;

    public void getRaise(double raise){
        setSalary(getSalary() + raise);
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
