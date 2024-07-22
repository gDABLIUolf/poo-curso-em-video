public class Main {
    public static void main(String[] args) {
        RemoteController rc = new RemoteController();
        rc.turnOn();
        rc.play();
        rc.openMenu();
        rc.closeMenu();
    }
}
