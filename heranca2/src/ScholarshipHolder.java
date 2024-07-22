public class ScholarshipHolder extends Student {
    private double scholarship;

    public void renewScholarship(){

    };

    @Override
    public void payMonthlyFee() {
        System.out.println("Pay cheaper monthly fee");
    }

    public double getScholarship() {
        return scholarship;
    }

    public void setScholarship(double scholarship) {
        this.scholarship = scholarship;
    }

}
