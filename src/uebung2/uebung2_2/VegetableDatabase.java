package uebung2.uebung2_2;

public class VegetableDatabase implements UserFoodSearch {

    private String [] vegetables = {"Salat", "Gurke"};

    @Override
    public void search(String text) {

        System.out.println("Vegetable Database wird durchsucht!");

        boolean found = false;

        for (int i = 0; i < vegetables.length; i++) {
            if (text.equals(vegetables[i])){
                found = true;
            }
        }
        if (found){
            System.out.println("In Datenbank gefunden");

        }else {
            System.out.println("Nicht in Datenbank gefunden");
        }
    }
}
