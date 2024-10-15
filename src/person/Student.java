package person;

public class Student extends Person {
    private String major;

    public Student(String name, int age, String major){
        super(name,age);
        this.major = major;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, my name is " + super.name + "I'm " + super.age + "years old, and I'm studying " + major + ".");
    }
}
