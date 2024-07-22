public class Luta {
    private Fighter challenged;
    private Fighter challenger;
    private int rounds;
    private boolean approved;

    private Fighter getChallenged() {
        return challenged;
    }

    private void setChallenged(Fighter challenged) {
        this.challenged = challenged;
    }

    private Fighter getChallenger() {
        return challenger;
    }

    private void setChallenger(Fighter challenger) {
        this.challenger = challenger;
    }

    private int getRounds() {
        return rounds;
    }

    private void setRounds(int rounds) {
        this.rounds = rounds;
    }

    private boolean isApproved() {
        return approved;
    }

    private void setApproved(boolean approved) {
        this.approved = approved;
    }

    public void scheduleFight(Fighter fighter1, Fighter fighter2){
        if (fighter1.getCategory().equals(fighter2.getCategory()) && fighter1 != fighter2){
            this.setApproved(true);
            this.setChallenged(fighter1);
            this.setChallenger(fighter2);
        } else {
            System.out.println("Fighters don't have the same category");
            this.setApproved(false);
            this.setChallenged(null);
            this.setChallenger(null);
        }
    }

    public void fight(){
        if (isApproved()){
            getChallenged().present();
            getChallenger().present();
            int winner =(int) (Math.random() * (2+1));
            switch (winner){
                case 0: // draw
                    System.out.println("-------------------------");
                    System.out.println("The fight ended in a draw");
                    this.getChallenger().draw();
                    this.getChallenged().draw();
                    break;
                case 1: // challenged won
                    System.out.println("-------------------------");
                    System.out.println(this.getChallenged().getName() + " won the fight");
                    this.getChallenger().loseFight();
                    this.getChallenged().winFight();
                    break;
                case 2: // challenger won
                    System.out.println("-------------------------");
                    System.out.println(this.getChallenger().getName() + " won the fight");
                    this.getChallenger().winFight();
                    this.getChallenged().loseFight();
                    break;
            }
        } else{
            System.out.println("This fight is not approved");
        }
    }
}
