public class Main {
    public static void main(String[] args) {


        int[] example = {2, 4, 6, 8};


        MyList list1 = new MyList(example);
        list1.append(4);
        list1.printList();
        list1.pop();
        list1.printList();
        list1.insert(1,99);
        list1.printList();
        list1.remove(0);
        list1.printList();

    }
}


