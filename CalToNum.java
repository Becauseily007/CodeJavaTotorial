import java.util.Scanner;

public class CalToNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("โปรดเลือกการคำนวณ:");
        System.out.println("1. คำนวณบวกเลข");
        System.out.println("2. คำนวณคูณเลข");
        System.out.println("3. คำนวณหารเลข");
        System.out.println("4. คำนวณลบเลข");
        System.out.print("เลือก (1-4): ");
        int choice = scanner.nextInt();

        
        if (choice < 1 || choice > 4) {
            System.out.println("การเลือกไม่ถูกต้อง กรุณาเลือก 1-4");
            return;
        }

       
        System.out.print("กรุณากรอกตัวเลขสองตัว:\n");
        System.out.print("ตัวเลขที่ 1: ");
        double num1 = scanner.nextDouble();
        System.out.print("ตัวเลขที่ 2: ");
        double num2 = scanner.nextDouble();

        
        double result;
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.printf("ผลลัพธ์ของ %.2f + %.2f = %.2f\n", num1, num2, result);
                break;
            case 2:
                result = num1 * num2;
                System.out.printf("ผลลัพธ์ของ %.2f * %.2f = %.2f\n", num1, num2, result);
                break;
            case 3:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.printf("ผลลัพธ์ของ %.2f / %.2f = %.2f\n", num1, num2, result);
                } else {
                    System.out.println("ข้อผิดพลาด: การหารด้วยศูนย์ไม่สามารถทำได้");
                }
                break;
            case 4:
                result = num1 - num2;
                System.out.printf("ผลลัพธ์ของ %.2f - %.2f = %.2f\n", num1, num2, result);
                break;
            default:
                System.out.println("ตัวเลือกไม่ถูกต้อง");
                break;
        }

        scanner.close();
    }
}
