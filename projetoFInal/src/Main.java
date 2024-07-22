public class Main {
    public static void main(String[] args) {
        Video[] videos = new Video[3];
        videos[0] = new Video("Aula 01 POO");
        videos[1] = new Video("Aula 02 POO");
        videos[2] = new Video("Aula 03 POO");

        Grasshopper[] grasshoppers = new Grasshopper[2];
        grasshoppers[0] = new Grasshopper("Gabriel", 24, "M", "gwolf");
        grasshoppers[1] = new Grasshopper("Jubileu", 22 , "M", "juba");

        Visualization visualization1 = new Visualization(grasshoppers[0], videos[0]);
        visualization1.rate();
        System.out.println(visualization1.toString());
        Visualization visualization2 = new Visualization(grasshoppers[0], videos[1]);
        visualization2.rate(87.0);
        System.out.println(visualization2.toString());
        /*
        System.out.println(videos[0]);
        System.out.println(grasshoppers[0]);
        */
    }

}