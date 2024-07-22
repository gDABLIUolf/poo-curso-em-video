public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        Student student = new Student();
        Professor professor = new Professor();
        Worker worker = new Worker();

        person.setName("Pedro");
        person.setAge(23);
        person.setGender("M");

        student.setName("Maria");
        student.setCourse("IT");
        student.setAge(23);
        student.setGender("M");

        professor.setName("João");
        professor.setSalary(7000.00);

        worker.setName("Gabriel");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(professor.toString());
        System.out.println(worker.toString());
    }
}