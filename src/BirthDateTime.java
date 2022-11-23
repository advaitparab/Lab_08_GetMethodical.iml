import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        int yearOfBirth=SafeInput.getRangedInt(pipe, "Enter your year of birth",1950,2010);
        System.out.println("Your year of birth recieved:"+yearOfBirth);
        int monOfBirth=SafeInput.getRangedInt(pipe, "Enter your month of birth",1,12);
        System.out.println("Your month of birth recieved:"+monOfBirth);
        int dayOfBirth=0;
        switch(monOfBirth)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:dayOfBirth=SafeInput.getRangedInt(pipe, "Enter your day of birth",1,31);break;
            case 2:dayOfBirth=SafeInput.getRangedInt(pipe, "Enter your day of birth",1,29);break;
            default: dayOfBirth=SafeInput.getRangedInt(pipe, "Enter your day of birth",1,30);break;

        }
        System.out.println("Your day of birth recieved:"+dayOfBirth);
        int hrOfBirth=SafeInput.getRangedInt(pipe, "Enter your hour of birth",1,24);
        System.out.println("Your hour of birth recieved:"+hrOfBirth);
        int minOfBirth=SafeInput.getRangedInt(pipe, "Enter your minute of birth",1,59);
        System.out.println("Your minute of birth recieved:"+minOfBirth);

    }

}
