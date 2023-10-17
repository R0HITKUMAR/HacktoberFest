public class LinkedList1 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addfirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    public void print(){
        if( head == null){
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while( temp != null){
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add( int idx, int data) {
        if(idx == 0) {
            addfirst(data);
            return;
        }
        Node newNode = new Node (data);
        Node temp = head;
        int i = 0;
        while(i < idx - 1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        int val = head.data;
        head = head.next;
        return val;

    }

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while(temp != null) {
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }


    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data== key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1; 
        }
        return idx+1;

    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthfromEnd(int n) {
        int sz = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            sz++;
        }
        if(n == sz) {
            head = head.next;
            return ;
        }
        // sz-n 
        int i = 1;
        int itoFind = sz - n;
        Node prev = head;
        while( i < itoFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }


    public static void main(String args[]) {
        LinkedList1 ll = new LinkedList1();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.print();
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.print();
        ll.add(2, 3);
        ll.print();
        // ll.removeFirst();
        // ll.print();
        // ll.removeFirst();
        // ll.print();
        //System.out.println(ll.itrSearch(3));
        //System.out.println(ll.itrSearch(10));
        //System.out.println(ll.recSearch(5));
        //ll.reverse();
        //ll.print();
        ll.deleteNthfromEnd(6);
        ll.print();


    }
}