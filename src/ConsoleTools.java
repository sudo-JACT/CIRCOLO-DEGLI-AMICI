import java.io.*;

public class ConsoleTools {


    public static void printAsciiFromFile(String filename)throws IOException{

        boolean T = false;
        String line;
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);

        while (!T) {

            line = br.readLine();

            if(line != null){
                
                System.out.println(line);

            }else{

                T = true;

            }
            
        }
    
    }

    public static void w(){

        Console con = System.console();
        con.readLine();

    }

    public static void clearScreen(){

        System.out.print("\033[H\033[2J");
        System.out.flush();

    }

}
