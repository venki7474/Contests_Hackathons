    import java.util.Scanner;
    public class Menu {
    static int y;    
    public static void main(String[] args) {
         String sTitle;
         String sAuthor;
         String sSubject;
         String rmvTitle;
           Card[] card = new Card[5];
           card[0] = new Card("Let us c" , "yashwanth" , "c");
           card[1] = new Card("Let us Java" , "Allen B.Downey" , "Java");
           card[2] = new Card("The complete reference for Java" , "Herbert Schildt" , "Java");
           card[3] = new Card("Let us c" , "Herbert Schildt" , "c");
           card[4] = new Card("Algorithms" , "Thomas" , "Data Structures");
            CardCatalog cc = new CardCatalog();
           // Card cd;
           for (int i = 0; i < 5; i++) {
            cc.addACard(card[i]);
           }
            do {
            System.out.println("enter 1 to get by the title:");
            System.out.println("enter 2 to get by the Author:");
            System.out.println("enter 3 to get by the Subject:");
            System.out.println("enter 4 to remove the title:");
            System.out.println("enter 5 to print the catalog:");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            switch(x) {
            case 1: System.out.println("enter the title to be searchd");
                    Scanner s = new Scanner(System.in);
                    sTitle = s.nextLine();
                    Card[] aTitle = new Card[10];
                    aTitle = cc.getATitle(sTitle);
                    for (int j = 0; j < 1; j++) {
            		System.out.println("Title:" + aTitle[j].title);
            		System.out.println("Author:" + aTitle[j].author);
            		System.out.println("Subject:" + aTitle[j].subject);
            		}
                   break;
            case 2: System.out.println("enter the author to be searchd");
                    Scanner s1 = new Scanner(System.in);
                    sAuthor = s1.nextLine();
                    Card[] anAuthor = new Card[10];
                    anAuthor = cc.getAnAuthor(sAuthor);
                    //printCard(anAuthor[]);
                    for (int j = 0; j < 5; j++) {
            		System.out.println("Title:" + anAuthor[j].title);
            		System.out.println("Author:" + anAuthor[j].author);
            		System.out.println("Subject:" + anAuthor[j].subject);
            		}
                    break;
            case 3: System.out.println("enter the subject to be searchd");
                    Scanner s2 = new Scanner(System.in);
                    sSubject = s2.nextLine();
                    Card[] aSubject = new Card[10];
                    aSubject = cc.getSubject(sSubject);
                    //printCard(aSubject[]);
                    for (int j = 0; j < 5; j++) {
            		System.out.println("Title:" + aSubject[j].title);
            		System.out.println("Author:" + aSubject[j].author);
            		System.out.println("Subject:" + aSubject[j].subject);
            		}
                    break;
            case 4: cc.printAll();
                    System.out.println("enter the book number to be deleted");
                    Scanner sc1 = new Scanner(System.in);
                    int n = sc1.nextInt();
                    if (n <= 5) {
                    cc.removeATitle(card[n - 1]);
                	}
                    else {
                        System.out.println("enter the valid book number");
                    }
                    break;
            case 5: cc.printTheCatalog();
                    break;
            default : System.out.println("enter the valid number");
            }
            System.out.println("Enter 0 to exit and 1 to continue:");
            Scanner sc1 = new Scanner(System.in);
            y = sc1.nextInt();
            } while (y != 0 && y == 1);
        }
    }
