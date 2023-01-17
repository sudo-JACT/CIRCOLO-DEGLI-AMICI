public class Giocatore extends Socio{

    private int score;


    public Giocatore(String n, String s){

        super(n, s);

        this.score = 0;

    }


    public Giocatore(Socio s){

        super(s.getName(), s.getSurname());

        this.score = 0;

    }


    public int getScore(){
        
        return this.score;

    }

    public int setScore(int s){

        this.score = s;

        return this.score;

    }

    public int addScore(int s){

        this.score += s;

        return this.score;

    }

    @Override
    public String toString() {
       
        return this.name + " " + this.surname + ": " + this.score;

    }
    
}
