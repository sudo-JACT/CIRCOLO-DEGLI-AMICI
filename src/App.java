import java.io.IOException;
import java.util.*;

public class App {

    static Scanner s = new Scanner(System.in);
    static List soci = new ArrayList<Socio>();
    static int n_soci = 0;
    static List torneo = new ArrayList<Incontro>();
    static int n_partite = 0;
    static List giocatori = new ArrayList<Giocatore>();
    static int n_giocatori = 0;
    static String banner="banner.txt";


    public static void createSocio()throws IOException{

        boolean T=true;
        int S;

        while (T) {

            ConsoleTools.clearScreen();
            ConsoleTools.printAsciiFromFile(banner);
            
        }


    }


    public static void main(String[] args)throws IOException {
       
        boolean T=true;
        int S;

        while(T){

            ConsoleTools.clearScreen();
            ConsoleTools.printAsciiFromFile(banner);

            System.out.print("Opzioni:\n1)Crea Socio (Soci: " + n_soci + ")\n2)Crea Giocatore (Giocatori: " + n_giocatori + ")\n3)Crea Partita (Partite: " + n_partite + ")\n4)Gioca Torneo\n5)Esci\n>>");
            S = s.nextInt();


            switch (S) {

                case 1:{

                    createSocio();
                    
                    break;

                }

                default:{
                 
                    break;

                }
            }


        }

    }


}
