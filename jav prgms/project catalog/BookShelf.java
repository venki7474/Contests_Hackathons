
import java.util.Scanner;
public class BookShelf
{
    private String bookName;
    private int bookId;
    public int totalBooks=0;
    
    public BookShelf()
    {
        bookName="";
        bookId=0;
        totalBooks=0;
    }
    
    public void addBook(String bookName,int bookId)
    {
          
        
        this.bookName=bookName;
        this.bookId=bookId;
        totalBooks++;
    }
    
     public void removeBook(int bookId)
    {
        
        if(this.bookId==bookId)
        {
            System.out.println("book removed");
            totalBooks--;
        
        }
        else
        System.out.println("book not found");
        
   }
    
    public void displayList(String bookName,int bookId)
    {

        System.out.println(this.bookName);
        System.out.println(this.bookId);
        
    }
    
    public int searchBook(int bookId)
    {
        if(this.bookId==bookId)
        
           return 1;
       
        else
        return 0;
        
    }
    
    public static void main(String[] args)
    {
        BookShelf book=new BookShelf();
        int search;
        String name2="DS";
        int id2=1;
         System.out.println(id2);
        System.out.println(name2);
        
         Scanner in = new Scanner(System.in);
         System.out.println("enter book details");
         System.out.println("enter the book name");
         book.bookName=in.nextLine();
         System.out.println("enter the book id");
         book.bookId=in.nextInt();
         book.addBook(book.bookName,book.bookId);
         System.out.println("Total books");
         System.out.println(book.totalBooks);
         
         book.addBook(name2,id2);
         System.out.println("Total books");
         System.out.println(book.totalBooks);
         
         System.out.println("enter the book Id to be searched");
         book.bookId=in.nextInt();
         search=book.searchBook(book.bookId);
         if(search==1)
         
         book.displayList(book.bookName,book.bookId);
         else
         System.out.println("cannot find the book");
         System.out.println("enter the book Id to be removed");
         book.bookId=in.nextInt();
         book.removeBook(book.bookId);
         System.out.println("total books");
         System.out.println(book.totalBooks);
    }
}
