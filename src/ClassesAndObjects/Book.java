package ClassesAndObjects;

class Book {
    String title;
    String author;
    long isbn;
    static int totalBooks;
    boolean isBorrowed;
    static{
        totalBooks = 0;
    }
    { // Object Init
        totalBooks ++;
    }
    Book(long isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    Book(long isbn){
        this(isbn, "Unknown", "Unknown");
    }
    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book Borrowed Already");
        }
        else{
            this.isBorrowed = true;
            System.out.println("Book Borrowed Successfully");
        }
    }
    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Book Returned, Hope You enjoyed and leave a review");
        }
        else{
            System.out.println("Book Not Borrowed, Already in the library");
        }
    }
    static int getTotalBooks(){
        System.out.println("Total Books");
        return totalBooks;
    }

    public static void main(String[] args) {
        Book designOfThings = new Book(1, "Design", "Ben Bucket");
        Book powerOfZero = new Book(3);
        System.out.println(Book.totalBooks);
        designOfThings.borrowBook();
        powerOfZero.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();

    }
}
