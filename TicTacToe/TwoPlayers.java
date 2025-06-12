package TicTacToe;

class TwoPlayers extends Common
{
    protected void lastMove()
    {
        System.out.println();
        String s="Filling last position";
        for(int i=0;i<s.length()+5;i++)
        {
            try
            {
                Thread.sleep(60);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            if(i>s.length()-1)
            System.out.print(".");
            else
            System.out.print(s.charAt(i));
        }
        System.out.println();
                
        for(int i=8;i>=0;i--)
        {
            if(board[i]==' ')
            {
                position=i;
                break;
            }
        }
        board[position]=player[turn];
        print();
        counter++;

        if(checkWinner())
        System.out.println("\nPlayer '"+player[turn]+"' Wins !\n");
        else
        System.out.println("\nIt's a Tie !\n");
    }

    void play()
    {
        print();
        while(counter<9)
        {
            if(counter==8) lastMove();
            else
            {
                get();

                board[position]=player[turn];

                print();
                counter++;
                if(counter>4)
                {
                    if(checkWinner())
                    {
                        System.out.println("\nPlayer '"+player[turn]+"' Wins !\n");
                        return;
                    }
                }
                turn=1-turn;
            }
        }
    }
}