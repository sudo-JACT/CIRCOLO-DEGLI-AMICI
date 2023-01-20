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
    public boolean equals(Object obj) {
       
        if(obj == null || !(obj instanceof Giocatore)){

            return false;

        }else{

            Giocatore g = (Giocatore) obj;

            if(this.name.equalsIgnoreCase(g.getName()) && this.surname.equalsIgnoreCase(g.getSurname()) && this.tessera == g.getTessera() && this.score == g.getScore()){

                return true;

            }else{

                return false;

            }

        }

    }

    @Override
    public String toString() {
       
        return this.name + " " + this.surname + ": " + this.score;

    }
    
}
