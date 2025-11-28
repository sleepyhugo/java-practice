package oop.Classes;

public class LibraryBookTracker {
    public static class Book{
        String title;
        String author;
        boolean isCheckedOut;

        public Book(String title, String author, boolean isCheckedOut){
            this.title = title;
            this.author = author;
            this.isCheckedOut = isCheckedOut;
        }

        public void checkOut(){
            isCheckedOut = true;
        }

        public void returnBook(){
            isCheckedOut = false;
        }

        public void displayInfo(){
            if (!isCheckedOut){
                System.out.println(title + " by " + author + " is (Available)");
            } else {
                System.out.println(title + " by " + author + " is (Checked out)");
            }
        }
    }
    public static class Library{
        Book book;

        public void addBook(Book book){
            this.book = book;
        }

        public void showBook(){
            book.displayInfo();
        }
    }

    public static void main(String[] args){
        Book book = new Book("The Hobbit", "Tolkien", true);
        Library library = new Library();

        library.addBook(book);

        book.checkOut();
        book.displayInfo();

        book.returnBook();
        book.displayInfo();
    }
}
