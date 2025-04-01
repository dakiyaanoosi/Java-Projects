package DiceGame;
import java.util.Random;
import java.util.Scanner;
public class UntilStopped extends Common
{
    void Rounds(Scanner sc,Random random)
    {
      int a=0,b=0,i=1;
         while(true)
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

            String input = sc.nextLine();
            if (!input.isEmpty()) {
                break;
            }
            i++;
         }
         
         if(a<b)
         System.out.println("Winner : Computer\n");
         else if(a>b)
         System.out.println("Winner : You\n");
         else
         System.out.println("Result : Tie!\n");
    }

    public static void main(String[] args)
    {
      System.out.println("\n*INSTRUCTIONS\n1.Press ENTER to proceed to next Round\n2.Type any character to Stop the game in between\n");
      UntilStopped d=new UntilStopped();
      Random random=new Random();
      Scanner sc=new Scanner(System.in);

      d.Rounds(sc,random);
    }
}