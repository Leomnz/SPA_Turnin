import java.util.*;
public class MyQueue {
    int[] arrayStack;

    public void queue(int a){
        int[] tempList = new int[arrayStack.length + 1];
        tempList[0]=a;
        for(int i = 1;i<arrayStack.length;i++){
            tempList[i]=arrayStack[i];
        }
        arrayStack = tempList;
    }
    public void dequeue(){
        int[] tempList = new int[arrayStack.length - 1];
        for(int i = 0;i<arrayStack.length-1;i++){
            tempList[i]=arrayStack[i];
        }
        arrayStack = tempList;
    }
}
