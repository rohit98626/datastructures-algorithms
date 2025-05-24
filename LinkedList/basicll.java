// basic linkedlist codes-> add first and last , delete first, delete last

package LinkedList;

public class basicll {
  Node head; // head of the linked list
  private int size;

  basicll() {
    this.size = 0;
  }


  class Node {
    String data;
    Node next;

    Node(String data) {
      this.data = data;
      this.next = null;
      size++;
    }
  }

  // add = first, last
  public void addFirst(String data) {
    Node newNode = new Node(data);
    if(head == null) {
      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  public void addLast(String data) {
    Node newNode = new Node(data);
    if(head == null) {
      head = newNode;
      return;
    }

    Node currNode = head;
    while(currNode.next != null) {
      currNode = currNode.next;
    }  

    currNode.next = newNode;
  }

  //print 
  public void printList() {
    if(head == null) {
      System.out.println("list is empty");
      return;
    }
    Node currNode = head;
    while(currNode!= null) {
      System.out.print(currNode.data + "->");
      currNode = currNode.next;
    }
    System.out.print("Null");
  }

// delete first 
  public void deleteFirst(String data) {
    if(head == null) {
      return;
    }
    size--;
    head = head.next;
  }

// delete last
  public void deleteLast(String data) {
    if(head == null) {
      return;
    }

    size--;
    if(head.next == null) {
      head = null;
      return;
    }

    Node curr = head;
    while (curr.next.next != null) {
      curr = curr.next;
    }
    curr.next = null;
  }  

  public int getSize() {
    return size;
  }

  // main function
  public static void main(String[] args) {
    basicll list = new basicll();
    list.addFirst("a");
    list.addFirst("is");
    list.printList();
    System.out.println();

    list.addLast("list");
    list.printList();

    System.out.println();

    list.addFirst("this");
    list.printList();

    System.out.println();

    list.deleteFirst(null);
    list.printList();

    System.out.println();

    list.deleteLast(null);
    list.printList();

    System.out.println();

    list.getSize();
    System.out.println(list.getSize());
    list.addFirst("this");
    System.out.println(list.getSize());
  }
}