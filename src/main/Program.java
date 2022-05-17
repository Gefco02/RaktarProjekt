
package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Collections;
import modell.Elelmiszer;
import modell.Konzerv;
import modell.Raktar;


public class Program {

    public static void main(String[] args) {

        Raktar r = new Raktar();
        r.felvesz(new Konzerv("Löncshús","Adidas",LocalDate.of(2023, 1, 13),"Nagyon finom"));
        r.felvesz(new Konzerv("Lábszár","Globus","Nagyon finom","recept.txt"));
        
//        System.out.println("Módosíthatatlan lista visszaadás");
//        System.out.println(r.getModosithatatlan()+"\n");
//        
//        
//        System.out.println("Rendezés név szerint");
//        Collections.sort(r.getElelmiszerek(), Elelmiszer.nevRendezes());
//        System.out.println(r.getModosithatatlan()+"\n");
//        
//        
//        System.out.println("Rendezés gyártó szerint");
//        Collections.sort(r.getElelmiszerek(), Elelmiszer.gyartoRendezes());
//        System.out.println(r.getModosithatatlan()+"\n");
        
        
        System.out.println("Mentés és beolvasás");
        ment(r);
        r=null;
        r=beolvas();
        System.out.println(r.getModosithatatlan());
        
        
        
        
        
        
    }
    private static void ment(Raktar raktar) {
        try {
            FileOutputStream fajlKi = new FileOutputStream("raktar.bin");
            ObjectOutputStream objKi = new ObjectOutputStream(fajlKi);
            objKi.writeObject(raktar);
            objKi.close();
        } catch (FileNotFoundException ex) {
            System.err.println(ex);
        } catch (IOException ex) {
            System.err.println(ex);
        }

    }
    
    
    private static Raktar beolvas() {
        Raktar raktar = null;
        try {
            raktar = (Raktar) new ObjectInputStream(new FileInputStream("raktar.bin")).readObject();
        } catch (FileNotFoundException ex) {
            System.err.println(ex);
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex);
        } finally {
            return raktar;
        }
    }
}
