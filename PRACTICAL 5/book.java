class Book {
    int bookId;
    String title, author;
    void inputBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book ID: ");
        bookId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Title: ");
        title = sc.nextLine();
        System.out.print("Enter Author: ");
        author = sc.nextLine();
    }
    void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
class IssuedBook extends Book {
    String issueDate, returnDate;
    void inputIssuedBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Issue Date: ");
        issueDate = sc.nextLine();
        System.out.print("Enter Return Date: ");
        returnDate = sc.nextLine();
    }
    void displayIssuedBook() {
        displayBook();
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Return Date: " + returnDate);
    }
}
public class book {
    public static void main(String[] args) {
        IssuedBook obj = new IssuedBook();
        obj.inputBook();
        obj.inputIssuedBook();
        obj.displayIssuedBook();
    }
}
