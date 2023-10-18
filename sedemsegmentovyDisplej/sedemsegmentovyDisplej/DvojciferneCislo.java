public class DvojciferneCislo {
    private Cislica desiatky;
    private Cislica jednotky;
    
    public DvojciferneCislo(int cislo) {
        this.desiatky = new Cislica(0, 0, cislo / 10);
        this.jednotky = new Cislica(65, 0, cislo % 10);
    }
    
    public void zmenHodnotu(int cislo) {
        this.desiatky.zmenHodnotu(cislo / 10);
        this.jednotky.zmenHodnotu(cislo % 10);
    }
}
