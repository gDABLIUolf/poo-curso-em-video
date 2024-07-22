public class Student extends Person{
    private int enrollmentNumber;
    private String course;
    
    public void payMonthlyFee(){
        System.out.println("Pay Monthly Fee");
    }

    public int getEnrollmentNumber() {
        return enrollmentNumber;
    }

    public void setEnrollmentNumber(int enrollmentNumber) {
        this.enrollmentNumber = enrollmentNumber;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
