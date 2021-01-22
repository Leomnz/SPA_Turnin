import java.util.*;
public class MyStack {
    int[] arrayStack;

    public MyStack(int e) {
        arrayStack = new int[e];
    }
    public MyStack(int[] e) {
        arrayStack = e;
    }

    public void pop(){
        int[] tempList = new int[arrayStack.length - 1];
        for(int i = 0;i<arrayStack.length-1;i++){
            tempList[i]=arrayStack[i];
        }
        arrayStack = tempList;
    }
    public void push(int a){
        int[] tempList = new int[arrayStack.length + 1];
        for(int i = 0;i<arrayStack.length;i++){
            tempList[i]=arrayStack[i];
        }
        tempList[arrayStack.length]=a;
        arrayStack = tempList;
    }
    public int get(int i){
        return arrayStack[i];
    }
    public int length(){
        return arrayStack.length;
    }
    public void print(){
        System.out.println(Arrays.toString(arrayStack));
    }
}
