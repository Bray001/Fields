public class Library {
    public String name;
    public static int totalBooks;

    public void addBooks(int numBooks){
        numBooks = 250
    }

    public static int getTotalBooks(){
        //TODO:
    }


}

App.java

public class App {
    public static void main(String[] args) {

        Library A = new Library();
        A.name = "A";
        A.addBooks(100);

        Library B = new Library();
        B.name = "B";
        B.addBooks();
// TODO: print total Library books.  Library.getTotalBooks()

    }
