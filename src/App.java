import java.io.IOException;
import java.util.*;

public class App {

    static Scanner s = new Scanner(System.in);
    static List soci = new ArrayList<Socio>();
    static int n_soci = 0;
    static List torneo = new ArrayList<Incontro>();
    static int n_partitte = 0;
    static List giocatori = new ArrayList<Giocatore>();
    static int n_giocatori = 0;
    static String banner="banner.txt";


    public static void main(String[] args)throws IOException {
       
        boolean T=true;
        int S;

        while(T){

            ConsoleTools.clearScreen();
            ConsoleTools.printAsciiFromFile(banner);

            System.out.print("Opzioni:\n1)Crea Socio\n2)Crea Giocatore\n3)Crea Squadra\n4)Crea Torneo\n5)Gioca Torneo\n6)Esci\n>>");
            S = s.nextInt();


            switch (S) {

                case 1:{
                    
                    break;

                }

                default:{
                 
                    break;

                }
            }


        }

    }


}
