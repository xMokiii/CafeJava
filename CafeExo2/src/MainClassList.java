public static void main(String[] args) {
    ClassList list1 = new ClassList(1,"Un",1);
    ClassList list2 = new ClassList(2,"Deux",2);
    ClassList list3 = new ClassList(3,"Trois",3);
    ClassList list4 = new ClassList(4,"Quatre",4);


    ClassList[] TableauDeClassList = {list1, list2, list3, list4};


    for (ClassList item : TableauDeClassList) {
        System.out.println("Tableau " + item);
    }


    int number = 0;
    List<ClassList> ListeDeClassList = new ArrayList<ClassList>();
    ListeDeClassList.add(list1);
    ListeDeClassList.add(list2);
    ListeDeClassList.add(list3);
    ListeDeClassList.add(list4);
    double compteurDouble = 1;
    int compteurString = ListeDeClassList.get(0).myString.length();
    int smallest = ListeDeClassList.getFirst().myNumber ;
    for (ClassList item : ListeDeClassList) {
        compteurDouble *= item.myDouble;
        item.myString += "e";
        System.out.println("Liste "+ item);
        if (item.myString.length()-1>compteurString) {
            compteurString = item.myString.length()-1;
        }
        if (item.myNumber< smallest) {
            smallest = item.myNumber;
        }
    }
    System.out.println("Somme totale des doubles : " + compteurDouble);
    System.out.println("Valeur minimale de myNumber : " + smallest);
    System.out.println("Valeur minimale de myString : " + compteurString);
    Map<String,ClassList> MapClassListe = new HashMap<>();
    MapClassListe.put("Liste1",list1);
    MapClassListe.put("Liste2",list2);
    MapClassListe.put("Liste3",list3);
    MapClassListe.put("Liste4",list4);
    MapClassListe.forEach((clef,valeur)->{
        System.out.println("Map " + clef + " : " + valeur);
    });
}