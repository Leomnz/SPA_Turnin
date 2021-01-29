import java.util.*;
public class Mouse {
    String name;
    int xCoordinate;
    int yCoordinate;
    ArrayList<Integer> coordinateHistoryX = new ArrayList<Integer>();
    ArrayList<Integer> coordinateHistoryY = new ArrayList<Integer>();
    Stack<Integer> coordinateHistoryStack = new Stack<Integer>();

    public Mouse(String s, int i, int i1) {
        name = s;
        xCoordinate = i;
        yCoordinate = i1;
        coordinateHistoryX.add(xCoordinate);
        coordinateHistoryY.add(yCoordinate);
        coordinateHistoryStack.add(4);
    }

    public String getMouseName() {
        return name;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void printInformation() {
        System.out.println(name);
        System.out.print("[");
        for (int i = 0; i < coordinateHistoryX.size(); i++) {
            System.out.print("(" + coordinateHistoryX.get(i) + "," + coordinateHistoryY.get(i) + "), ");
        }
        System.out.print("]");

    }

    public void Move(Grid g, int d,boolean AddToCoordinateStack) {
        //System.out.println("xCoord: "+ xCoordinate+" yCoord: "+yCoordinate+ " Next Move: "+d);
        //g.print();
        g.grid.get(xCoordinate).set(yCoordinate, 2);
        if (d == 0) {
            MoveUpLeft(g);
        } else if (d == 1) {
            MoveUp(g);
        } else if (d == 2) {
            MoveUpRight(g);
        } else if (d == 3) {
            MoveLeft(g);
        } else if (d == 5) {
            MoveRight(g);
        } else if (d == 6) {
            MoveDownLeft(g);
        } else if (d == 7) {
            MoveDown(g);
        } else if (d == 8) {
            MoveDownRight(g);
        }
        g.grid.get(xCoordinate).set(yCoordinate, 3);
        coordinateHistoryX.add(xCoordinate);
        coordinateHistoryY.add(yCoordinate);
        if(AddToCoordinateStack==true){
            coordinateHistoryStack.push(d);
        }
    }

    public void MoveUp(Grid g) {
        xCoordinate--;
    }

    public void MoveDown(Grid g) {
        xCoordinate++;
    }

    public void MoveLeft(Grid g) {
        yCoordinate--;
    }

    public void MoveRight(Grid g) {
        yCoordinate++;
    }

    public void MoveUpRight(Grid g) {
        xCoordinate--;
        yCoordinate++;

    }

    public void MoveUpLeft(Grid g) {
        yCoordinate--;
        xCoordinate--;
    }

    public void MoveDownRight(Grid g) {
        yCoordinate++;
        xCoordinate++;
    }

    public void MoveDownLeft(Grid g) {
        xCoordinate++;
        yCoordinate--;
    }

    public void previousMove(Grid g) {
        //System.out.println("The Stack is: "+coordinateHistoryStack.size());
        int t = coordinateHistoryStack.pop();
        Move(g, 8 - t,false);
    }
    public boolean stackEmpty(){
        return !coordinateHistoryStack.empty();
    }
}
