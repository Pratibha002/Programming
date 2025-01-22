package Iterator;

/*
In Java, generics allow us to write methods that can operate on objects of various types while providing compile-time type safety.
Here’s an example of a generic method that can accept objects of any class:

public static <T> void printInfo(T anyObj) {
    System.out.println("You are in a generic method that can handle any type.");
}

This method will work with any type, such as Human, Doctor, Dog, or Bird.

If we want to restrict the method to only accept objects of a specific type or its subclasses,
we can use a type bound in the generic method. For example:

public static <T extends Human> void printInfo(T onlyHuman) {
    System.out.println("You are in a method that only handles types extending Human.");
}

With this method, only instances of Human or its subclasses (like Doctor) will be accepted.
Other types like Dog or Bird will result in a compilation error.


we have a compareTo method as well inside the String, Integer class to compare the values/objects if
System.out.println("a".compareTo("x"));  -ve integer, if the current object is lesser than the specified object
here we get the -ve integer value because this condition is false
x is grater than a, x comes after the a

System.out.println("c".compareTo("a"));  +ve integer, if the current object is greater than the specified object
here we get the +ve integer value because this condition is true
a is grater than c, a comes before the c


System.out.println("c".compareTo("d"));  0 if the current object is equal to the specified object

System.out.println(new Integer(10).compareTo(100));  -ve integer, because 10 comes before 100
current object is lesser than the specified object

System.out.println(new Integer(100).compareTo(10));  +ve integer, because 100 current object is
greater than the specified object 10

==>comparable is an interface still we can use extends keyword to extend it because it is allowed in
generics.
static <T extends Comparable<? super T>>void  ==> sort(List<T>  list>)
sort the specified list into ascending order, according to the natural ordering of its elements.

==> static <T> void  ==> sort (List<T> list, Comparator<? super T> c)
sort the specified list according to the order induced by the specified comparator

*/

class Human {

}

class Doctor extends Human {

}

class Animal {

}

class Dog extends Animal {

}

class Birds {

}

public class Test {
    // Generic method that can handle any type
    public static <T> void printInfo(T anyObj) {
        System.out.println("You are in a generic method that can handle any type.");
    }

    // Generic method that only accepts types extending Human
    public static <T extends Human> void printInfoHuman(T onlyHuman) {
        System.out.println("You are in a method that only handles types extending Human.");
    }

    public static void main(String[] args) {
        // This will call the generic method that can handle any type
        printInfo(new Human());
        printInfo(new Doctor());
        printInfo(new Dog());
        printInfo(new Birds());

        // This will call the method restricted to types extending Human
        printInfoHuman(new Human());
        printInfoHuman(new Doctor());

        // Uncommenting the following lines will cause compilation errors
        // printInfoHuman(new Dog()); // Error: Dog does not extend Human
        // printInfoHuman(new Birds()); // Error: Birds does not extend Human
    }
}
