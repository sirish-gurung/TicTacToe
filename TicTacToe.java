public class TicTacToe
{
    public static final int X = 1, O = -1;
    public static final int EMPTY = 0;

    public int player = X;
    private int[][] board = new int[3][3];
    public boolean isEmpty = false;

    public void putSign(int x, int o)
    {
        if(x<0 || x>2 || o<0 || o>2)
        {
            System.out.println("ERROR: Invalid board position");
            return;
        }
        if(board[x][o] != EMPTY)
        {
            System.out.println("Board position Full");
            return;
        }
        board[x][o] = player;
        player = -player;
    }

    public boolean isWin(int player)
    {
        return ((board[0][0] + board[0][1] + board[0][2] == player*3) ||
                (board[1][0] + board[1][1] + board[1][2] == player*3) ||
                (board[2][0] + board[2][1] + board[2][2] == player*3) ||
                (board[0][0] + board[1][0] + board[2][0] == player*3) ||
                (board[0][1] + board[1][1] + board[2][1] == player*3) ||
                (board[0][2] + board[1][2] + board[2][2] == player*3) ||
                (board[0][0] + board[1][1] + board[2][2] == player*3) ||
                (board[2][0] + board[1][1] + board[0][2] == player*3));
    }

    public void displayWinner()
    {
        if(isWin(X))
        {
            System.out.println("\n Player X wins!!");
            isEmpty=false;
        }
        else if(isWin(O))
        {
            System.out.println("\n Player O wins!!");
            isEmpty=false;
        }
        else
        {
            if(!isEmpty)
            {
                System.out.println("Opps!!! It's a tie!!!");
            }

        }
    }

    public String toString()
    {
        StringBuilder s = new StringBuilder();
        isEmpty = false;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                switch(board[i][j])
                {
                    case X:
                        s.append(" X ");
                        break;
                    case O:
                        s.append(" O ");
                        break;
                    case EMPTY:
                        s.append("   ");
                        isEmpty=true;
                        break;
                }
                if(j<2)
                {
                    s.append("|");
                }

            }
            if(i<2)
            {
                s.append("\n-----------\n");
            }
        }
        return s.toString();
    }
}
