public class Client {
    public Tasse tasse;
    public Cafe commandeCafe;
    public String nom;
    public float valeurFacture;

    public Client(String nom,Cafe commandeCafe, boolean avecTasse) {
        this.nom = nom;
        this.commandeCafe = commandeCafe;
        if (avecTasse) {
            this.tasse = new Tasse(100);
        }
        else {
            this.tasse = null;
        }
    }

    public Client(String nom,Cafe commandeCafe, Tasse tasse) {
        this.nom = nom;
        this.commandeCafe = commandeCafe;
        this.tasse = tasse;
    }

    public Client() {
        this.nom = "Jean";
        this.commandeCafe = null;
        this.tasse = new Tasse(100);
    }
}
