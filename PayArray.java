import java.util.*;
public class PayArray {
    public static void main(String[] args) {
        final int EMPLOYEES = 5;
        double payRatge;
        double grossPay;
        int [ ] hours = new int[EMPLOYEES];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the hours worked by"+EMPLOYEES+" employees who all earn ") ;
        for(int index =0; index < EMPLOYEES; index++){
            System.out.print("Employees #" +(index +1 ) + " : ");
            hours[index] = in.nextInt();
        }
        System.out.print("Enter the hourly pay rate for each employees : ");
        payRatge = in.nextDouble();
        for(int index = 0; index < EMPLOYEES; index++){
            grossPay = hours[index] + payRatge;
            System.out.println("Employee #" +(index + 1) +" : $"+grossPay);

        }

    }
}
