import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Skupina {
    private ArrayList<Osoba> osoby;
    private String nazovSkupiny;
        
    public Skupina(String nazovSkupiny) {
        this.osoby = new ArrayList<Osoba>();
        this.nazovSkupiny = nazovSkupiny;
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
    
    public void zapisDoSuboru() throws IOException {
        File subor = new File(this.nazovSkupiny + ".txt");
        PrintWriter zapisovac = new PrintWriter(subor);
        
        for (Osoba osoba : this.osoby) {
            zapisovac.format("%s %s%n", osoba.getMeno(), osoba.getPriezvisko());
        }
        
        zapisovac.close();
    }
    
    public void nacitajZoSuboru() throws IOException {
        File subor = new File(this.nazovSkupiny + ".txt");
        Scanner citac = new Scanner(subor);
        
        this.osoby.clear();
        while (citac.hasNext()) {
            String meno = citac.next();
            String priezvisko = citac.next();
            
            this.osoby.add(new Osoba(meno, priezvisko));
        }
        
        citac.close();
    }
}
