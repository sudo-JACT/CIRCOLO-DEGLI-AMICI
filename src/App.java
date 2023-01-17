public class App {
    

    public static void main(String[] args) {
        
        Socio s1 = new Socio("Mario", "Rossi");
        Socio s2 = new Socio("Luigi", "Bianchi");

        Giocatore g1 = new Giocatore(s1);
        Giocatore g2 = new Giocatore("Luca", "Verdi");

        Incontro i1 = new Incontro(g1, g2);


        System.out.println(s1.toString() + "\n" + s2.toString() + "\n" + g1.toString() + "\n" + g2.toString() + "\n" + i1.toString());
            
        i1.play(10, 5);

        System.out.println(i1.toString());

    }


}
