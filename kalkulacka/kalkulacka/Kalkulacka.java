public class Kalkulacka {
    private double vysledok;
    
    public Kalkulacka() {
        this.vysledok = 0;
    }
    
    public void zadajCislo(double hodnota) {
        this.vysledok = hodnota;
    }
    
    public void pripocitaj(double hodnota) {
        this.vysledok = this.vysledok + hodnota;
    }
    
    public void odpocitaj(double hodnota) {
        this.vysledok = this.vysledok - hodnota;
    }
    
    public void vynasob(double hodnota) {
        this.vysledok = this.vysledok * hodnota;
    }
    
    public void vydel(double hodnota) {
        if (hodnota != 0) {
            this.vysledok = this.vysledok / hodnota;
        } else {
            System.out.println("ERROR: delenie nulou");
        }
    }
    
    public void druhaMocnina() {
        this.vysledok = this.vysledok * this.vysledok;
    }
    
    public void mocnina(int n) {
        double medzivysledok = 1;
        
        for (int i = 0; i < n; i++) {
            medzivysledok = this.vysledok * medzivysledok;
        }
        
        this.vysledok = medzivysledok;
    }
    
    public void faktorial() {
        double medzivysledok = 1;
        
        /*for (int i = (int)this.vysledok; i >= 1; i--) {
            
        }*/
        
        for (int i = 1; i <= this.vysledok; i++) {
            medzivysledok = medzivysledok * i;
        }
        
        this.vysledok = medzivysledok;
    }
    
    public double getVysledok() {
        return this.vysledok;
    }
}
