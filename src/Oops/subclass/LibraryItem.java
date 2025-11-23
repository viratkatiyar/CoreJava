package Oops.subclass;

public class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public void checkout(){
        System.out.println("checkout");
    }
    public void returnItem(){
        System.out.println("returning the item");
    }
}
