import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MyLinkedList {
    Node head;

    public void printList(){
        System.out.println("");
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
        System.out.println("");
    }
    public void add(int k) {
        Node temp = new Node(k);
        temp.next = head;
        head = temp;
    }
    public void removeItem(int index){
        ArrayList<Integer> AList = new ArrayList<Integer>();
        Node temp = new Node(head.data);
        temp.next = head.next;
        for(int i = 0;i<index-1;i++){
            AList.add(head.data);
            head = head.next;
        }
        if(head.next.next!=null){
            head.next = head.next.next;
        }
        else{
            head.next = null;
        }
        for(int i = AList.size()-1;i>=0;i--){
            add(AList.get(i));
        }
    }
    public void insert(int k, int index){
        ArrayList<Integer> AList = new ArrayList<Integer>();
        for(int i = 0;i<index-1;i++){
            AList.add(head.data);
            head = head.next;
        }
        Node temp = new Node(k);
        temp.next = head.next;
        head.next = temp;
        for(int i = AList.size()-1;i>=0;i--){
            add(AList.get(i));
        }
    }
    public void Switch(int index1, int index2){
        Node temp = head;
        int i = 0;
        int index1data = 0;
        int index2data = 0;
        while(temp.next!=null){
            if(i==index1){
                index1data = temp.data;
            }
            if(i==index2){
                index2data = temp.data;
            }
            temp = temp.next;
            i++;
        }
        System.out.println("index1: "+index1data+" index2: "+index2data);
        i = 0;
        while(head.next!=null){
            if(i==index1){
                head.data = index2data;
            }
            if(i==index2){
                head.data = index1data;
            }
            i++;
        }
    }
    public void reverse() { //https://www.geeksforgeeks.org/reverse-a-linked-list/ I could not figure this one out.
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    public void sort(){
        ArrayList<Integer> AList = new ArrayList<Integer>();
        Node temp = head;
        int b = 0;
        while(temp.next!=null&&b<100){
            System.out.print(", Size: "+AList.size()+", B: "+b);
            AList.add(temp.data);
            temp = temp.next;
            b++;
        }

        head = new Node(AList.get(0));
        Collections.sort(AList);
        System.out.println(Arrays.toString(AList.toArray()));
        for(int i = AList.size()-1;i>=0;i--){
            add(AList.get(i));
        }
    }
}
