public class ArrayLnitia {
    public static void main(String[] args) {
        int [] days = {31 ,28 ,31 ,30 , 31, 30,31 ,31 ,30 ,31 ,30 ,31};
        for(int index = 0; index < days.length; index++){
            System.out.println("Month" +(index + 1) + "has " +days[index]+" days. ");
        }
    }
}
