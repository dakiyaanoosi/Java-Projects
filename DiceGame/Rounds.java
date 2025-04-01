package DiceGame;
import java.util.Random;
import java.util.Scanner;
public class Rounds extends Common
{
    void rounds(Scanner sc,Random random)
    {
      int a=0,b=0;
         System.out.print("Enter the number of rounds : ");
         String rounds=sc.nextLine();
         rounds=rounds.trim();
         while(validity(rounds)==false)
         {
            System.out.print("Please enter a valid number : ");
            rounds=sc.nextLine();
            rounds=rounds.trim();
         }

         int r=Integer.parseInt(rounds);
         for(int i=1;i<=r;i++)
         {
            System.out.println("\nRound : "+i+"\n");
            int userRoll=random.nextInt(6)+1;
            int computerRoll=random.nextInt(6)+1;
            printSideBySide(userRoll, computerRoll);

            if(userRoll<computerRoll)
            {
               b++;
               System.out.println("\nComputer Won!");
            }
            else if(userRoll>computerRoll)
            {
               a++;
               System.out.println("\nYou Won!");
            }
            else
            System.out.println("\nIt's a Tie!");
            ScoreBoard(a, b);
         }
         
         if(a<b)
         System.out.println("\nWinner : Computer\n");
         else if(a>b)
         System.out.println("\nWinner : You\n");
         else
         System.out.println("\nResult : Tie!\n");
    }
    
    public static void main(String[] args)
    {
      Rounds d=new Rounds();
      Random random=new Random();
      Scanner sc=new Scanner(System.in);

      d.rounds(sc,random);
    }
}