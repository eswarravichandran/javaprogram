import java.util.ArrayList;

public class Library {
    private int currentId = 0;
    private ArrayList<Book> bookList = new ArrayList<Book>();

    void addBook(String title, String author) {
        bookList.add(new Book(++currentId, title, author));
        System.out.println("Book added successfully");
    }

    void viewAllBooks() {
        if(bookList.size() > 0) {
            for(Book b: bookList) {
                System.out.println(b);
            }
        }
        else {
            System.out.println("No books available!");
        }
    }

    String issueBook(int bId1) {
        for(Book b: bookList) {
            if(b.getBookId() == bId1) {
                if(b.getBookStatus() == Book.BookStatus.AVAILABLE) {
                    b.setBookStatus(Book.BookStatus.ISSUED);
                    return "Book ID - " + bId1 + " issued!";
                }
                else {
                    return "Book ID is already issued!";
                }
            }
        }
        return "Given ID not available for issue!";
    }

    String returnBook(int bId2) {
        for(Book b: bookList) {
            if(b.getBookId() == bId2) {
                if(b.getBookStatus() == Book.BookStatus.ISSUED) {
                    b.setBookStatus(Book.BookStatus.AVAILABLE);
                    return "Book ID - " + bId2 + " returned!";
                }
                else {
                    return "Book ID is already available!";
                }
            }
        }
        return "Given ID not available for return!";
    }
}
