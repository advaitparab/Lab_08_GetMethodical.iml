import java.util.Scanner;
public class Reggie {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);


        String ssn=SafeInput.getRegExString(pipe, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("SSN recieved:"+ssn);

        String ucStudentMNo=SafeInput.getRegExString(pipe, "Enter your UC student M number", "(M|m)\\d{5}");
        System.out.println("UC student M number recieved:"+ucStudentMNo);

        String menuChoice=SafeInput.getRegExString(pipe, "Enter your menu choice", "[OoSsVvQq]");
        System.out.println("Menu choice recieved:"+menuChoice);
    }
}
