import java.util.Scanner;
public class CtoFTableDisplay {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        double CelciusStart=-100.0;
        double CelciusEnd=100.0;
        while(CelciusStart<=CelciusEnd)
        {
            System.out.println("|"+CelciusStart+"|"+CtoF(CelciusStart)+"|");
            CelciusStart+=1.00;
        }

    }

    public static double CtoF(double Celsius) {
        double fah=((9*Celsius)/5)+32;
        return fah;

    }

}
