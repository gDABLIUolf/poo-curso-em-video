public class Pen {
    private String model;
    private double tip;
    private String color;
    private boolean cap;

    public Pen(String model, double tip, String color){
        this.color = color;
        this.model = model;
        this.tip = tip;
        this.toCap();
    }

    public String getModel(){
        return this.model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public double getTip(){
        return this.tip;
    }

    public void setTip(double tip){
        this.tip = tip;
    }

    public void toCap(){
        this.cap = true;
    }

    public void uncap(){
        this.cap = false;
    }

    public void status(){
        System.out.println("About this pen: ");
        System.out.println("Model: " + this.model);
        System.out.println("Tip: " + this.tip);
        System.out.println("Color: " + this.color);
        System.out.println("Cap: " + this.cap);
    }
}
