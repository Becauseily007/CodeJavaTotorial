import java.util.Scanner;
public class ifAct {
    public static void main(String[] args) {
        double radius;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        radius = in.nextDouble();  
        if(radius > 60)
            System.out.println("\"you are pass ");
        else{
           
            System.out.println("\"you are not pass" );
        }
       
     }
}
