public class Student extends Person{
    private int enrollmentNumber;
    private String course;

    public void setEnrollmentNumber(int enrollmentNumber){
        this.enrollmentNumber = enrollmentNumber;
    }

    public int getEnrollmentNumber(){
        return this.enrollmentNumber;
    }

    public void setCourse(String course){
        this.course = course;
    }

    public String getCourse(){
        return this.course;
    }

    public void cancelEnrollment(){
        this.enrollmentNumber = 0;
        System.out.println("Enrollment Cancelled");
    }
}
