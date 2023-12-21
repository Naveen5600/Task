import java.util.Scanner;

//create book class
class Book
{
    int bookid;
    String title;
    String author;
    String isavailable;

    Book(int bookid,String title,String author,String isavailable)
    {

        this.bookid=bookid;
        this.title=title;
        this.author=author;
        this.isavailable=isavailable;
    }
//using getter for bookid
    public int getBookid() {
        return bookid;
    }
    public String toString() {
        return "Book ID: " + bookid + ", Title: " + title + ", Author: " + author + ", Available: " + isavailable;
    }
}
//create class library
   class Library {
//create book array
    Book[] books;
    int size = 0;
    Library(Book[] book) {
        this.books = book;
    }
//add new data
    public void add(Book newbook) {
        if (size < books.length) {
            books[size++] = newbook;
            System.out.println("book added successfully");
        }
    }
//display array book
    public void display() {
        System.out.println("Books in the library:");
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }
//remove data using bookid
    public void remove(int bookId) {
        for (int i = 0; i < size; i++) {
            if (books[i].bookid == bookId) {
                books[i] = books[i + 1];
                books[size-1]=null;
                size--;
                System.out.println("book removed successfully");
            }
        }
    }
}
   public  class Main {

    public static void main(String[] args)
    {
   //create book object and passing paramater to constructer
        Book book1=new Book(1,"java","ram","y");
        Book book2=new Book(2,"html","mani","y");
        Book book2=new Book(3,"js","arun","n");
        Book book2=new Book(4,"sql","tamil","y");
        Book book2=new Book(5,"c++","balu","n");
    //create library object
        Library library = new Library(new Book[5]);
     //call add() method
        library.add(book1);
        library.add(book2);
      //call display() method
        library.display();
       //call remove() method
        library.remove(1);
        library.display();
    }
}