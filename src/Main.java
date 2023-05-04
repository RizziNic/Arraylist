import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        String s;
        ArrayList<String> parole = new ArrayList<>();

        try{
            //BufferedReader i = new BufferedReader(new FileReader("Lettore.txt"));
            //BufferedWriter o = new BufferedWriter(new FileWriter("Scrittore.txt"));

            //FileReader i = new FileReader("Listaparole.txt");
            //FileWriter o = new FileWriter("scrivi.txt");

            FileReader f =new FileReader("Listaparole.txt");
            BufferedReader b = new BufferedReader(f);

            FileWriter fout = new FileWriter("scrittore.txt");
            BufferedWriter bout = new BufferedWriter(fout);
            //int i = 0;

            while(true) {
                s = b.readLine();
                if(s==null)
                    break;
                System.out.println(s);
                parole.add(s);
            }
            System.out.println(parole);
            Collections.sort(parole);
            System.out.println(parole);

            while (true){

            }

        }catch(Exception e){

        }
    }
}