public class ResultTo100 {
    public static void main(String[] args) {

        int sum = 0;
        int number = 1;

        while (number <= 100) {
            sum += number;  
            number += 1;    
        }

        System.out.println("ผลรวมของจำนวนจาก 1 ถึง 100 คือ: " + sum);
    }
}
