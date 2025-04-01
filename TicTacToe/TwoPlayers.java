package TicTacToe;

import java.util.Scanner;
class TwoPlayers extends Common
{
    String onm="O";
    String xnm="X";
    protected void setName(Scanner sc)
    {
        System.out.print("Player 'O' !! Set your Custom name (default 'O') : ");
        String t=sc.nextLine();
        if(!t.isEmpty())
        onm=t;
        System.out.print("Player 'X' !! Set your Custom name (default 'X') : ");
        t=sc.nextLine();
        if(!t.isEmpty())
        xnm=t;
    }

    protected void lastMove()
    {
        System.out.println();
        String s="Filling last position";
        for(int i=0;i<s.length()+8;i++)
        {
            try
            {
                Thread.sleep(14);
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
                
        for(int i=0;i<9;i++)
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

        if(checkWinner()==true)
        {
            if(player[turn]=='O')
            System.out.println("\n"+onm+" Wins !\n");
            else
            System.out.println("\n"+xnm+" Wins !\n");
            return;
        }
        else
        {
            System.out.println("\nIt's a Tie !\n");
            return;
        }
    }

    void input(Scanner sc)
    {
        get(sc);
    }

    void play(Scanner sc)
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
                input(sc);

                board[position]=player[turn];

                print();
                counter++;
                if(counter>4)
                {
                    if(checkWinner()==true)
                    {
                        if(player[turn]=='O')
                        System.out.println("\n"+onm+" Wins !\n");
                        else
                        System.out.println("\n"+xnm+" Wins !\n");
                        return;
                    }
                }
                turn=1-turn;
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        TwoPlayers obj=new TwoPlayers();
        obj.setName(sc);
        obj.play(sc);
        sc.close();
    }
}