public class Student {
    private String id;
    private String name;
    private String gpa;
    public static void setDetails(String ID, String n, double GPA) {
        id = ID;
        name = n;
        gpa = GPA;
    }
    public void showDetails(){
        System.out.println("ID : " +id);
        System.out.println("name : " +name);
        System.out.println("gpa : " +gpa);

    }

}
