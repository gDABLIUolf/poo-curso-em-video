public class Main {
    public static void main(String[] args) {
        /*
        Visitor person = new Visitor();

        person.setName("Pedro");
        person.setAge(22);
        person.setGender("M");

        System.out.println(person);
        */

        /*
        Student student = new Student();

        student.setName("John Doe");
        student.setEnrollmentNumber(1234);
        student.setCourse("IT");
        student.setAge(16);
        student.setGender("M");

        System.out.println(student);
         */

        ScholarshipHolder scholarshipHolder = new ScholarshipHolder();

        scholarshipHolder.setEnrollmentNumber(12345);
        scholarshipHolder.setName("Cláudio");
        scholarshipHolder.setScholarship(20.5);
        scholarshipHolder.setGender("M");
        scholarshipHolder.payMonthlyFee();
    }
}