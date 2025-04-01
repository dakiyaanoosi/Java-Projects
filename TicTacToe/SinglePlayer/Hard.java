package TicTacToe.SinglePlayer;
import TicTacToe.Common;

public class Hard extends Common
{ 
    boolean winningMove()
    {
        int [][] winpatterns={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
        for(int i[] : winpatterns)
        {
            if(board[i[0]]==board[i[1]] && board[i[0]]=='O' &&  board[i[2]]==' ')
            {
                position=i[2];
                return true;
            }
            else if(board[i[0]]==board[i[2]] && board[i[0]]=='O'  &&  board[i[1]]==' ')
            {
                position=i[1];
                return true;
            }
            else if(board[i[1]]==board[i[2]] && board[i[1]]=='O'  &&  board[i[0]]==' ')
            {
                position=i[0];
                return true;
            }
        }
        return false;
    }

    boolean blockingMove()
    {
        int [][] winpatterns={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
        for(int i[] : winpatterns)
        {
            if(board[i[0]]==board[i[1]] && board[i[0]]=='X' &&  board[i[2]]==' ')
            {
                position=i[2];
                return true;
            }
            else if(board[i[0]]==board[i[2]] && board[i[0]]=='X'  &&  board[i[1]]==' ')
            {
                position=i[1];
                return true;
            }
            else if(board[i[1]]==board[i[2]] && board[i[1]]=='X'  &&  board[i[0]]==' ')
            {
                position=i[0];
                return true;
            }
        }
        return false;
    }

    boolean occupyCorner()
    {
        int arr[]={0,2,6,8};
        for(int i : arr)
        {
            if(board[i]==' ')
            {
                position=i;
                return true;
            }
        }
        return false;
    }

    void algo()
    {
        if(board[4]==' ')
        {
            position=4;
            return;
        }
        if(counter<3)
        {
            if(occupyCorner()==true)
            return;
            do
            {
                position = (int) (Math.random()*9);
            }
            while(board[position]!=' ');
        }
        else
        {
            if(winningMove()==true)
            return;
            if(blockingMove()==true)
            return;
            if(occupyCorner()==true)
            return;
            do
            {
                position = (int) (Math.random()*9);
            }
            while(board[position]!=' ');
        }
    }

    void input()
    {
        if(player[turn]=='X')
        {
            get();
        }
        else
        {
            algo();
        }
    }


    public void play()
    {
        print();
        while(counter<9)
        {
            if(counter==8)
            {
                lastMove();
            }
            else
            {
                input();

                board[position]=player[turn];
                if(turn==1 || counter==7)
                {
                    System.out.println("\nComputer");
                }
                print();
                counter++;
                if(counter>4)
                {
                    if(checkWinner()==true)
                    {
                        if(player[turn]=='X')
                        System.out.println("\nCongratulations! You Won\n");
                        else
                        System.out.println("\nComputer Wins !\n");
                        return;
                    }
                }
                turn=1-turn;
            }
        }
    }
}