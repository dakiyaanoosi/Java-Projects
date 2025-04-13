package TicTacToe;
import java.util.Scanner;

public class Common
{
    Scanner sc=new Scanner(System.in);
    protected char board[]={' ',' ',' ',' ',' ',' ',' ',' ',' '};
    protected char player[]={'X','O'};
    protected int turn=0;
    protected int counter=0;
    protected int position=-1;

    protected void get()
    {
        System.out.print("\n\nPlayer '"+player[turn]+"' Enter a position (1-9) : ");
        String p=sc.nextLine();
        p=p.trim();
        while(true)
        {
            try
            {
                position=Integer.parseInt(p)-1;
                if(position>=0 && position<=8)
                {
                    if(board[position]!=' ')
                    {
                        System.out.print("Block Already Filled! Choose different position : ");
                    }
                    else
                    break;
                }
                else
                System.out.print("Player '"+player[turn]+"' Please enter a valid position : ");
            } catch(Exception e) {System.out.print("Player '"+player[turn]+"' Please enter a valid position : ");}

            p=sc.nextLine();
            p=p.trim();
        }
    }

    protected void print()
    {
        System.out.println();
        int c=0;
        for(int i=0;i<9;i++)
        {
            c++;
            if(c<3)
            System.out.print(" "+board[i]+" |" );
            else
            {
                System.out.println(" "+board[i]+"  ");
                if(i!=8)
                System.out.println("------------");
                c=0;
            }
        }
    }

    protected boolean checkWinner()
    {
        int [][] winpatterns={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
        for(int i[] : winpatterns)
        {
            if(board[i[0]]==board[i[1]] && board[i[0]]==board[i[2]] && board[i[0]]!=' ')
            {
                return true;
            }
        }
        return false;
    }

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

        if(checkWinner()==true)
        {
            if(player[turn]=='X')
            System.out.println("\nCongratulations! You Won\n");
            else
            System.out.println("\n Computer Wins !\n");
            return;
        }
        else
        {
            System.out.println("\nIt's a Tie !\n");
            return;
        }
    }
}