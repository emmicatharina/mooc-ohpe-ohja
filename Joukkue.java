
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emmisulander
 */
public class Joukkue implements Comparable<Joukkue> {

    private String nimi;
    private int voitot;
    private int haviot;
    private int tasapelit;

    public Joukkue(String nimi) {
        this.nimi = nimi;
        this.voitot = 0;
        this.haviot = 0;
        this.tasapelit = 0;
    }

    public void voita() {
        this.voitot++;
    }
    
    public void havia() {
        this.haviot++;
    }
    
    public void tasapeli() {
        this.tasapelit++;
    }
    
    public String getNimi() {
        return this.nimi;
    }

    public int getVoitot() {
        return this.voitot;
    }

    public int getHaviot() {
        return this.haviot;
    }

    public int getTasapelit() {
        return this.tasapelit;
    }

    @Override
    public String toString() {
        return this.nimi + " " + this.voitot + " " + this.tasapelit + " " + 
                this.haviot + " " + (this.voitot * 3 + this.tasapelit);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nimi);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (obj == null) {
            return false;
        }
        
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final Joukkue other = (Joukkue) obj;
        
        if (other.getNimi().equals(this.nimi)) {
            return true;
        }
        
        return false;
    }
    
    @Override
    public int compareTo(Joukkue toinen) {
        return toinen.getVoitot() - this.getVoitot();
    }
    
}
