// // add first in Linked List

// // public class LinkedList {
// //     public static class Node {
// //         int data;
// //         Node next;

// //         Node(int data) {
// //             // constructor which is a special type of method with no returns
// //             this.data = data;
// //             this.next = null; // initailly we keep the value of the next as null
// //         }

// //     }

// //     public static Node head;
// //     public static Node tail;

// //     public void addFirst(int data) { // we do not need to make this class static as we have made a ll object in the
// //                                      // main fxn and now it can be called without being static also

// //         // create a new node
// //         Node newNode = new Node(data); // just as creating a object. node - class and new node is name, node() is
// //                                        // constructor
// //         // if the linked list is empty
// //         if (head == null) {
// //             head = tail = newNode;
// //             return;
// //         }
// //         // step 2 - newnode next = head storing the adress of the head
// //         newNode.next = head; // linking step . this is the step which creates a linked list
// //         // step 3 head = new node making a new head which is added right now
// //         head = newNode;

// //     }

// //     public static void main(String args[]) {
// //         LinkedList ll = new LinkedList();
// //         ll.addFirst(1); // this will become the tail as it is a add first function
// //         ll.addFirst(3); // this will become the head

// //     }
// // }

// // add last in Linked List

// public class LinkedList {

//     public static class Node {
//         int data;
//         Node next; // data type is node as it will point towards a node

//       public  Node(int data) { // constructor is called with parameter node
//             this.data = data;
//             this.next = null; // we always initilaize node with null as the ending value of the linked list is
//                               // null

//         }

//         public static Node head; // a node return type head decalration it should be static as well as tail also
//                                  // because we only have one head and one tail
//         public static Node tail;

//         public static void main(String args[]) {

//             LinkedList ll = new LinkedList(); // making a object of linkedlist so that we can call non static functions
//                                               // also
//             ll.addLast(2);
//             ll.addLast(3); // this will be the tail of the ll
//         }

//         public void addLast(int i) {
//             // creating a new node
//             Node newNode = new Node(data); // constructor of node class will be called as we have made a object of class
//                                            // node

//             // if this is a special case where ll is emplty
//             if (head == null) { // here we can equate linked to null as well but by convention if the head is
//                                 // null then only linked list is considered as null
//                 head = tail = newNode;
//                 return; // because in this case the head nad the tail is the same node
//             }
//             // step -2 making tail next point to new node
//             tail.next = newNode; // here we are linking the nodes
//             // step -3 making the new node as tail
//             tail = newNode;

//         }
//     }

// }

// make a linked list and print its elements 

public class LinkedList {

    public static class Node { // this is static because we have to define the node only once
        int data;
        Node next;

        public Node(int data) { // calling the constructor
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail; // static beacuse there is only one head and tail in a linked list
    public static int size;

    // adding the data to the linked list
    public void addFirst(int data) { // here a argument data is taken because we want to add the data to the linked
                                     // list
        // we have to add a new node
        Node newNode = new Node(data); // object of node class with argument according to the constructor. we have to
                                       // define the argument because we ha ve to initilaize the value of dat and null
        size++;
        // if the linked list is empty
        if (head == null) {
            head = tail = newNode;
            return; // this is the special case
        }
        // step - 2 saving the address of the header in new node. beacuse in next we
        // store adress
        newNode.next = head;
        // making new node as the head
        head = newNode;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        // if special case
        if (head == null) { // according to the ll converntion a ll is consider null only is the header is
                            // null we donot check for tail
            head = tail = newNode;
        }
        // step -2 tail pointing towards the new node
        tail.next = newNode;
        // step -3 new node is the new tail
        tail = newNode;

    }

    // add in the middle
    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }

        // create a new node
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        // not search for previous elemnent
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // printing the linked list
    public void print() { // head apne pass already hae so we donot need to pass any argument here
        // base case
        if (head == null) {
            System.out.println("Linke list is empty");
            return;
        }
        Node temp = head; // this temperoray node will iterate the linked list
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;

        }
        System.out.print("null");
    }

    // remove a value from linked list remove first
    public int removeFirst() {
        int value = head.data; // value to be deleted automatically by the garbage collector
        // as this is a singly linked list so we just have forward links
        head = head.next; // chaning the value of head to next node
        return value;
    }

    public static void main(String argsp[]) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1); // this would be our head
        ll.addLast(3);
        ll.addLast(4); // this would be our tail
        ll.add(2, 9);
        ll.print();
        System.out.println();
        System.out.println(ll.size);
        ll.removeFirst();
        ll.print();

    }
}