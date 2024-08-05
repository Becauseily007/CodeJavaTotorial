public class MonthDay {
    public static void main(String[] args) {
        String [] month ={ "january","February","March","April","May"
        ,"june","july","September","October","November","December"};
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        for(int index =0; index < month.length; index++){
System.out.println(month[index]+ " has " +days[index]+" days.");
        }
    }
}
