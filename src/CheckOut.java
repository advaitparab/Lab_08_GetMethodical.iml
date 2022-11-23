import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);

        boolean hasMoreItems=SafeInput.getYNConfirm(pipe, "Do you have an item to bill?");
        double sumOfItems=0;
        while(hasMoreItems)
        {
            double price=SafeInput.getRangedDouble(pipe, "Enter price of your item",0.50,9.99);
            sumOfItems+=price;
            hasMoreItems=SafeInput.getYNConfirm(pipe, "Do you have an item to bill?");
        }

        System.out.printf("Sum amount :%.2f",sumOfItems);

    }

}
