import fri.shapesge.Stvorec;

public class Policko {
    private Stvorec stvorec;
    private Lodka lodka;
    private boolean zasiahnute;
    
    public Policko(int x, int y, int velkost) {
        this.lodka = null;
        this.zasiahnute = false;
        
        this.stvorec = new Stvorec(x * (velkost + 1), y * (velkost + 1));
        
        this.stvorec.zmenStranu(velkost);
        
        this.prekresli();
        
        this.stvorec.zobraz();
    }
    
    public void priradLodku(Lodka lodka) {
        this.lodka = lodka;
        this.prekresli();
    }
    
    public void zasiahni() {
        this.zasiahnute = true;
        this.prekresli();
    }
    
    private void prekresli() {
        if (this.zasiahnute) {
            if (this.lodka == null) {
                this.stvorec.zmenFarbu("#00008B");
            } else {
                this.stvorec.zmenFarbu("red");
            }
        } else {
            this.stvorec.zmenFarbu("blue");
        }
    }
}
