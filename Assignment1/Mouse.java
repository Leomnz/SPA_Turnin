import java.util.*;
public class Mouse {
    String name;
    int xCoordinate;
    int yCoordinate;
    ArrayList<Integer> coordinateHistoryX = new ArrayList<Integer>();
    ArrayList<Integer> coordinateHistoryY = new ArrayList<Integer>();

    public Mouse(String s, int i, int i1) {
        name = s;
        xCoordinate = i;
        yCoordinate = i1;
        coordinateHistoryX.add(xCoordinate);
        coordinateHistoryY.add(yCoordinate);
    }

    public String getMouseName(){
        return name;
    }
    public int getxCoordinate(){
        return xCoordinate;
    }
    public int getyCoordinate(){
        return yCoordinate;
    }
    public void printInformation(){
        System.out.println(name);
        System.out.println(xCoordinate);
        System.out.println(yCoordinate);
        System.out.print("[");
        for(int i=0;i<coordinateHistoryX.size();i++){
            System.out.print("("+ coordinateHistoryX.get(i) +","+ coordinateHistoryY.get(i) +"), ");
        }
        System.out.print("]");

    }
    public void MoveUp(){
        yCoordinate++;
        coordinateHistoryX.add(xCoordinate);
        coordinateHistoryY.add(yCoordinate);
    }
    public void MoveDown(){
        yCoordinate--;
        coordinateHistoryX.add(xCoordinate);
        coordinateHistoryY.add(yCoordinate);
    }
    public void MoveLeft(){
        xCoordinate--;
        coordinateHistoryX.add(xCoordinate);
        coordinateHistoryY.add(yCoordinate);
    }
    public void MoveRight(){
        xCoordinate++;
        coordinateHistoryX.add(xCoordinate);
        coordinateHistoryY.add(yCoordinate);
    }


}
