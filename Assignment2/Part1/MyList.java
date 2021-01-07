import java.util.*;
public class MyList {
        int[] currentList = null;

    public MyList(int[] example) {
        currentList = example;
    }

    public void append(int a){
        int[] tempList = new int[currentList.length + 1];
        for(int i = 0;i<currentList.length;i++){
            tempList[i]=currentList[i];
        }
        tempList[currentList.length]=a;
        currentList = tempList;
    }
    public void pop(){
        int[] tempList = new int[currentList.length - 1];
        for(int i = 0;i<currentList.length-1;i++){
            tempList[i]=currentList[i];
        }
        currentList = tempList;
    }
    public void insert(int index, int a){
        int[] tempList = new int[currentList.length + 1];
        for(int i = 0;i<currentList.length+1;i++){
            if(i<index){
                tempList[i]=currentList[i];
            }
            else if(i==index){
                tempList[i]=a;
            }
            else if(i>index){
                tempList[i]=currentList[i-1];
            }
        }
        currentList = tempList;
    }
    public void remove(int index){
        int[] tempList = new int[currentList.length - 1];
        for(int i = 0;i<currentList.length-1;i++){
            if(i<index){
                tempList[i]=currentList[i];
            }
            else if(i==index){
                tempList[i]=currentList[i+1];
            }
            else if(i>index){
                tempList[i]=currentList[i+1];
            }
        }
        currentList = tempList;
    }
    public void printList(){
        System.out.print("[");
        for(int i = 0;i<currentList.length;i++){
            System.out.print(currentList[i]+",");
        }
        System.out.print("]\n");
    }
}
