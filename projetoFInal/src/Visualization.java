public class Visualization {
    private Grasshopper viewer;
    private Video video;

    public Visualization(Grasshopper viewer, Video video) {
        this.viewer = viewer;
        this.video = video;
        this.viewer.setTotalWatched(viewer.getTotalWatched()+1);
        this.video.setViews(video.getViews()+1);
    }

    public void rate(){
        this.video.setRating(5);

    }

    public void rate(int rating){
        this.video.setRating(rating);
    }

    public void rate(double percentage){
        int total = 0;
        if (percentage <= 20){
            total = 3;
        } else if (percentage <= 50){
            total = 5;
        } else if (percentage <= 90){
            total = 8;
        } else {
            total = 10;
        }
        this.video.setRating(total);
    }
    public Grasshopper getViewer() {
        return viewer;
    }

    public void setViewer(Grasshopper viewer) {
        this.viewer = viewer;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "Visualization{" +
                "viewer=" + viewer +
                ", video=" + video +
                '}';
    }
}
