import java.util.*;
public class DumbQueue{
    MyStack s;

    public void queue(int a){
        MyStack tempList = new MyStack(s.length()+1);
        tempList.push(a);
        for(int i = 1;i<s.length();i++){
            tempList.push(s.get(i));
        }
        s = tempList;
    }
    public void dequeue(){
        MyStack tempList = new MyStack(s.length()+1);
        for(int i = 0;i<s.length()-1;i++){
            tempList.push(s.get(i));
        }
        s = tempList;
    }
}
