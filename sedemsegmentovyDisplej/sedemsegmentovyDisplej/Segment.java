public class Segment {
    private Obdlznik obdlznik;
    
    public Segment(int x, int y, boolean vertikalny) {
        this.obdlznik = new Obdlznik();
        
        this.obdlznik.posunZvisle(y - 50);
        this.obdlznik.posunVodorovne(x - 60);
        
        if (vertikalny) {
            this.obdlznik.zmenStrany(10, 40);
        } else {
            this.obdlznik.zmenStrany(40, 10);
        }
        
        this.obdlznik.zmenFarbu("black");
        this.obdlznik.zobraz();
    }
    
    public void rozsvietSa() {
        this.obdlznik.zmenFarbu("red");
    }
    
    public void zhasni() {
        this.obdlznik.zmenFarbu("black");
    }
}
