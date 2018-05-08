package fransis.games.roulette;

public class Player {
    private String name;
    private long amount;

    public Player(String name, long amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName(){
        return new String(this.name);
    }

    public void add(long amount){
        this.amount += amount;
    }

    public boolean get(long amount){
        long delta = this.amount - amount;
        if(delta > 0){
            this.amount = delta;
            return true;
        }
        return false;
    }

}
