import fri.shapesge.Obrazok;

public class CastVlaku {
    private static final int VELKOST_POLICKA = 35;
    
    private Poloha poloha;
    private final Obrazok obrazok;
    
    private CastVlaku dalsiaCast;
    
    public CastVlaku(Poloha poloha, TypCastiVlaku typ) {
        this.poloha = poloha;
        this.obrazok = new Obrazok(typ.getSuborObrazka(), poloha.getX() * VELKOST_POLICKA, poloha.getY() * VELKOST_POLICKA);
        this.obrazok.zmenUhol(poloha.getSmer().getUhol());
        this.obrazok.zobraz();
        
        this.dalsiaCast = null;
    }
    
    public void setPoloha(Poloha poloha) {
        this.poloha = poloha;
        this.obrazok.zmenPolohu(poloha.getX() * VELKOST_POLICKA, poloha.getY() * VELKOST_POLICKA);
        this.obrazok.zmenUhol(poloha.getSmer().getUhol());
    }
    
    public Poloha getPoloha() {
        return this.poloha;
    }
    
    public void pripojCast(TypCastiVlaku typ) {
        if (this.dalsiaCast != null) {
            this.dalsiaCast.pripojCast(typ);
        } else {
            this.dalsiaCast = new CastVlaku(
                this.poloha.getPosunutuPolohu(-1, this.poloha.getSmer()),
                typ
            );
        }
    }
}
