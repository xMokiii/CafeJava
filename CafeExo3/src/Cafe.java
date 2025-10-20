public class Cafe {
    public TypeCafe typeCafe;
    public float quantiteLiquideMl;

    public Cafe() {
        this.typeCafe = TypeCafe.MOKA;
        this.quantiteLiquideMl = 100;
    }

    public Cafe(TypeCafe TypeCafe,float quantiteLiquideMl) {
        this.typeCafe = TypeCafe;
        this.quantiteLiquideMl = quantiteLiquideMl;
    }
}
