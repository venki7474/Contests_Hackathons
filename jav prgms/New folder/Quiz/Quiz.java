import java.util.*;
import java.lang.String;
public class Quiz
{
    
    public Question[] aQuestion;
    public Choices[] aOptions;
    public static int points = 0;
    public static int numQue = 0;
    
     class Choices
    {  
      public String choice1;
      public String choice2;
      public String choice3;
      public String choice4;
      
      public Choices(String choice1,String choice2,String choice3,String choice4)
      {
       this.choice1=choice1;
       this.choice2=choice2;
       this.choice3=choice3;
       this.choice4=choice4;
      }
    }
    
    public Quiz()
    {
       aQuestion = new Question[5];
       aOptions = new Choices[5];
    }
    

    
    public void addQuestion()
    {
        Scanner scn1 = new Scanner(System.in);
        int maxQ = scn1.nextInt();
        numQue = maxQ;
        Question[] que = new Question[maxQ];
        Choices[] options = new Choices[maxQ]; 
        
        for (int i = 0; i < maxQ; i++) {
        Scanner sc0 = new Scanner(System.in);
        int queNum = sc0.nextInt();
        
        Scanner sc1 = new Scanner(System.in);
        String qustn = sc1.nextLine();
        
        Scanner sc2 = new Scanner(System.in);
        String choice1 = sc2.nextLine();
        
        
        Scanner sc3 = new Scanner(System.in);
        String choice2 = sc3.nextLine();
       
        
        Scanner sc4 = new Scanner(System.in);
        String choice3 = sc4.nextLine();
        
        
        Scanner sc5 = new Scanner(System.in);
        String choice4 = sc5.nextLine();
        
        Scanner sc6 = new Scanner(System.in);
        String crctAnswer = sc6.nextLine();
        
        options[i] = new Choices(choice1,choice2,choice3,choice4);
        que[i] = new Question(queNum,qustn,crctAnswer);
        aQuestion[i] = que[i];
        
    }
       
    }
    
    public void startQuiz()
    {
     for(int k=0;k<numQue;k++) {
     System.out.println(aQuestion[k].queId);
     System.out.println(aQuestion[k].question);
     
     System.out.println(aOptions[k].choice1);
     System.out.println(aOptions[k].choice2);
     System.out.println(aOptions[k].choice3);
     System.out.println(aOptions[k].choice4);
     
     Scanner sc = new Scanner(System.in);
     String answer = sc.nextLine();
     
     
     if(answer.compareTo(aOptions[k].choice1)==0){
         points = (points + 5);
        }
        else if (answer.compareTo(aOptions[k].choice2)==0) {
            points = (points +5);
        }
        else if (answer.compareTo(aOptions[k].choice3)==0) {
            points = (points + 5);
        
        }
         else if (answer.compareTo(aOptions[k].choice4)==0) {
            points = (points + 5);
        }
    }

}
    public void showReport()
    {
        System.out.println("Achieved marks:" + points);
        
    }
}
