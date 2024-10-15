package person;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("Alice", 20);
        people[1] = new Student("Bob", 22, "CS");
        people[2] = new Person("Charlie", 25);
        for (int i=0; i<people.length;i++){
            if (people[i] instanceof Student){
                System.out.println("this is a student");
            }
            else {
                System.out.println("This isnt a student");
            }
            people[i].introduce();
        }

    }
}
