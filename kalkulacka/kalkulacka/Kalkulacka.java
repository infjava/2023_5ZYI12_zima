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
        double medzivysledok = this.vysledok;
        
        // n - 1 pouzivam pre to, lebo algoritmus robi x nasobeni
        // a kedze potrebujem n - 1 nasobeni vysledku, tak musim mat
        // x = n - 1
        for (int i = 0; i < n - 1; i++) {
            this.vysledok = this.vysledok * medzivysledok;
        }
    }
    
    public double getVysledok() {
        return this.vysledok;
    }
}
