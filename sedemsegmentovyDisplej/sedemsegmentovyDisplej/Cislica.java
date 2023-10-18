public class Cislica {
    private Segment segmentA;
    private Segment segmentB;
    private Segment segmentC;
    private Segment segmentD;
    private Segment segmentE;
    private Segment segmentF;
    private Segment segmentG;
    
    public Cislica(int x, int y, int cislica) {
        this.segmentA = new Segment(10 + x, 0 + y, false);
        this.segmentB = new Segment(50 + x, 10 + y, true);
        this.segmentC = new Segment(50 + x, 60 + y, true);
        this.segmentD = new Segment(10 + x, 100 + y, false);
        this.segmentE = new Segment(0 + x, 60 + y, true);
        this.segmentF = new Segment(0 + x, 10 + y, true);
        this.segmentG = new Segment(10 + x, 50 + y, false);
        
        this.zmenHodnotu(cislica);
    }
    
    public void zmenHodnotu(int cislica) {
        switch (cislica) {
            case 0:
                this.segmentA.rozsvietSa();
                this.segmentB.rozsvietSa();
                this.segmentC.rozsvietSa();
                this.segmentD.rozsvietSa();
                this.segmentE.rozsvietSa();
                this.segmentF.rozsvietSa();
                this.segmentG.zhasni();
                break;
            case 1:
                this.segmentA.zhasni();
                this.segmentB.rozsvietSa();
                this.segmentC.rozsvietSa();
                this.segmentD.zhasni();
                this.segmentE.zhasni();
                this.segmentF.zhasni();
                this.segmentG.zhasni();
                break;
            case 2:
                this.segmentA.rozsvietSa();
                this.segmentB.rozsvietSa();
                this.segmentC.zhasni();
                this.segmentD.rozsvietSa();
                this.segmentE.rozsvietSa();
                this.segmentF.zhasni();
                this.segmentG.rozsvietSa();
                break;
            case 3:
                this.segmentA.rozsvietSa();
                this.segmentB.rozsvietSa();
                this.segmentC.rozsvietSa();
                this.segmentD.rozsvietSa();
                this.segmentE.zhasni();
                this.segmentF.zhasni();
                this.segmentG.rozsvietSa();
                break;
            case 4:
                this.segmentA.zhasni();
                this.segmentB.rozsvietSa();
                this.segmentC.rozsvietSa();
                this.segmentD.zhasni();
                this.segmentE.zhasni();
                this.segmentF.rozsvietSa();
                this.segmentG.rozsvietSa();
                break;
            case 5:
                this.segmentA.rozsvietSa();
                this.segmentB.zhasni();
                this.segmentC.rozsvietSa();
                this.segmentD.rozsvietSa();
                this.segmentE.zhasni();
                this.segmentF.rozsvietSa();
                this.segmentG.rozsvietSa();
                break;
            case 6:
                this.segmentA.rozsvietSa();
                this.segmentB.zhasni();
                this.segmentC.rozsvietSa();
                this.segmentD.rozsvietSa();
                this.segmentE.rozsvietSa();
                this.segmentF.rozsvietSa();
                this.segmentG.rozsvietSa();
                break;
            case 7:
                this.segmentA.rozsvietSa();
                this.segmentB.rozsvietSa();
                this.segmentC.rozsvietSa();
                this.segmentD.zhasni();
                this.segmentE.zhasni();
                this.segmentF.zhasni();
                this.segmentG.zhasni();
                break;
            case 8:
                this.segmentA.rozsvietSa();
                this.segmentB.rozsvietSa();
                this.segmentC.rozsvietSa();
                this.segmentD.rozsvietSa();
                this.segmentE.rozsvietSa();
                this.segmentF.rozsvietSa();
                this.segmentG.rozsvietSa();
                break;
            case 9:
                this.segmentA.rozsvietSa();
                this.segmentB.rozsvietSa();
                this.segmentC.rozsvietSa();
                this.segmentD.rozsvietSa();
                this.segmentE.zhasni();
                this.segmentF.rozsvietSa();
                this.segmentG.rozsvietSa();
                break;
            default:
                this.segmentA.zhasni();
                this.segmentB.zhasni();
                this.segmentC.zhasni();
                this.segmentD.zhasni();
                this.segmentE.zhasni();
                this.segmentF.zhasni();
                this.segmentG.zhasni();
                break;
        }
    }
}
