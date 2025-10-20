public class Cafetiere {
    public Cafetiere() {}

    public void remplirTasse(Tasse tasse) {
        tasse.cafe.quantiteLiquideMl = tasse.quantiteCafeMax;
    }

    public void remplirTasse(Tasse tasse, TypeCafe typecafe, float quantite) {
        tasse.cafe.quantiteLiquideMl = quantite;
        tasse.cafe.typeCafe = typecafe;

    }
}
