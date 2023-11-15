import java.util.ArrayList;

public class Skupina {
    private ArrayList<Osoba> osoby;
        
    public Skupina(String nazovSkupiny) {
        this.osoby = new ArrayList<Osoba>();
    }
    
    public void pridajObjektOsoba(Osoba novaOsoba) {
        this.osoby.add(novaOsoba);
    }
    
    public void pridajNovuOsobu(String noveMeno, String novePriezvisko) {
        this.osoby.add(new Osoba(noveMeno, novePriezvisko));
    }
    
    public boolean jeClenomSkupiny(Osoba hladanaOsoba) {
        /*for (Osoba osoba : this.osoby) {
            if (osoba == hladanaOsoba) {
                return true;
            }
        }
        return false;*/
        return this.osoby.contains(hladanaOsoba);
    }
        
    public int getPocetClenovSkupiny() {
        /*int pocet = 0;
        for (Osoba osoba : this.osoby) {
            pocet++;
        }
        return pocet;*/
        return this.osoby.size();
    }
        
    public void vypisClenovSkupinyFor() {
        for (int i = 0; i < this.osoby.size(); i++) {
            /*Osoba osoba = this.osoby.get(i);
            osoba.vypis();*/
            this.osoby.get(i).vypis();
        }
    }
        
    public void vypisClenovSkupinyWhile() {
        int i = 0;
        while (i < this.osoby.size()) {
            Osoba osoba = this.osoby.get(i);
            osoba.vypis();
            i++;
        }
    }
    
    public void vypisClenovSkupinyForEach() {
        for (Osoba osoba : this.osoby) {
            osoba.vypis();
        }
    }
        
    public void vypisClenovSkupinyDoWhile() {
        if (this.osoby.size() > 0) {
            int i = 0;
            do {
                Osoba osoba = this.osoby.get(i);
                osoba.vypis();
                i++;
            } while (i < this.osoby.size());
        }
    }
        
    public void odstranPodlaPoradia(int poradie) {
        this.osoby.remove(poradie);
    }
    
    public void odstranPodlaReferencie(Osoba osoba) {
        this.osoby.remove(osoba);
    }
    
    public void zrusSkupinu() {
        /*int pocet = this.osoby.size();
        for (int i = 0; i < pocet; i++) {
            this.osoby.remove(0);
        }*/
        /*while (!this.osoby.isEmpty()) {
            this.osoby.remove(0);
        }*/
        this.osoby.clear();
    }
}
