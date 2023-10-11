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
    
    public double getVysledok() {
        return this.vysledok;
    }
}
