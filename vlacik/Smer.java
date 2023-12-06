public enum Smer {
    HORE(+90, 0, -1),
    DOLE(-90, 0, 1),
    VLAVO(0, -1, 0),
    VPRAVO(180, 1, 0);
    
    private int uhol;
    private int vektorX;
    private int vektorY;
    
    Smer(int uhol, int vektorX, int vektorY) {
        this.uhol = uhol;
        this.vektorX = vektorX;
        this.vektorY = vektorY;
    }
    
    public int getUhol() {
        return this.uhol;
    }
    
    public int getVektorX() {
        return this.vektorX;
    }
    
    public int getVektorY() {
        return this.vektorY;
    }
}
