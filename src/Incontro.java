public class Incontro {

    private final Giocatore g1;
    private final Giocatore g2;
    private boolean played;


    public Incontro(Giocatore g1, Giocatore g2){

        this.g1 = g1;
        this.g2 = g2;
        this.played = false;

    }

    
    public Giocatore getGiocatore1(){

        return this.g1;

    }

    public Giocatore getGiocatore2(){

        return this.g2;

    }

    public boolean wasPlayed(){

        return this.played;

    }

    public int play(int p1, int p2){

        if(!this.played){

            if(p1 > p2){

                this.g1.addScore(3);
                this.played = true;

                return -1;

            }else if(p2 > p1){

                this.g2.addScore(3);
                this.played = true;

                return 1;

            }else{

                this.g1.addScore(1);
                this.g2.addScore(1);
                this.played = true;

                return 0;

            }


        }else{

            if(this.g1.getScore() > this.g2.getScore()){
        
                return -1;

            }else if(this.g2.getScore() > this.g1.getScore()){

                return 1;

            }else{

                return 0;

            }

        }

    }

    public int getWinner(){

        if(this.played){  

            if(this.g1.getScore() > this.g2.getScore()){

                return -1;

            }else if(this.g2.getScore() > this.g1.getScore()){

                return 1;

            }else{

                return 0;

            }

        }else{

            return 404;

        } 

    }


    @Override
    public boolean equals(Object obj) {
       
        if(obj == null || !(obj instanceof Incontro)){
            
            return false;

        }else{

            Incontro i = (Incontro) obj;

            return (this.g1.equals(i.getGiocatore1())) && (this.g2.equals(i.getGiocatore2())) && (this.played == i.played);
        
        }
    }


    @Override
    public String toString() {
        
        return this.g1.toString() + " VS " + this.g2.toString();

    }



}
