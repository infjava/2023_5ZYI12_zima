public class Poloha {
    private int x;
    private int y;
    private Smer smer;
    
    public Poloha(int x, int y, Smer smer) {
        this.x = x;
        this.y = y;
        this.smer = smer;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public Smer getSmer() {
        return this.smer;
    }
    
    public Poloha getPosunutuPolohu(int krok, Smer smer) {
        return new Poloha(
            this.x + smer.getVektorX() * krok,
            this.y + smer.getVektorY() * krok,
            smer
        );
    }
}
