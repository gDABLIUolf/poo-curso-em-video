public class Main {
    public static void main(String[] args){
        Fighter[] fighters = new Fighter[6];

        fighters[0] = new Fighter("Pretty boy", "France", 31, 1.75, 68.9,
                11, 2, 1);
        fighters[1] = new Fighter("Putscript", "Brazil", 29, 1.68, 57.8,
                14, 2, 3);
        fighters[2] = new Fighter("Snapshadow", "EUA", 35, 1.65, 80.9,
                12, 2, 1);
        fighters[3] = new Fighter("Dead Code", "Australia", 28, 1.93, 81.6,
                13, 0, 2);
        fighters[4] = new Fighter("Ufocobol", "Brazil", 37, 1.70, 119.3,
                5, 4, 3);
        fighters[5] = new Fighter("Nerdaard", "EUA", 30, 1.81, 105.7,
                12, 2, 4);

        Luta UEC01 = new Luta();
        UEC01.scheduleFight(fighters[5], fighters[1]);
        UEC01.fight();
        fighters[0].status();
        fighters[1].status();
    }
}
