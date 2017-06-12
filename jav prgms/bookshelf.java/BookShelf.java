import java.util.Scanner;

public class BookShelf
{
    // instance variables - replace the example below with your own
    private String  BookName;
    private int NoOfBooks;
    
    public BookShelf()
    {
        BookName="";
        NoOfBooks=0;
    }
    
    public void addBook(String name)
    {
        BookName=BookName + name + " ";
        NoOfBooks++;
    }
    
    public void removeBook(String bkname)
    {
        BookName = BookName.replace(bkname +" ","");
        NoOfBooks--;
    }
    
    public void displayList()
    {
        System.out.println(BookName);
        System.out.println(NoOfBooks);
    }
        
        

    public static void main(String[] args)
    {
        BookShelf book = new BookShelf();
       
        book.addBook("c");
        book.addBook(".Net");
        book.addBook("oops");
        book.removeBook(".Net");
        
        book.displayList();
        
        
    }
}
