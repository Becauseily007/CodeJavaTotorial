public class ExNo2 {
    public static void main(String[] args) {
        
        int max = 100;
        System.out.println("ตัวเลขที่ไม่เกิน " + max + " ที่หารด้วย 3 และ 5 ลงตัว:");

    
        for (int i = 1; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
