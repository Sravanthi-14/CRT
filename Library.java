import java.util.*;
public class Library {
Book[] books;
public int count;
public Library() {
    books = new Book[90];
    count = 0;
}
public int countBooks() {
    return count;
}
public int findBook(int sNo) {
    for (int i = 0; i < count; i++) {
        if (books[i].getsNo() == sNo) {
            return i;
        }
    }
    return -1;
}
public Book getBook(int index) {
    if (index >= 0 && index <= count) {
        return books[index];
    }
    return null;
}
public boolean addBook(Book b) {
    if (count < books.length && findBook(b.getsNo()) == -1) {
        books[count] = b;
        count++;
        return true;
    }
    return false;
}
public boolean removeBook(Book b){
    int index = findBook(b.getsNo());
    if (index != -1) {
        for (int i = index; i < (count - 1); i++) {
            books[i] = books[i+1]; // Shift left.
        }
        count--;
        return true;
    }
    return false;
}
public void getAllBook() {
    System.out.println("Total books : "+count + "\r\n");
    System.out.println("All the book in the system are: " + "\r\n");
    for(int i = 0; i < count; i++){
        System.out.println(books[i]);
        System.out.println("\r\n");
    }
}
public void displayMainMenu(){
    System.out.println("******************************");
    System.out.println("         Library Menu");
    System.out.println("1: Add a book.");
    System.out.println("2: Get a book information.");
    System.out.println("3: Update a book information.");
    System.out.println("4: Delete the book.");
    System.out.println("5: Print all books.");
    System.out.println("******************************" + "\r\n");
}
}
