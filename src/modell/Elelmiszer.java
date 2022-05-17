/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author vizsgaszf
 */
public abstract class Elelmiszer implements Comparable<Elelmiszer>, Serializable {
    private String nev;
    private String gyarto;
    private LocalDate datum;

    public Elelmiszer(String nev, String gyarto, LocalDate datum) {
        this.nev = nev;
        this.gyarto = gyarto;
        this.datum = datum;
    }

    public Elelmiszer(String nev, String gyarto) {
        this(nev, gyarto, LocalDate.now().plusYears(1));
    }

    public String getNev() {
        return nev;
    }

    public String getGyarto() {
        return gyarto;
    }
    public static NevComparator nevRendezes() {
        return new NevComparator();
    }
    public static GyartoComparator gyartoRendezes() {
        return new GyartoComparator();
    }

    @Override
    public String toString() {
        return "Elelmiszer{" + "nev=" + nev + ", gyarto=" + gyarto + ", datum=" + datum + '}';
    }
    
}
