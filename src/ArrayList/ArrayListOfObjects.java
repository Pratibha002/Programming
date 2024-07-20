package ArrayList;
import java.util.ArrayList;
import java.util.Collections;


class Stud implements Comparable<Stud> {
    private int age;
    private String name;

    // Constructor
    public Stud(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // Getters
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // Override toString() for better printing
    @Override
    public String toString() {
        return "Stud{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Stud other) {
        return Integer.compare(this.age, other.age);
    }
}

public class ArrayListOfObjects {
    public static void main(String[] args) {
        ArrayList<Stud> student = new ArrayList<Stud>();

        // Add instances of Stud to the ArrayList
        student.add(new Stud(3, "John"));
        student.add(new Stud(4, "Marry"));
        student.add(new Stud(1, "Akki"));
        student.add(new Stud(2, "Bhanu"));
        student.add(new Stud(5, "Peter"));

        // Print each Stud object using overridden toString() method
        for (Stud s : student) {
            System.out.println(s);
        }
        Collections.sort(student);
        System.out.println("Sorted by age (ascending):");
        System.out.println(student);

        Collections.sort(student, Collections.reverseOrder());
        System.out.println("Sorted by age (descending):");
        System.out.println(student);
    }
}


