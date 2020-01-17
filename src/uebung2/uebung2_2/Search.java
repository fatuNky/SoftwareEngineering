package uebung2.uebung2_2;

public class Search{

    private UserFoodSearch search;


    public Search(UserFoodSearch userFoodSearch){
        this.search = userFoodSearch;
    }


    public void search(String text) {
        search.search(text);
    }
}
