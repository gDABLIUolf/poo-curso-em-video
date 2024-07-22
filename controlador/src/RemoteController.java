public class RemoteController implements Controller {
    private int volume;
    private boolean on;
    private boolean playing;

    public RemoteController() {
        this.volume = 50;
        this.on = false;
        this.playing = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isOn() {
        return on;
    }

    private void setOn(boolean on) {
        this.on = on;
    }

    private boolean isPlaying() {
        return playing;
    }

    private void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public void turnOn(){
        this.setOn(true);
    }

    public void turnOff(){
        this.setOn(false);
    }

    public void openMenu() {
        if (isOn()) {
            System.out.println("----------Menu----------");
            System.out.println(this.isOn() ? "On" : "Off");
            System.out.println("Volume: " + this.getVolume());
            for (int i = 0; i < this.getVolume(); i += 10) {
                System.out.print("|");
            }
            System.out.println();
            System.out.println(this.isPlaying() ? "Playing" : "Paused");
        }
    }

    public void closeMenu(){
        if (isOn()){
            System.out.println("Closing Menu...");
        }
    }

    public void volumeUp(){
        if (this.isOn()) {
            this.setVolume(this.getVolume() + 5);
        }
    }

    public void volumeDown(){
        if (this.isOn()) {
            this.setVolume(this.getVolume() - 5);
        }
    }

    public void mute(){
        if (this.isOn() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    public void unmute(){
        if (this.isOn() && this.getVolume() == 0) {
            this.setVolume(0);
        }
    }

    public void play(){
        if (this.isOn() && !this.isPlaying()){
            this.setPlaying(true);
        }
    }

    public void pause(){
        if (this.isOn() && this.isPlaying()){
            this.setPlaying(false);
        }
    }
}