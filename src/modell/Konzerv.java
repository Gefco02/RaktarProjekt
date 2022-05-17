/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

/**
 *
 * @author vizsgaszf
 */
public class Konzerv extends Elelmiszer {

    private String leiras;
    private String receptAjanlas;

    public Konzerv(String nev, String gyarto, String leiras, String receptAjanlas) {
        super(nev, gyarto);
        this.leiras = leiras;
        this.receptAjanlas = receptAjanlas;
    }
    public Konzerv(String nev, String gyarto, LocalDate datum, String leiras){
        super(nev,gyarto);
        this.leiras=leiras;
    }
    
    private void receptetMutat() {
        Path path = Paths.get(this.receptAjanlas);
        boolean letezik = Files.exists(path);
        if(letezik){
            System.out.println("Létező recept");
        }else{
            System.out.println("Nem létezik a recept");
        }

    }

    @Override
    public String toString() {
        return super.toString()+""+"Konzerv{" + "leiras=" + leiras + ", receptAjanlas=" + receptAjanlas + '}'+"\n";
    }

    @Override
    public int compareTo(Elelmiszer o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
