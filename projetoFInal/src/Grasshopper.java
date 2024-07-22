public class Grasshopper extends Person{
    private String login;
    private int totalWatched;

    public Grasshopper(String name, int age, String gender, String login) {
        super(name, age, gender);
        this.login = login;
        this.totalWatched = 0;
    }

    public void oneMoreWatched(){
        setTotalWatched(getTotalWatched() + 1);
    }

    public int getTotalWatched() {
        return totalWatched;
    }

    public void setTotalWatched(int totalWatched) {
        this.totalWatched = totalWatched;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "Grasshopper{" + super.toString() +
                "login='" + login + '\'' +
                ", totalWatched=" + totalWatched +
                '}';
    }
}
