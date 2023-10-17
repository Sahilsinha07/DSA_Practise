import java.util.Scanner;

public class Linkedlisting {
    public static Scanner sc = new Scanner(System.in);

    public class Node {
        int data;
        Node next; // return type is the class itself as it will point towards the other node

        public Node(int data) { // constructor with argumenet data
            this.data = data; // this keyword is used to point the current variable
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add first in linked list
    public void addFirst(int data) {
        // we have to add a node in first place
        // create a new node
        Node newNode = new Node(data);
        size++;
        if (head == null) { // if the linked list is empty
            head = tail = newNode;
        }
        newNode.next = head; // new node next is pointing towards next
        head = newNode; // making new node as head
    }

    // add last in linked list
    public void addLast(int data) {
        Node newNode = new Node(data); // making a new node
        size++;
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // add in middle using index
    public void addMiddle(int index, int data) {
        // tell the index and data that you want to add in the linked list
        Node newNode = new Node(data);
        size++;
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        // now we are standing at the node where next we have to add the newnode
        newNode.next = temp.next; // now new node next is pointing at the temp next
        temp.next = newNode;

    }

    // printing a linked list
    public void print() {
        Node temp = head; // making a temperoary node as head
        while (temp != null) {
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // remove fist
    public int removeFirst() {
        // this will retunr the value that has been removed
        int value = head.data;
        head = head.next; // rest work will be done by garbage collector
        size--;
        return value;
    }

    // remove last
    public int removeLast() {
        int value = tail.data;
        // tail previous node will start poiniting null and become tail
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        // now we are standing on then previous node of the tail
        temp.next = null;
        tail = temp;
        size--;
        return value;
    }

    // remove nth node from the end
    public void deleteNthNodeFromEnd(int n) {
        // if nth node is the head node from end
        if (size == n) {
            head = head.next; // this is the case where we have to delete the head
            return;
        }
        Node temp = head;
        for (int i = 1; i < size - n; i++) {
            temp = temp.next;
        }
        // now we are standing on the previous node
        temp.next = temp.next.next;
        return;
    }

    // check if the linked list is pallindrome or not

    // step -1 slow fast technique to find middle
    public static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // increment by +1
            fast = fast.next.next; // increment by +2
            // ya to odd ka case satisfy ho jaie ya phir even ka koi scene nhi h

        }
        return slow;
    }

    public static boolean checkPalindrome() {
        // base case
        if (head == null || head.next == null) {
            return true; // because if the linked list is empty or has only one node, then it is
                         // automatically a palindrome
        }

        // step -1 find middle
        Node middle = findMiddle(head);

        // step -2 reverse the 2nd half
        Node previous = null;
        Node current = middle;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        // step -3 compare left and right
        Node left = head; // head of the left side
        Node right = previous; // head of the right side
        while (right != null) {
            if (right.data != left.data) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }

    // check if cycle exits in a Linked list
    // Flyod's Cycle detection Algorithm
    public static boolean checkCycle() {
        // slow fast technique
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1 move
            fast = fast.next.next; // +2 move
            if (slow == fast) {
                return true; // condition for cycle
            }
        }
        return false;
    }

    // remove a cycle in a linked list

    public static void removeCycle() {
        // use slow fast method to find if the cycle is exists or not
        Node slow = head;
        Node fast = head;
        boolean isCycle = false; // to check if the cycle exists or not
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next; // +2 moves
            if (slow == fast) {
                isCycle = true; // cycle exists and break from the loop becasue we want to make the fast value
                                // the same where they have meet and initilaize slow from head again
                break;
            }
        }
        if (isCycle == false) {
            System.out.println("Loop does not exits ");
            return; // if loop does not exists then return to main function
        }
        slow = head;
        Node prev = null; // a tracker for fast to track which nodes the fast has visited
        while (slow != fast) {
            // loop until slow and fast meets again
            prev = fast; // a tracker for fast to track previous nodes which fast has visited
            slow = slow.next;
            fast = fast.next; // reducing the speed of the fast to +1
        }
        // now the prev is on the previous node of the fast which is the node which is
        // pointing to the inner node of the linked list and we need to make it point
        // towards null to make it singly linked list
        prev.next = null;
        return; // kaaam khtm apne apne ghr laut jaooo
    }

    // main method
    public static void main(String args[]) {
        Linkedlisting ll = new Linkedlisting(); // making the object of the class so that non static methods can be
                                                // imported and
        // this is basically initilaizing the linked list

        // ll.addFirst(3);
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.addMiddle(2, 69);
        // ll.print();
        // ll.removeFirst();
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);
        // ll.deleteNthNodeFromEnd(3); // we want to delete 3 node from the end
        // System.out.println();
        // ll.print();
        // System.out.println(ll.size);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        Node temp = head.next;
        temp.next = head.next.next;
        tail.next = temp;

        // ll.print();
        // System.out.println("The linked list is pallindrome ---> " +
        // checkPalindrome());
        System.out.println("The linled list is cycle ---> " + checkCycle());
        removeCycle();
        ll.print();
        System.out.println("The linled list is cycle ---> " + checkCycle());
    }
}