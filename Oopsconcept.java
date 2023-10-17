// // // // // // // public class Oopsconcept {
// // // // // // //     public static void main(String args[]) {
// // // // // // //         Student s1 = new Student();
// // // // // // //         s1.name = "Sahil";
// // // // // // //         s1.roll = 83;
// // // // // // //         s1.password = "abc";
// // // // // // //         s1.marks[0] = 100;
// // // // // // //         s1.marks[1] = 323;
// // // // // // //         s1.marks[2] = 321;
// // // // // // //         Student s2 = new Student(s1); // copying the values of the s1 to s2
// // // // // // //         // changing marks of s1 to see that what will be the outcome on s2 after copying
// // // // // // //         // the statement
// // // // // // //         s1.marks[2] = 555;
// // // // // // //         System.out.println(s2.name);
// // // // // // //         for (int i = 0; i < 3; i++) {
// // // // // // //             System.out.println(s2.marks[i]);
// // // // // // //         }
// // // // // // //     }
// // // // // // // }

// // // // // // // class Student {
// // // // // // //     String name;
// // // // // // //     String password;
// // // // // // //     int roll;
// // // // // // //     int marks[];

// // // // // // //     Student() {
// // // // // // //         marks = new int[3];
// // // // // // //         System.out.println("Non- parametrized constructor is called");
// // // // // // //     }
// // // // // // //     // Shallow copy constructor

// // // // // // //     // Student(Student s1) {
// // // // // // //     // marks = new int[3];
// // // // // // //     // this.name = s1.name;
// // // // // // //     // this.roll = s1.roll;
// // // // // // //     // this.password = s1.password;
// // // // // // //     // this.marks = s1.marks;
// // // // // // //     // }

// // // // // // //     // deep copy constructor
// // // // // // //     Student(Student s1) {
// // // // // // //         marks = new int[3];
// // // // // // //         this.name = s1.name;
// // // // // // //         this.roll = s1.roll;
// // // // // // //         this.password = s1.password;
// // // // // // //         for (int i = 0; i < marks.length; i++) {
// // // // // // //             this.marks[i] = s1.marks[i];
// // // // // // //         }
// // // // // // //     }
// // // // // // // }

// // // // // // public class Oopsconcept {
// // // // // //     public static void main(String args[]) {

// // // // // //         // Fish shark = new Fish();
// // // // // //         // shark.eat();

// // // // // //         // }
// // // // // //         Dog sugar = new Dog();
// // // // // //         sugar.eat();
// // // // // //         sugar.legs = 4;
// // // // // //         System.out.println(sugar.legs);
// // // // // //     }
// // // // // // }
// // // // // // // SINGLE LEVEL INHERITANCE
// // // // // // class Animal { // parent class or base class
// // // // // // String skincolor;

// // // // // // // void eat() {
// // // // // // // System.out.println("eats");
// // // // // // // }

// // // // // // // void breathe() {
// // // // // // // System.out.println("breathes");
// // // // // // // }
// // // // // // // }

// // // // // // // class Fish extends Animal { // derived class or child class or sub class
// // // // // // // int fins;

// // // // // // // void swim() {
// // // // // // // System.out.println("swims");
// // // // // // // }

// // // // // // // MULTI - LEVEL INHERITANCE

// // // // // // class Animal { // parent class or base class
// // // // // //     String skincolor;

// // // // // //     void eat() {
// // // // // //         System.out.println("eats");
// // // // // //     }

// // // // // //     void breathe() {
// // // // // //         System.out.println("breathes");
// // // // // //     }
// // // // // // }

// // // // // // class Mamal extends Animal { // derived class or child class or sub class
// // // // // //     int legs;
// // // // // // }

// // // // // // class Dog extends Mamal {
// // // // // //     String breed;
// // // // // // }

// // // // // //  HIERARCHIAL INHERITANCE 
// // // // // //  it is basically multiple drived class inherits the property of animal class

// // // // // // POLYMORPHISM

// // // // // // COMPILE TIME POLYMORPHISM

// // // // // public class Oopsconcept {
// // // // //     public static void main(String args[]) {
// // // // //         Calculator calc = new Calculator();
// // // // //         System.out.println(calc.sum(4, 2));
// // // // //         System.out.println(calc.sum((float) 4.0, (float) 23.1));
// // // // //         System.out.println(calc.sum(32, 534, 22));

// // // // //     }
// // // // // }

// // // // // class Calculator {

// // // // //     int sum(int a, int b) {
// // // // //         return a + b;
// // // // //     }

