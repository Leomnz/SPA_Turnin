import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Mouse m = new Mouse("BigMouse",0,0);
//        m.MoveUp();
//        m.MoveUp();
//        m.MoveLeft();
//        m.MoveDown();
//        m.MoveRight();
//        m.printInformation();
        Mouse m = new Mouse("BigMouse", 0, 0);
        Grid g = new Grid(12, 12, 50);
        g.print();
        System.out.println();
        solve(m,g);
        m.printInformation();
    }

    public static void solve(Mouse m, Grid g) {
        System.out.println();
        while(m.stackEmpty()) {
            while (g.surroundingCoords(m.getYCoordinate(), m.getXCoordinate()).contains(0)) {
                for (int i = 0; i < g.surroundingCoords(m.getYCoordinate(), m.getXCoordinate()).size(); i++) {
                    if (g.surroundingCoords(m.getYCoordinate(), m.getXCoordinate()).get(i) == 0) {
                        System.out.println("Previous Move: "+i);
                        m.Move(g, i,true);
                        break;
                    }
                }
                System.out.println("Visible Board: ");
                for (int i = 0; i < g.surroundingCoords(m.getYCoordinate(), m.getXCoordinate()).size(); i++) {
                    if (i == 3 || i == 6 || i == 9) {
                        System.out.println("");
                    }
                    System.out.print(g.surroundingCoords(m.getYCoordinate(), m.getXCoordinate()).get(i));

                }

                System.out.println("\n\nFull Board: ");
                g.print();
            }
            m.previousMove(g);
            System.out.println("Visible Board: ");
            for (int i = 0; i < g.surroundingCoords(m.getYCoordinate(), m.getXCoordinate()).size(); i++) {
                if (i == 3 || i == 6 || i == 9) {
                    System.out.println("");
                }
                System.out.print(g.surroundingCoords(m.getYCoordinate(), m.getXCoordinate()).get(i));

            }

            System.out.println("\n\nFull Board: ");
            g.print();

        }
    }



}
