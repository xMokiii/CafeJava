public class ClassList {
    int myNumber;
    String myString;
    double myDouble;

    public ClassList(int myNumber, String myString, double myDouble) {
        this.myNumber = myNumber;
        this.myString = myString;
        this.myDouble = myDouble;
    }

    @Override
    public String toString() {
        return "Nombre : " + myNumber + ", Texte : " + myString + ", Double : " + myDouble;
    }

}