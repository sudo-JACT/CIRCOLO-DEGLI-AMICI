import java.io.IOException;
import java.util.*;

public class App {

    static Scanner s = new Scanner(System.in);
    static Random rand = new Random();
    static int upperbound = 11; //! perchè random ritorna un numero tra 0 e massimo-1
    static List soci = new ArrayList<Socio>();
    static int n_soci = 0;
    static List torneo = new ArrayList<Incontro>();
    static int n_partite = 0;
    static List giocatori = new ArrayList<Giocatore>();
    static int n_giocatori = 0;
    static String banner="banner.txt";


    public static void createSocio()throws IOException{

        String name, surname;
        Socio so;

        

        ConsoleTools.clearScreen();
        ConsoleTools.printAsciiFromFile(banner);
        System.out.print("Nome >>");
        name = s.next();
        System.out.print("Cognome >>");
        surname = s.next();

        so = new Socio(name, surname);

        soci.add(so);
        n_soci++;

        System.out.println(so.getName() + " " + so.getSurname() + " aggiunto con successo");
        ConsoleTools.w();
            
        


    }


    public static void createGiocatore()throws IOException{

        int S, ind;
        String name, surname;
        Socio so;
        Giocatore gi;
        boolean T=true;

        while (T) {

            ConsoleTools.clearScreen();
            ConsoleTools.printAsciiFromFile(banner);
            System.out.print("Opzioni:\n1)Crea Giocatore da 0\n2)Crea Giocatore da Socio\n3)Esci\n>>");
            S = s.nextInt();

            switch (S) {

                case 1:{
                    
                    System.out.print("Nome >>");
                    name = s.next();
                    System.out.print("Cognome >> "); 
                    surname = s.next();

                    so = new Socio(name, surname);
                    soci.add(so);
                    gi = new Giocatore(so);
                    giocatori.add(gi);
                    n_soci++;
                    n_giocatori++;

                    System.out.println(so.getName() + " " + so.getSurname() + " aggiunto con successo");

                    break;

                }

                case 2:{

                    for(int i=0; i < n_soci; i++){

                        so = (Socio) soci.get(i);
                        System.out.println((i+1) + ")" + so.getName() + " " + so.getSurname());

                    }

                    System.out.print("Socio numero >>");
                    ind = s.nextInt();
                    ind--;

                    if(ind > n_soci || ind < 0){

                        System.out.println("Scelta non valida");

                    }else{

                        gi = new Giocatore((Socio) soci.get(ind));
                        giocatori.add(gi);
                        n_giocatori++;

                        System.out.println(gi.getName() + " " + gi.getSurname() + " aggiunto con successo");

                    }

                }

                case 3:{

                    T = false;
                    break;

                }

                default:{

                    System.out.println("Scelta non valida");
                    break;

                }
            }

            ConsoleTools.w();
            
        }

    }

    public static void createGame()throws IOException{

        int ind1, ind2;
        boolean T=true;
        Incontro ii;


        ConsoleTools.clearScreen();
        ConsoleTools.printAsciiFromFile(banner);

        showGiocatori();

        System.out.print("Primo Giocatore >>");
        ind1 = s.nextInt();
        ind1--;

        System.out.print("Secondo Giocatore >>");
        ind2 = s.nextInt();
        ind2--;

        if(ind1 == ind2 || ind1 > n_giocatori || ind1 < 0 || ind2 > n_giocatori || ind2 < 0){

            System.out.println("Scelta non valida");
            ConsoleTools.w();

            createGame();

        }else{

            ii = new Incontro((Giocatore) giocatori.get(ind1), (Giocatore) giocatori.get(ind2));
            torneo.add(ii);
            n_partite++;
            System.out.println("Partita creata con successo");

            
        }

        ConsoleTools.w();

    }

    public static void playGames(){

        for(int i=0; i < n_partite; i++){

            Incontro ii = (Incontro) torneo.get(i);
            int p1 = rand.nextInt(upperbound), p2 = rand.nextInt(upperbound);

            ii.play(p1, p2); 
            System.out.println(ii.toString());

        }

        ConsoleTools.w();
        
    }

    public static void showSoci(){


        if(n_soci > 0){

            for(int i=0; i < n_soci; i++){

                Socio so = (Socio) soci.get(i);
                System.out.println((i+1) + ")" + so.getName() + " " + so.getSurname());

            }

        }else{

            System.out.println("Ancora nessun Socio");

        }


    }


    public static void showGiocatori(){


        if(n_giocatori > 0){

            for(int i=0; i < n_giocatori; i++){

                Giocatore go = (Giocatore) giocatori.get(i);
                System.out.println((i+1) + ")" + go.getName() + " " + go.getSurname());

            }

        }else{

            System.out.println("Ancora nessun Giocatore");

        }
        

    }


    public static void main(String[] args)throws IOException {
       
        boolean T=true;
        int S;

        while(T){

            ConsoleTools.clearScreen();
            ConsoleTools.printAsciiFromFile(banner);

            System.out.print("Opzioni:\n1)Crea Socio (Soci: " + n_soci + ")\n2)Crea Giocatore (Giocatori: " + n_giocatori + ")\n3)Crea Partita (Partite: " + n_partite + ")\n4)Gioca Torneo\n5)Show Soci\n6)Show Giocatori\n7)Esci\n>>");
            S = s.nextInt();


            switch (S) {

                case 1:{

                    createSocio();
                    
                    break;

                }


                case 2:{

                    createGiocatore();
                    break;

                }


                case 3:{

                    createGame();

                    break;

                }


                case 4:{

                    playGames();

                    break;

                }


                case 5:{

                    showSoci();
                    ConsoleTools.w();
                    break;

                }

                case 6:{

                    showGiocatori();
                    ConsoleTools.w();
                    break;

                }


                case 7:{

                    T = false;
                    break;

                } 

                default:{

                    System.out.println("Scelta non valida");
                 
                    break;

                }
            }


        }

    }


}
