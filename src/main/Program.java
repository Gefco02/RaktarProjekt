
package main;

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
        System.out.println("Módosíthatatlan lista visszaadás");
        System.out.println(r.getModosithatatlan()+"\n");
        System.out.println("Rendezés név szerint");
        Collections.sort(r.getElelmiszerek(), Elelmiszer.nevRendezes());
        System.out.println(r.getModosithatatlan()+"\n");
        System.out.println("Rendezés gyártó szerint");
        Collections.sort(r.getElelmiszerek(), Elelmiszer.gyartoRendezes());
        System.out.println(r.getModosithatatlan()+"\n");
        
        
        
    }
    
}
