public enum TypeCafe {
    JAVA(0.035),
    MOKA(0.025),
    TYPICA(0.027),
    BOURBON(0.030),
    BATARD(0.0);

    private double coutParMl;


    TypeCafe(double coutParMl) {
        this.coutParMl = coutParMl;
    }

    public double getCoutParMl() {
        return this.coutParMl;
    }
}