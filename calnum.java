import java.util.Scanner;
public class calnum {
    public static void main(String[] args) {
        int x,y;
        Scanner in = new Scanner(System.in);
        System.out.print("Input Number 1 : ");
        x = in .nextInt();
        System.out.println("your number1 is : "+x);
        System.out.print("Input Number 2 : ");
        y = in.nextInt();
        System.out.println("your number2 is : "+y);
        System.out.println(x+ " + " +y+  " = " +(x+y));
    }
}
