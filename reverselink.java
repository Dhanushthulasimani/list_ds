import java.util.Scanner;

public class reverselink {

    public static class node {
        int data;
        node next;
    }

    static node head1, last1, head2, last2, head, last;

    public static void add(int n) {
        node nn = new node();

        nn.data = n;
        nn.next = null;

        if (head == null) {
            head = nn;
            last = nn;
        } else {
            last.next = nn;
            last = nn;
        }
    }

    public static void add1(int n) {
        node nn = new node();

        nn.data = n;
        nn.next = null;

        if (head1 == null) {
            head1 = nn;
            last1 = nn;
        } else {
            last1.next = nn;
            last1 = nn;
        }
    }

    public static void add2(int n) {
        node nn = new node();

        nn.data = n;
        nn.next = null;

        if (head2 == null) {
            head2 = nn;
            last2 = nn;
        } else {
            last2.next = nn;
            last2 = nn;
        }
    }

    public static void printlist() {
        node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void findnum() {
        int num1 = 0;
        int num2 = 0;

        node temp = head1;
        while (temp != null) {
            num1 = num1 * 10;
            num1 = num1 + temp.data;
            temp = temp.next;
        }

        temp = head2;
        while (temp != null) {
            num2 = num2 * 10;
            num2 = num2 + temp.data;
            temp = temp.next;
        }

        int ans = num1 + num2;
        solve(ans);
    }

    public static void solve(int n) {
        while (n > 0) {
            int x = n % 10;
            add(x);
            n = n / 10;
        }
        printlist();
    }

    public static void find(int a[], int n, int b[], int m) {
        reverselink l = new reverselink();
        n = n - 1;
        m = m - 1;

        while (n >= 0) {
            l.add1(a[n]);
            n--;
        }

        while (m >= 0) {
            l.add2(b[m]);
            m--;
        }
        findnum();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sc1 = s.nextLine();
        String sc2 = s.nextLine();

        String st1[] = sc1.split(" ");
        int n1 = st1.length;

        int a1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = Integer.parseInt(st1[i]);
        }

        String st2[] = sc2.split(" ");
        int n2 = st2.length;

        int a2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = Integer.parseInt(st2[i]);
        }

        find(a1, n1, a2, n2);
    }
}
