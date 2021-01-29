import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Grid {

    ArrayList<ArrayList<Integer>> grid;
    int xDimension;
    int yDimension;
    int wallPercent;

    public Grid(int xDimension, int yDimension, int wallPercent) {


        this.xDimension = xDimension;
        this.yDimension = yDimension;
        this.wallPercent = wallPercent;
        this.grid = populateGrid();

    }

    private ArrayList<ArrayList<Integer>> populateGrid() {
        ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>();

        for (int x = 0; x < this.xDimension; x++) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (int y = 0; y < this.yDimension; y++) {
                Random rand = new Random();
                if(x==0&&y==0){
                    temp.add(3);
                }
                else if (rand.nextInt(100) < this.wallPercent) {
                    temp.add(1);
                } else {
                    temp.add(0);
                }
            }
            g.add(temp);
        }
        return g;


    }

    //x and y are backwards here
    public ArrayList<Integer> surroundingCoords(int ypos, int xpos) {
        ArrayList<Integer> t = new ArrayList<Integer>();
        for (int x = -1; x <= 1; x++) {
            for (int y = -1; y <= 1; y++) {
                if ((xpos + x >= 0) && (xpos + x < grid.size()) && (ypos + y >= 0) && (ypos + y < grid.get(0).size())) {
                    t.add(grid.get(xpos + x).get(ypos + y));
                } else {
                    t.add(9);
                }

            }
        }
        return t;
    }

    public void print() {
        for (int x = 0; x < grid.size(); x++) {
            for (int y = 0; y < grid.get(0).size(); y++) {
                System.out.print(grid.get(x).get(y) + "  ");

            }
            System.out.println("");
        }
        System.out.println("");
    }
}



