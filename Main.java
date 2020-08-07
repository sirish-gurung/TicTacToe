import java.util.*;

public class Main{
    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        Scanner s = new Scanner(System.in);
        int x=0,o=0;
        do
        {
            System.out.println(t.player==t.X?"Player X turn":"Player O turn");
            System.out.println("Enter x and o places");
            x=s.nextInt();
            o=s.nextInt();
            t.putSign(x, o);
            System.out.println(t.toString());
            System.out.println("_____________________________");
            t.displayWinner();
        }while(t.isEmpty);
    }
}