import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Hra {
    private Policko[][] hraciaPlocha;
    private Lodka[] lodky;
    
    public Hra(int velkostPolicka, String nazovMapy) throws IOException {
        Scanner citac = new Scanner(new File(nazovMapy));
        
        int sirka = citac.nextInt();
        int vyska = citac.nextInt();
        
        this.hraciaPlocha = new Policko[vyska][sirka];
        
        int pocetLodiek = citac.nextInt();
        
        this.lodky = new Lodka[pocetLodiek];
        
        for (int i = 0; i < pocetLodiek; i++) {
            this.lodky[i] = new Lodka();
        }
        
        for (int y = 0; y < vyska; y++) {
            for (int x = 0; x < sirka; x++) {
                this.hraciaPlocha[y][x] = new Policko(x, y, velkostPolicka);
                
                int cisloLodky = citac.nextInt();
                if (cisloLodky != 0) {
                    Lodka lodka = this.lodky[cisloLodky - 1];
                    this.hraciaPlocha[y][x].priradLodku(lodka);
                }
            }
        }
        
        citac.close();
    }
}
