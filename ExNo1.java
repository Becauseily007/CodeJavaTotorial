public class ExNo1 {
    public static void main(String[] args) {
        
        int start = 1;
        int end = 100;

        System.out.println("เลขจำนวนเต็มที่เป็นเลขคู่จาก " + start + " ถึง " + end + ":");
        for (int i = start; i <= end; i++) {
          
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
