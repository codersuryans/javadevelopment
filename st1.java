class Book {
    String title;
    boolean issued;

    Book(String title) {
        this.title = title;
        this.issued = false;
    }
}

class User {
    String name;

    User(String name) {
        this.name = name;
    }
}

class Library {
    Book[] books;

    Library(Book[] books) {
        this.books = books;
    }

    void issueBook(String title, User user) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title) && !b.issued) {
                b.issued = true;
                System.out.println(user.name + " issued " + title);
                return;
            }
        }
        System.out.println("Book not available!");
    }

    void returnBook(String title, User user) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title) && b.issued) {
                b.issued = false;
                System.out.println(user.name + " returned " + title);
                return;
            }
        }
        System.out.println("Book was not issued!");
    }
}

public class st1 {
    public static void main(String[] args) {
        Book b1 = new Book("Java");
        Book b2 = new Book("Python");
        Book b3 = new Book("C++");

        Library lib = new Library(new Book[]{b1, b2, b3});
        User u1 = new User("Alice");

        lib.issueBook("Java", u1);
        lib.issueBook("Java", u1); // already issued
        lib.returnBook("Java", u1);
    }
}
