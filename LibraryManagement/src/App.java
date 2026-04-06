import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        char c;
        int opt;
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        System.out.println("--Library Management System--");

        do {
            System.out.println("1. Add a book\n2. View all books\n3. Issue a book\n4. Return a book");
            System.out.print("Select an option: ");
            opt = sc.nextInt();sc.nextLine();

            switch (opt) {
                case 1:
                    System.out.print("Enter a book title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter a book author: ");
                    String author = sc.nextLine();
                    library.addBook(title, author);
                    break;
                case 2:
                    library.viewAllBooks();
                    break;
                case 3:
                    System.out.println("Enter book ID: ");
                    int bId1 = sc.nextInt(); sc.nextLine();
                    System.out.println(library.issueBook(bId1));
                    break;
                case 4:
                    System.out.println("Enter book ID: ");
                    int bId2 = sc.nextInt(); sc.nextLine();
                    System.out.println(library.returnBook(bId2));
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
            System.out.print("Continue? (Y || y): ");
            c = sc.nextLine().charAt(0);
        } while(c == 'Y' || c =='y');

        sc.close();
    }
}