

public class Todo
{
    // instance variables - replace the example below with your own
    private String taskName;
    private String taskDescription;
    private String taskDueDate;
    private String taskReminder;
    private String color;
    private String taskImp;
    
    public Todo(String t_N,String t_D,String t_dd,String t_R,String Imp)
    {
        // initialise instance variables
        
        taskName=t_N;
        taskDescription=t_D;
        taskDueDate=t_dd;
        taskReminder=t_R;
        taskImp=Imp;
        if(Imp=="imp and urgent")
        {
            color="Red";
        }
        else if(Imp=="imp and not urgent")
        {
            color="orange";
        }
        else if(Imp=="not imp and urgent")
        {
            color = "blue";
        }
        else if(Imp=="not imp and not urgent")
        {
            color = "white";
        }
    }
    
 
        
        public static void main(String[] args)
        {
            Todo task1=new Todo("wake up early","should wake up early to go to flag hosting","15/Aug/2015","14/Aug/2015","imp and urgent");
            System.out.println("task name:" +task1.taskName);
            System.out.println("task Description:" +task1.taskDescription);
            System.out.println("task DueDate:" +task1.taskDueDate);
            System.out.println("taskReminder on:" +task1.taskReminder);
            System.out.println("color:" +task1.color);
            System.out.println("--------------------------------------------------------");
            
            Todo task2=new Todo("breakfast","should eat before flag hosting","15/Aug/2015","14/Aug/2015","imp and not urgent");
            System.out.println("task name:" +task2.taskName);
            System.out.println("task Description:" +task2.taskDescription);
            System.out.println("task DueDate:" +task2.taskDueDate);
            System.out.println("task Reminder on:" +task2.taskReminder);
            System.out.println("color:" +task2.color);
            System.out.println("--------------------------------------------------------");
    
            Todo task3=new Todo("Going to movie","going to srimanthudu movie","15/Aug/2015","14/Aug/2015","not imp and urgent");
            
            System.out.println("task name:" +task3.taskName);
            System.out.println("task Description:" +task3.taskDescription);
            System.out.println("task due date :" +task3.taskDueDate);
            System.out.println("task reminder on:" +task3.taskReminder);
            System.out.println("color:" +task3.color);
            System.out.println("--------------------------------------------------------");
            
            Todo task4=new Todo("Staying in lab","Should stay in lab and study something","15/Aug/2015","14/Aug/2015","not imp and not urgent");
            System.out.println("task name:" +task4.taskName);
            System.out.println("task Description:" +task4.taskDescription);
            System.out.println("task due date:" +task4.taskDueDate);
            System.out.println("task reminder on:" +task4.taskReminder);
            System.out.println("color:" +task4.color);
            System.out.println("--------------------------------------------------------");
}
    

    
}
