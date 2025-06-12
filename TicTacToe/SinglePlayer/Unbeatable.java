package TicTacToe.SinglePlayer;
import TicTacToe.Common;

public class Unbeatable extends Common
{

    int minimax(char b[],int turn,int c,int depth)
    {
        if(checkWinner(b))
        return (turn==0) ? (10-depth) : (-10+depth);

        if(c>8) return 0;

        if(turn==1)
        {
            int bestScore=-999;
            for(int i=0;i<9;i++)
            {
                if(b[i]==' ')
                {
                    b[i]='O';
                    bestScore=Math.max(bestScore,minimax(b,1-turn,c+1,depth+1));
                    b[i]=' ';
                }
            }
            return bestScore;
        }
        else
        {
            int bestScore=999;
            for(int i=0;i<9;i++)
            {
                if(b[i]==' ')
                {
                    b[i]='X';
                    bestScore=Math.min(bestScore,minimax(b,1-turn,c+1,depth+1));
                    b[i]=' ';
                }
            }
            return bestScore;
        }
    }

    void input()
    {
        if(player[turn]=='X') get();

        else
        {
            int bestScore=-999;
            for(int i=0;i<9;i++)
            {
                if(board[i]==' ')
                {
                    board[i]='O';
                    int score=minimax(board,1-turn,counter+1,0);
                    board[i]=' ';
                    if(score>bestScore)
                    {
                        bestScore=score;
                        position=i;
                    }
                }
            }
        }
    }

    public void play()
    {
        print();
        
        while(counter<9)
        {
            if(counter==8) lastMove();
            else
            {
                input();

                board[position]=player[turn];

                if(turn==1 || counter==7)
                System.out.println("\nComputer");

                print();
                counter++;
                if(counter>4)
                {
                    if(checkWinner())
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