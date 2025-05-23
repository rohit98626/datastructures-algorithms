// created linkedlist, sum of all elements of linkedlist, insertelement from first and last
// deleteelement from first and last, length of linkedlist.
// find middle element of a linkedlist with 2 different Methods
// check if the linkedlist is an palindrome or not.
// check loops in a linkedlist

package LinkedList;

class Node {                                          /*Node class (the building block) */
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class ling1 {
    static Node head;

    ling1() {
        head = null;
    }

    static void printData(Node node) {
        Node current = node;
        while (current != null) {
            System.out.print(current.data + "---->");
            current = current.next;
        }
        System.out.println("null");
    }

    static int sum(Node head) {
        int sum = 0;
        Node cur = head;
        while (cur != null) {
            sum = sum + cur.data;
            cur = cur.next;
        }
        return sum;
    }

// insert element at the begninng of the linkedlist

    static void insertAtBeg(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

// insert element at last of the linkedlist

    static void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = newNode;
    }
// delete first element

    static void deleteAtBeg() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

// delete last element    

    static void deleteAtLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node cur = head;
        while (cur.next.next != null) {
            cur = cur.next;
        }
        cur.next = null;
    }
// length of a linkedlist

    static int Count() {                
      Node curr = head;
      int count = 0;
      while (curr!=null){
        count++;
        curr = curr.next;
      }
      return count;
    }

// middle element 1st methond

        static void MiddleElement() {
        int mid = Count()/2;
        Node curr = head;
        int count = 0;
        while (curr.next!=null && count!=mid){
            count++;
            curr=curr.next;
        }
        System.out.println("the middle element is : " + curr.data);
      
    }

// middle element 2nd method

    static void MiddleElement2() {
        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("the 2nd way to find the middle element is :" + slow.data);
    }

// check loops in a linkedlist

    static boolean loops() {
        Node slow = head;
        Node fast = head;
        
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) {
                return true;
            }
        }
        return false;  
    }

// check if the linkedlist is palindrome or not 

    static boolean palindrome() {
        if (head == null || head.next == null) return true;

        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = reverseList(slow);
        Node firstHalf = head;

        Node tempSecond = secondHalf;
        while (tempSecond!= null) {
            if (firstHalf.data != tempSecond.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            tempSecond = tempSecond.next;
        }
        return true;
    }

    static Node reverseList(Node node) {
        Node prev = null;
        Node current = node;
        while (current!=null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

// main method

    public static void main(String[] args) {           
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        insertAtBeg(9);
        insertAtBeg(8);
        insertAtLast(90);
        insertAtLast(60);

        printData(head);

        System.out.println("After Deletion:");
        deleteAtBeg();
        deleteAtBeg();
        deleteAtLast();

        printData(head); // ✅ show list after deletions

        System.out.println("Sum of all elements is : " + sum(head));
        System.out.println("length of the linkedlist : " + Count());
        MiddleElement();
        MiddleElement2();
        System.out.println("loop in a linkedlist : " + loops());

        if (palindrome()) {
            System.out.println("is palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}