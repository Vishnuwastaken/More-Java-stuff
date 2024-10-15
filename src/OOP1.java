class student{
    private int rolenumber;
    private String name;
    private float marks;

    public student(int roll, String s_name, float grades){
        rolenumber = roll;
        name = s_name;
        marks = grades;
    }

    public int getRolenumber() {
        return rolenumber;
    }

    public float getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }
}
public class OOP1 {
    public static void main(String[] args) {
        student s1 = new student(10,"bob", 4);
        s1.setMarks(7);
        System.out.print(s1.getRolenumber() + " , " + s1.getName() + " , " + s1.getMarks());
    }

}


