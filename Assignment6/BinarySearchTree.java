import java.util.ArrayList;

// Java program to demonstrate
// insert operation in binary
// search tree
class BinarySearchTree {
    Node head;
    ArrayList<ArrayList<Integer>> storage = new ArrayList<ArrayList<Integer>>();

    public BinarySearchTree(){
        head = null;
    }
    void add(int data)
    {
        head = insert(head, data);
    }
    Node insert(Node head, int data) {
        if (head == null) {
            head = new Node(data);
            return head;
        }
        if (data < head.data)
            head.left = insert(head.left, data);
        else if (data > head.data)
            head.right = insert(head.right, data);

        return head;
    }
    public void print(){
        storage.clear();
        printA(head,0);
        System.out.println("Binary Search Tree");
        for(int i = 0; i<storage.size();i++){
            System.out.println(String.format("%10s", storage.get(i)));
        }
        System.out.println("");
    }
    public void printA(Node head, int depth){
        if(head != null) {
            printA(head.left,depth+1);
            System.out.println("Data: "+head.data+", Depth: "+depth);
            while(storage.size()<=depth){
                storage.add(new ArrayList<Integer>());
            }
            storage.get(depth).add(head.data);
            printA(head.right, depth+1);
        }
    }
}
