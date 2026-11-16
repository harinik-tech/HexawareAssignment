class Node {

    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}

public class MiddleNode {

    Node head = null;

    void add(int value) {

        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {

            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }

    void showMiddle() {

        Node slow = head;
        Node fast = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle Node: " + slow.data);
    }

    public static void main(String[] args) {

        MiddleNode obj = new MiddleNode();

        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.add(50);

        obj.showMiddle();
    }
}