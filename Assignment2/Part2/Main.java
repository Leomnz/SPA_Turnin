import java.util.*;

public class Main {
    public static void main(String args[]) {

    int[] pog = {3, 2, 2, 1, 2, 4};
    System.out.println(Arrays.toString(pog));
    MyStack CoolStack = new MyStack(pog);
    CoolStack.print();
    CoolStack.pop();
    CoolStack.print();
    CoolStack.push(1);
    CoolStack.print();




    }
}
