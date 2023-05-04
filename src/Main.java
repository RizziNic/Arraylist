import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        String s;
        ArrayList<String> parole = new ArrayList<>();

        try{
            FileReader f =new FileReader("Listaparole.txt");
            BufferedReader b = new BufferedReader(f);

            FileWriter fout = new FileWriter("output.txt");

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

            for (String i : parole) {
                fout.write(i + "\n");
            }
            fout.close();


        }catch(Exception e){

        }
    }
}