import java.util.ArrayList;
import java.util.LinkedList;

public class MyHashSet {
    private ArrayList<LinkedList<Integer>> myHash = new ArrayList<LinkedList<Integer>>();
    private int bucketSize = 10;

    public MyHashSet(int bucket){
        this.bucketSize=bucket;
    }
    public void add(int k) {
        if(!search(k)) {
            if((myHash==null||myHash.size()*bucketSize<k)){
                hash(k);
            }
            myHash.get((int) Math.ceil(k/(double) bucketSize)).add(k);
        }
    }

    public boolean search(int k) {
        if(myHash==null){return false;}
        for(int i = 0;i<myHash.size()-1;i++){
            if(myHash.get(i).contains(k)){ return true; }
        }
        return false;
    }

    private void hash(int k) {
        for(int i = 0;i<=Math.ceil(k/(double) bucketSize);i++){
            myHash.add(new LinkedList<Integer>());
        }
    }
}
