import fri.shapesge.Stvorec;

public class Policko {
    private Stvorec stvorec;
    private Lodka lodka;
    
    public Policko(int x, int y, int velkost) {
        this.lodka = null;
        
        this.stvorec = new Stvorec(x * (velkost + 1), y * (velkost + 1));
        
        this.stvorec.zmenStranu(velkost);
        
        this.prekresli();
        
        this.stvorec.zobraz();
    }
    
    public void priradLodku(Lodka lodka) {
        this.lodka = lodka;
    }
    
    private void prekresli() {
        this.stvorec.zmenFarbu("blue");
    }
}
