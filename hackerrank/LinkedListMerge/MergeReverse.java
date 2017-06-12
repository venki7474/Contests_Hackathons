import java.util.Scanner;
import java.lang.*;
import java.util.*;
class Node {
    int data;
    Node next;
    Node(){
        next = null;
    }
    public void setLink(Node link) {
        this.next = link;
    }
    public void setData(int data) {
        this.data = data;
    }
    public Node getLink() {
        return next;
    }
    public int getData() {
        return data;
    }
}
class MyLinkedList{
    private Node head;
    private Node tail;
    public MyLinkedList() {
        head = null;
        tail = null;
    }
    Node getHead() {
        return head;
    }
    public void insert(int data) {
            Node temp = new Node();
            temp.data = data;
            if (head == null) {
                head = temp;
                tail = head;
            } else {
                tail.setLink(temp);
                tail = temp;
            }
        }
    public void listMerge(MyLinkedList l1, MyLinkedList l2) {
        Node mergedHead = mergeLists(l1.getHead(), l2.getHead());
        head = mergedHead;
    }

    public Node mergeLists(Node tempA, Node tempB) {
        if (tempA == null) {
            return tempB;
        }
        if (tempB == null){
            return tempA;
        }
        Node mainNode = new Node();
        Node headC = mainNode;
        while(tempA != null && tempB != null) {
            if(tempA.data < tempB.data){
                mainNode.next = tempA;
                mainNode = mainNode.next;
                tempA = tempA.next;
            }
            else {
                mainNode.next = tempB;
                mainNode = mainNode.next;
                tempB = tempB.next;
            }
        }
        if(tempA != null) {
            mainNode.next = tempA;
        }
        if(tempB != null) {
            mainNode.next = tempB;
        }
        headC = headC.next;
    return headC;
    }
    
    public void listReverse(MyLinkedList list) {
        Node reversed = ReverseList(list.getHead());
        head = reversed;
    }

    public Node ReverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node temp1 = head,temp2 = null, temp3 = null;
        while (temp1 != null) {
            temp2 = temp1.next;
            temp1.next = temp3;
            temp3 = temp1;
            temp1 = temp2;
        }
        head = temp3;
        return head;
    } 

    public void print() {
        Node ptr = head;
        System.out.print(head.getData() + " ");
        ptr = head.getLink();
        while(ptr.getLink() != null) {
            System.out.print(ptr.getData() + " ");
            ptr = ptr.getLink();
        }
        System.out.print(ptr.getData());
    }
}
public class MergeReverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyLinkedList list1 = new MyLinkedList();
        MyLinkedList list2 = new MyLinkedList();
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str1," ");
        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            list1.insert(Integer.parseInt(token));
        }
        st = new StringTokenizer(str2, " ");
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            list2.insert(Integer.parseInt(token));
        }
        // list1.print();
        // list2.print();
        MyLinkedList merged = new MyLinkedList();
        merged.listMerge(list1, list2);
        MyLinkedList reversed = new MyLinkedList();
        reversed.listReverse(merged);
        // merged.listReverse();
        reversed.print();
    }
}