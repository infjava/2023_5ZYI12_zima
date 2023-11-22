public class Vektor {
    private double[] vektor;
    
    public Vektor(double[] vektor) {
        this.vektor = vektor;
    }
    
    public double skalarnySucin(Vektor vektorB) {
        // doplnit kod
        return 0;
    }
    
    public double getPrvok(int index) {
        return this.vektor[index];
    }
    
    public int getDlzka() {
        return this.vektor.length;
    }
    
    public void vypisVektor() {
        // osetrit ciarku na konci
        System.out.print("(");
        for (int i = 0; i < this.getDlzka(); i++) {
            System.out.format("%.2f", this.getPrvok(i));
            if (i < this.getDlzka() - 1) {
                System.out.format("; ");
            }
        }
        System.out.println(")");
    }
}
