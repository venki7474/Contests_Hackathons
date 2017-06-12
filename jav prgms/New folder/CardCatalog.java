            import java.util.Scanner;
            /**
            *This is a cardcatalog class that which contains all the methods
            *@param theTitle
            *@param theAuthor
            *@param theSubject
            */
            class CardCatalog {
              private Card[] theTitle;
              private Card[] theAuthor;
              private Card[] theSubject;
              private static int index = 0;
              private int i = 10;
              public int count=0;
              /**
              *
              */
            CardCatalog() {
                theTitle = new Card[i];
                theAuthor = new Card[i];
                theSubject = new Card[i];
            }
            /**
            *addAcard metod is for adding the cards to the arrays
            *@param crd is the passed card.
            */
            public void addACard(final Card crd) {
            if (index == 0) {
            theTitle[index]=crd;
            theAuthor[index]=crd;
            theSubject[index]=crd;
            index++;
            }
             else {
            for(int a = 0; a <= index;a++)
             {
               if(crd.title.compareToIgnoreCase(theTitle[a].title)<0)
               {
                   for(int j = index; j>a;j--)
                   {
                        theTitle[j] = theTitle[j-1];
                   }
                    theTitle[a]=crd;
                    break;
               }
               else if(a+1==index)
               {
                    theTitle[index]=crd;
                }
           }
           for(int a=0; a <= index; a++)
           {
               if(crd.author.compareToIgnoreCase(theAuthor[a].author)<0)
               {
                   for(int j = index; j > a; j--)
                    {
                        theAuthor[j]=theAuthor[j-1];
                    }
                    theAuthor[a]=crd;
                    break;
               }
               else if(a+1==index)
                {
                    theAuthor[index]=crd;
                }
           }
           for(int a=0;a<=index;a++)
           {
               if(crd.subject.compareToIgnoreCase(theSubject[a].subject)<0)
               {
                    for(int j=index;j>a;j--)
                    {
                        theSubject[j]=theSubject[j-1];
                    }
                    theSubject[a]=crd;
                    break;
               }
               else if(a+1==index)
               {
                    theSubject[index]=crd;
                }
           }
           index++;
       }
   }
            /**
            *printAll method is used to print the card content.
            */
            public void printAll() {
                    for (int j = 0; j < 5; j++) {
                       int k;
                       k = j;
                       k++;
                       System.out.println("====================================");
                       System.out.println(k + "." + "Title:" + theTitle[j].title);
                       System.out.println("Author:" + theTitle[j].author);
                       System.out.println("Subject:" + theTitle[j].subject);
                   }
               }
               /**
               *this method is used to print the whole catalog.
               *@param
               */
            public void printTheCatalog() {
            System.out.println("Enter 1 to get by Title.");
            System.out.println("Enter 2 to get by Author.");
            System.out.println("Enter 3 to get by Subject.");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            switch (x) {
            case 1: for (int j = 0; j < index; j++) {
                    int k;
                    k = j;
                    k++;
            System.out.println(k + "." + "Title:" + theTitle[j].title);
            System.out.println("Author:" + theTitle[j].author);
            System.out.println("Subject:" + theTitle[j].subject);
            System.out.println("==========================================================");
                        }
                            break;
                 case 2: for (int j = 0; j < index; j++) {
                            int k;
                            k = j;
                            k++;
            System.out.println(k + "." + "Author:" + theAuthor[j].author);
            System.out.println("Title:" + theAuthor[j].title);
            System.out.println("Subject:" + theAuthor[j].subject);
            System.out.println("===================================");
                        }
                            break;
                case 3: for (int j = 0; j < index; j++) {
                            int k;
                            k = j;
                            k++;
            System.out.println(k + "." + "Subject:" + theSubject[j].subject);
            System.out.println("Author:" + theSubject[j].title);
            System.out.println("Subject:" + theSubject[j].author);
            System.out.println("====================================");
                        }
                            break;
                default: System.out.println("invalid option");
            }
        }
        /**
        *The method getATitle gives the book details based upon the search word.
        *@param sTitle is passed to the method  to get the 
        *details based upon the search word.
        *@return Card[] the return type is of card array.
        */
        public Card[] getATitle(final String sTitle) {
            int c = 0;
            int m = 0;
            Card[] crdTitle = new Card[10];
            for (int j = 0; j < index; j++) {
                if (theTitle[j].title.equalsIgnoreCase(sTitle)) {
                    crdTitle[m] = theTitle[j];
                    m++;
                    c++;
                    break;
                }
            }
            if (c == 0) {
                return null;
            }

            return crdTitle;
        }
        /**
        *getAuthor method displays the books based upon 
        *the search done by the author of the book.
        *@param sAuthor  this is passed to the method to search by the word.
        *@return Card[] the card aray is returned .
        */
        public Card[] getAnAuthor(final String sAuthor) {
            Card[] crdAuthor = new Card[10];
            int o = 0;
            int c = 0;
            for (int j  = 0; j < index; j++) {
                if (theAuthor[j].author.equalsIgnoreCase(sAuthor)) {
                    // Card[] crdAuthor=new Card[1]
                    crdAuthor[o] = theAuthor[j];
                    o++;
                    c++;
                    count=c;
                  //printCard(theAuthor[j]);
                }

            }
            if (c != 0) {
                return crdAuthor;

                }
            return null;
        }
        /**
        *getSubject method gives the book details based
        *upon the search done by subject of the book.
        *@param  sSubject is the string that we are passing to the method.
        *@return  Card[] the card array is returned.
        */
        public Card[] getSubject(final String sSubject) {
            Card[] crdSubject = new Card[10];
            int p = 0;
            int c = 0;
            for (int j = 0; j < index; j++) {
                if (theSubject[j].subject.equalsIgnoreCase(sSubject)) {
                    crdSubject[p] = theSubject[j];
                    p++;
                    c++;
                }
            }
            if (c == 0) {
                return null;
                }
            return crdSubject;
        }
        /**
        * The removeATitle method removes the book u selected .
        *@param c is the book that which we are going to delete.
        */
        public void removeATitle(final Card c) {
            for (int j = 0; j < index; j++) {
                if (c.title.compareTo(theTitle[j].title) == 0) {
                    for (int k = j; k < index - 1; k++) {
                        theTitle[k] = theTitle[k + 1];
                    }
                }
                if (c.title.compareTo(theAuthor[j].title) == 0) {
                    for (int k = j; k < index - 1; k++) {
                        theAuthor[k] = theAuthor[k + 1];
                    }
                }
                if (c.title.compareTo(theSubject[j].title) == 0) {
                    for (int k = j; k < index - 1; k++) {
                        theSubject[k] = theSubject[k + 1];
                    }
                }
            }
            index--;
            System.out.println("Remaining books are:");
            for (int l = 0; l < index; l++) {
                int m;
                m = l;
                m++;
                System.out.println(m + "." + "Title:" + theSubject[l].title);
                System.out.println("Author:" + theSubject[l].author);
                System.out.println("Subject:" + theSubject[l].subject);
                System.out.println("========================================");
            }
        }
        }class Card
{
    
    public String author;
    public String title;
    public String subject;

    public Card(String title,String author,String subject )
    {
      this.author=author;
      this.title=title;
      this.subject=subject;
     
    }
   
}

