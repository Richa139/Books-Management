/*
 I Create a library management system which is capable of issuing books to the students.
 Book should have info like:
 1. Book name
 2. Book Author
 3. Issued to
 4. Issued on
 User should be able to add books, return issued books, issue books
 Assume that all the users are registered with their names in the central database
  */

import java.util.ArrayList;
class Book{
    public String name, author;
    public Book(String name , String author){
        this.name=name;
        this.author=author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class MyBooks{
    public ArrayList<Book>books;
    public MyBooks(ArrayList<Book>books){
        this.books=books;
    }
    public void addbook(Book book){
        System.out.println("Book has been added to System ");
        this.books.add(book);
    }
    public void issueBook(Book book, String issuedto){
        System.out.println("the book has been issued from the library"+issuedto);
        this.books.remove(book);
    }
    public void returnBook(Book b){
        System.out.println("The book has been returned");
        this.books.add(b);
    }
}
public class LibraryManagement {
    public static void main(String[] args){
        ArrayList<Book>book=new ArrayList<>();
        Book b1 = new Book("Algorithms", "CLRS");
        book.add(b1);

        Book b2 = new Book("Algorithms2", "CLRS2");
        book.add(b2);

        Book b3 = new Book("Algorithms3", "CLRS3");
        book.add(b3);

        Book b4 = new Book("Algorithms4", "CLRS4");
        book.add(b4);


        MyBooks richa=new MyBooks(book);
        richa.addbook(new Book("algo4", "myAuthor"));
        System.out.println(richa.books);

        richa.issueBook(b3, "Richa");
        System.out.println(richa.books);
    }
}
