import java.util.Scanner;
public class age {
    public static void main(String[] args) {
        final int Age =20;
        int inputAge;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age : ");
        inputAge = scan.nextInt();
        System.out.println("you entered : " +inputAge);
        if(inputAge < 20)
            System.out.println("you are still yong");
            System.out.println("Good Bye");
    }
}
