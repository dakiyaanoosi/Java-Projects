package TicTacToe;
import java.util.Scanner;
import TicTacToe.SinglePlayer.*;

class Start
{
    public static void main(String[] args)
    {
        int ch;
        Scanner sc=new Scanner(System.in);
        System.out.print("\nMain Menu\n\n1.Two Players\n2.SinglePlayer --> Easy\n3.SinglePlayer --> Hard\n\nSelect Mode [1/2/3] : ");
        String s=sc.nextLine();
        s=s.trim();
        while(true)
        {
            try
            {
                ch=Integer.parseInt(s);
                if(ch>=1 && ch<=3)
                break;
            } catch(Exception e){}
            System.out.print("Invalid input !! Enter again [1/2/3] : ");
            s=sc.nextLine();
            s=s.trim();
        }
        String restart="";
        while(restart.isEmpty())
        {
            switch(ch)
            {
                case 1: System.out.println("\nTwo Players mode !!\n");
                        TwoPlayers tp=new TwoPlayers();
                        tp.play();
                        break;
                case 2: System.out.println("\nSinglePlayer --> Easy mode !!\n");
                        Easy e=new Easy();
                        e.play();
                        break;
                case 3: System.out.println("\nSinglePlayer --> Hard mode !!\n");
                        Hard h=new Hard();
                        h.play();
                        break;
            }
            System.out.println("\n-> Press Enter to Play Again\n-> Enter m to visit Main Menu\n-> Enter anything else to Quit");
            restart=sc.nextLine();
        }
        if(restart.equalsIgnoreCase("m"))
        main(args);

        sc.close();
    }
}