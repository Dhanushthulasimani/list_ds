package ReversestackusinglinkedlistDS;


import java.util.Stack;

public class ReverSTACK {

    public static class Node {
        int data;
        Node next;

        // Constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node find(Node head) {
        Node temp = head;
        Stack<Integer> stack = new Stack<>();
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            temp.data = stack.pop();
            temp = temp.next;
        }
        return head;
    }

    public static void printk(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Before reversed:");
        printk(head);

        Node ans = find(head);

        System.out.println("After reversed:");
        printk(ans);
    }
}
