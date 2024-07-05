public class FindMIDDLEelemnt {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    public void addLast(int item) {
        Node nn = new Node(item);
        if (this.size == 0) {
            this.head = nn;
            this.tail = nn;
        } else {
            this.tail.next = nn;
            this.tail = nn;
        }
        this.size++;
    }

    public int findMiddleElement() {
        if (this.size == 0) {
            throw new IllegalStateException("Linked list is empty");
        }

        Node slow = this.head;
        Node fast = this.head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    public void printList() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FindMIDDLEelemnt list = new FindMIDDLEelemnt();
        list.addLast(10);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(40);

        list.printList();

        int middleElement = list.findMiddleElement();
        System.out.println("Middle Element: " + middleElement);
    }
}
