public class Book {
    private int bookId;
    private String bookTitle;
    private String bookAuthor;
    private BookStatus bookStatus;
    enum BookStatus {
        AVAILABLE,
        ISSUED
    }

    public Book(int bookId, String bookTitle, String bookAuthor) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookStatus = BookStatus.AVAILABLE;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus status) {
        this.bookStatus = status;
    }

    @Override
    public String toString() {
        return "----------\nBook ID - " + bookId + "\nBook Title - " + bookTitle + "\nBook Author - " + bookAuthor + "\nBook Status - " + bookStatus;
    }   
}