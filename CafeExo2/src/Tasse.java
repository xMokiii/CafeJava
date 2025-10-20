public class Tasse {
    float quantiteCafeMax;
    Cafe cafe;

    public Tasse() {
        this.quantiteCafeMax = 100;
        this.cafe = new Cafe();
        this.cafe.quantiteLiquideMl = 0;
    }

    public Tasse(float quantiteCafeMax) {
        this.cafe = new Cafe();
        this.quantiteCafeMax = quantiteCafeMax;
        this.cafe.quantiteLiquideMl = 0;
    }

    public double boire(double quantite) throws Exception {
        if (this.cafe.quantiteLiquideMl <= 0) {
            throw new Exception("Le café est vide !");
        }
        return this.cafe.quantiteLiquideMl-= quantite;
    }

    public void boire() throws Exception {
        if (this.cafe.quantiteLiquideMl <= 0) {
            throw new Exception("Le café est vide !");
        }
        this.cafe.quantiteLiquideMl = 0;
    }

}
