public class oops {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Sahil";
        s1.roll = 83;
        s1.password = "abc";
        s1.marks[0] = 100;
        s1.marks[1] = 323;
        s1.marks[2] = 321;
        Student s2 = new Student(s1);
        System.out.println(s2.name);
    }
}

class Student {
    String name;
    String password;
    int roll;
    int marks[];

    Student() {
        marks = new int[3];
        System.out.println("Non- parametrized constructor is called");
    }

    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = s1.password;
        this.marks = s1.marks;
    }
}