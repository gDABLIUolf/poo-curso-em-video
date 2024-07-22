public class Technician extends Student{
    private String professionalRegistration;

    public void practice(){
        System.out.println("Practice");
    }

    public void setProfessionalRegistration(String professionalRegistration){
        this.professionalRegistration = professionalRegistration;
    }
    public String getProfessionalRegistration(){
        return professionalRegistration;
    }
}
