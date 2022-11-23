import java.util.Scanner;
import java.util.regex.Pattern;
public class SafeInput {
    Scanner in = new Scanner(System.in);

    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";  // Set this to zero length. Loop runs until it isn’t
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;
    }

    public static int getInt(Scanner pipe, String prompt) {

        int input = -1;

        System.out.println(prompt + "int:");

        if (pipe.hasNextInt()) {

            input = pipe.nextInt();
        }

        pipe.reset();

        return input;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double input = -1.0;

        System.out.println(prompt + "double:");

        if (pipe.hasNextDouble()) {

            input = pipe.nextDouble();
        }

        pipe.reset();

        return input;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int input = -1;
        System.out.println(prompt + "int[" + low + "-" + high + "]:");

        if (pipe.hasNextInt()) {

            input = pipe.nextInt();

            if (input > low && input < high) {
                pipe.reset();

                return input;
            }
            pipe.reset();
            return -1;
        }
        pipe.reset();
        return -1;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double input = -1;
        System.out.println(prompt + "double[" + low + "-" + high + "]:");
        if (pipe.hasNextDouble()) {
            input = pipe.nextDouble();

            if (input > low && input < high) {
                pipe.reset();
                return input;
            }
            pipe.reset();
            return -1.0;
        }
        pipe.reset();
        return -1.0;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        char input;
        int repeat = 0;
        do {

            System.out.println(prompt + "Yes or No[Y/N]:");

            input = pipe.next().charAt(0);

            if (input == 'y' || input == 'Y') {
                pipe.reset();

                return true;
            } else if (input == 'n' || input == 'N') {
                pipe.reset();

                return false;
            } else {
                pipe.reset();
                repeat = 1;
            }

        } while (repeat != 0);

        pipe.reset();
        return false;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String input;

        System.out.println(prompt + "String that Matches " + regEx + ":");

        if (pipe.hasNext()) {

            input = pipe.next();
            pipe.reset();
            if (Pattern.matches(regEx, input)) {
                return input;
            }
            return null;
        }
        pipe.reset();
        return null;//if not matches return null;
    }

    public static void prettyHeader(String msg) {
        int starCount = 60;
        while (starCount != 0) {
            System.out.print("*");
            starCount--;
        }
        System.out.println();
        int starsonLeft = (60 - msg.length()) / 2;
        int left = 1;
        while (left <= starsonLeft) {
            System.out.print("*");
            left++;
        }
        System.out.print(msg);
        int right = 0;
        while (right <= starsonLeft) {
            System.out.print("*");
            right++;
        }
        System.out.println();
        starCount = 60;
        while (starCount != 0) {
            System.out.print("*");
            starCount--;
        }

    }
}
