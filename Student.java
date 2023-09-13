package practice;

public class Student {

    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {

        Student s1 = new Student(101, "John");
        Student s2 = new Student(101, "John");

        System.out.println(s1.equals(s2)); // true - compares content (overriden)
        System.out.println(s1 == s2); // false - compares address

        String s3 = new String("hi");
        String s4 = new String("hi");

        System.out.println(s3.equals(s4)); // true - compares content of objects

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

}