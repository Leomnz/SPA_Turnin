
public class Main {
    public static void main(String[] args){
        MyHashSet pog = new MyHashSet(10);
        pog.add(3);
        pog.add(56);
        pog.add(2);
        pog.add(7);
        pog.add(567);
        pog.add(9);
        pog.add(4);
        pog.add(1);
        System.out.println(pog.search(4));
        System.out.println(pog.search(1));
        System.out.println(pog.search(23));
    }
}
