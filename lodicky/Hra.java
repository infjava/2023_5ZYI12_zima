import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Hra {
    private Policko[][] hraciaPlocha;
    
    public Hra(int velkostPolicka, String nazovMapy) throws IOException {
        Scanner citac = new Scanner(new File(nazovMapy));
        
        int sirka = citac.nextInt();
        int vyska = citac.nextInt();
        
        this.hraciaPlocha = new Policko[vyska][sirka];
        
        for (int y = 0; y < vyska; y++) {
            for (int x = 0; x < sirka; x++) {
                this.hraciaPlocha[y][x] = new Policko(x, y, velkostPolicka);
            }
        }
        
        citac.close();
    }
}