// // // // //     float sum(float a, float b) {
// // // // //         return (a + b);
// // // // //     }

// // // // //     int sum(int a, int b, int c) {
// // // // //         return a + b + c;
// // // // //     }
// // // // // }

// // // // // RUN TIME POLYMORPHISM - METHOD OVERRIDING

// // // // public class Oopsconcept{
// // // //     public static void main(String args[]){
// // // //     Deer d = new Deer();
// // // //     d.eat();
// // // //     }
// // // // }
// // // // class Animal{ // parent class
// // // //     void eat(){ // same fxn in parent and child class with different definitions
// // // //         System.out.println("ANYTHING");
// // // //     }
// // // // }

// // // // class Deer extends Animal{ // child class

// // // //     void eat(){
// // // //         System.out.println("GRASS");
// // // //     }
// // // // }

// // // public class Oopsconcept {

// // //     public static void main(String args[]) {
// // //         Mustang myHorse = new Mustang();
// // //         // Horse h = new Horse();
// // //         // Chicken c = new Chicken();
// // //         // h.eat();
// // //         // h.walk();
// // //         // c.eat();
// // //         // c.walk();
// // //         // System.out.println(h.color);
// // //     }
// // // }

// // // abstract class Animal {
// // //     // abstract class objects cannot be created but constructors can be
// // //     String color;

// // //     void eat() {
// // //         System.out.println("ANYTHING");
// // //     }

// // //     abstract void walk(); // this is a abstract method it does not have nay implementation here

// // //     Animal() { // lets make a constructor in asbtract class
// // //         System.out.println("animal constructor is called");
// // //     }
// // // }

// // // class Horse extends Animal {
// // //     void changeColor() {
// // //         color = "dark brown";
// // //     }

// // //     void walk() {
// // //         System.out.println("Walks on 4 legs");
// // //     }

// // //     Horse() {
// // //         System.out.println("Horse constructor is called");
// // //     }
// // // }

// // // class Chicken extends Animal {
// // //     void color() {
// // //         color = "yellow";
// // //     }

// // //     void walk() {
// // //         System.out.println("Walks on 2 legs");
// // //     }
// // // }

// // // class Mustang extends Horse {
// // //     Mustang() {
// // //         System.out.println("Mustang construtor is called");
// // //     }
// // // }

// // //INTERFACING
// // public class Oopsconcept {
// //     public static void main(String args[]) {
// //         Queen q = new Queen();
// //         q.move();

// //     }
// // }

// // interface ChessBoard {
// //     void move(); // this is a idea basically we cannot write implementation and it should be
// //                  // public static and abstract
// //                  // we have juwst defined the function now the implementation will be given by sub classes respectively 
// //                  // we have achieved 100% abstraction here.
// // }

// // class Queen implements ChessBoard {
// //     public void move() { // public keyword is there because the interface are public and static
// //         System.out.println("up , down , left , right , diagonal - in all directions");
// //     }
// // }

// // class Rook implements ChessBoard {
// //     public void move() {
// //         System.out.println(" up , downn , left , right - in all directions");
// //     }
// // }

// // class King implements ChessBoard {
// //     public void move() {
// //         System.out.println(" up , down , right , left , diagonal - in 1 step");
// //     }
// // }

// // MULTIPLE INHERITANCE USING INTERFACES

// public class Oopsconcept {
//     public static void main(String args[]) {

//         Bear b = new Bear();
//         b.carni();
//         b.herbi();
//         b.vore();
//     }
// }

// interface Herbivore {
//     void herbi();

//     void vore();
// }

// interface Carnivore {
//     void carni();

//     void vorii();
// }

// class Bear implements Herbivore, Carnivore { // we can write as number as super interfaces as we want
//     public void herbi() {
//         System.out.println("herbi");
//     }

//     public void vore() {
//         System.out.println("voreee");
//     }

//     public void carni() {
//         System.out.println("carni0");
//     }

//     public void vorii() {
//         System.out.println("voriii");
//     }
// }

//STATIC KEYWORD-

public class Oopsconcept {
    public static void main(String args[]) {
        // Student s1 = new Student();
        // s1.schoolName = "Shishu niketan model senior eecondary school";

        // Student s2 = new Student();
        // System.out.println(s2.schoolName);
        Sahilsinha good = new Sahilsinha();

    }
}

class Student {
    Student() {
        System.out.println("Student constructor is called");
    }

    String name;
    int rollno;
    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}

class Sahilsinha extends Student {
    Sahilsinha() {
        super();
        System.out.println("Sahil constructor is called");
    }
}