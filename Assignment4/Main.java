public class Main {
    public static void main(String[] args){
        MyLinkedList list1 = new MyLinkedList();
        list1.add(4);
        list1.add(6);
        list1.add(7);
        list1.add(2);
        list1.add(9);
        list1.add(12);
        MyLinkedList list2 = new MyLinkedList();
        list2.add(25);
        list2.add(1);
        list2.add(5);
        list2.add(9);
        list2.add(15);
        list2.add(90);
        merge(list1,list2).printList();
        System.out.println("Sort");
        list1.printList();
        System.out.println("Remove");
        list1.removeItem(3);
        list1.printList();
        System.out.println("Insert");
        list1.insert(999,5);
        list1.printList();
        System.out.println("Reverse");
        list1.reverse();
        list1.printList();
        System.out.println("Switch");
        list1.Switch(2,4);
        list1.printList();


    }
    public static MyLinkedList merge(MyLinkedList list1, MyLinkedList list2){
        while(list2.head!=null){
            list1.add(list2.head.data);
            list2.head = list2.head.next;
        }
        list1.sort();
        return list1;
    }
}
