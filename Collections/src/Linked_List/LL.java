package Linked_List;

public class LL {

    Node head;

    class Node{
        Object val;
        Node next;

        Node(Object val)
        {
            this.val=val;
            this.next=null;
        }
    }

    public void insertFirst(Object val)
    {
        Node newNode=new Node(val);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void insertLast(Object val)
    {
        Node newNode=new Node(val);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node currNode=head;
        while (currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void display()
    {
        if (head == null)
        {
            System.out.println("Linked List is Empty");
            return;
        }
        Node currNode = head;
        while (currNode != null)
        {
            System.out.print(currNode.val + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }
    public static void main(String[] args) {

        LL list = new LL();

        list.insertFirst(30);
        list.insertFirst(20);
        list.insertFirst(10);

        list.insertLast(40);
        list.insertLast(50);

        list.display();
    }
}

