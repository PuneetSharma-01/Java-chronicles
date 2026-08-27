class Student {
    int id = 101;
    String name = "Puneet";
}

public class ObjectClassDemo {
    public static void main(String[] args) {

        Student s = new Student();

        System.out.println("Class Name: " + s.getClass());
        System.out.println("Hash Code: " + s.hashCode());
        System.out.println("Object: " + s.toString());
    }
}