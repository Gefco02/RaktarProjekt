/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author vizsgaszf
 */
public class Raktar {
    private ArrayList<Elelmiszer> elelmiszerek;

    
    public Raktar() {
        elelmiszerek = new ArrayList<>();
    }

    public List<Elelmiszer> getModosithatatlan() {
        return Collections.unmodifiableList(elelmiszerek);
    }

    public ArrayList<Elelmiszer> getElelmiszerek() {
        return elelmiszerek;
    }
    public void felvesz(Elelmiszer ujElelmiszer){
        this.elelmiszerek.add(ujElelmiszer);
    }
}
