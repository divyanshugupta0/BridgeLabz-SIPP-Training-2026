package Linked_List;

public class LC92_ReverseLinkedListII{

static Node reverseBetween(Node h,int l,int r){Node d=new Node(0);d.next=h;Node p=d;for(int i=1;i<l;i++)p=p.next;Node c=p.next;for(int i=0;i<r-l;i++){Node n=c.next;c.next=n.next;n.next=p.next;p.next=n;}return d.next;}
public static void main(String[]args){ListUtil.print(reverseBetween(ListUtil.create(1,2,3,4,5),2,4));}
}
