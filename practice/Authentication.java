import java.io.Console;
import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author Venkatesh Ejjagiri IH20585025
 */
class User{
    private String password;
    private String securityQues;
    private String answer;
    
    User(String password, String securityQues, String answer){
        this.password = password;
        this.securityQues = securityQues;
        this.answer = answer;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecurityQues() {
        return securityQues;
    }

    public void setSecurityQues(String securityQues) {
        this.securityQues = securityQues;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
}
public final class Authentication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Console psd = System.console();
        System.out.println("Enter Usename");
        String userName = sc.nextLine();
        String password ="", repeat = "";
        while(true){
            System.out.println("Enter the password");
            char pd[] = psd.readPassword();
            password = new String(pd);
            System.out.println("Repeat the password");
            char pd1[] = psd.readPassword();
            repeat = new String(pd1);
            if (password.equals(repeat)) {
                break;
            } else{
                System.out.println("re-enter the password");
            }
        }
        System.out.println("Enter Security Ques");
        String securityQues = sc.nextLine();
        System.out.println("Enter the answer");
        String answer = sc.nextLine();
        User user = new User(password, securityQues, answer);
        Hashtable<String, User> db = new Hashtable();
        db.put(userName, user);
        System.out.print("Enter the details to login \n username:");
        String uname = sc.nextLine();
        System.out.print("Enter password: ");
        char pd[] = psd.readPassword();
        String pwd = new String(pd);
        int count = 0;
        while (!db.containsKey(uname)){
            System.out.print("Invalid userName \n Re-Enter the details to login \n username: ");
            uname = sc.nextLine();
            System.out.print("Re-Enter password: ");
            char pd1[] = psd.readPassword();
            pwd = new String(pd1);
        }
        if (db.get(uname).getPassword().equals(pwd)){
            System.out.println("USER AUTHENTICATED: ACCESS GRANTED");
        } else {
            while (!db.get(uname).getPassword().equals(pwd) && count != 3) {
                count += 1;
                System.out.println("Do you want to re-enter password(Y/N)");
                String st = sc.nextLine();
                if (st.equals("Y") || st.equals("y")) {
                    System.out.println("enter password");
                    char pd1[] = psd.readPassword();
                    pwd = new String(pd1);
                    if (db.get(uname).getPassword().equals(pwd)){
                        System.out.println("USER AUTHENTICATED: ACCESS GRANTED");
                        break;
                    } else {
                        continue;
                    }
                } else if (st.equals("N") || st.equals("n")){
                    System.out.println("Did you forget password(Y/N)");
                    String st2 = sc.nextLine();
                    if (st2.equals("Y") || st2.equals("y")) {
                        System.out.println("Recovery question:");
                        System.out.println(db.get(uname).getSecurityQues());
                        System.out.print("Enter your answer: ");
                        String ans = sc.nextLine();
                        if (ans.equals(db.get(uname).getAnswer())) {
                            System.out.println("Reset your password now");
                            password = ""; repeat = "";
                            while(true){
                                System.out.println("Enter the password");
                                char pd3[] = psd.readPassword();
                                password = new String(pd3);
                                System.out.println("Repeat the password");
                                char pd4[] = psd.readPassword();
                                repeat = new String(pd4);
                                if (password.equals(repeat)) {
                                    db.get(uname).setPassword(password);
                                    System.out.println("Password changed Successfully and logged in");
                                    System.out.println("USER AUTHENTICATED: ACCESS GRANTED");
                                    break;
                                } else{
                                    System.out.println("re-enter the password");
                                }
                            }
                        }
                    }
                }
            }
            if (count == 3) {
                System.out.println("Your Account is locked..!");
                System.exit(0);
            }
        }
    }
}
