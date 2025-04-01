package DiceGame;

class Common {
   private String[][] graphics = {
         {
               "___________",
               "|         |",
               "|         |",
               "|    *    |",
               "|         |",
               "|_________|"
         },
         {
               "___________",
               "|         |",
               "|         |",
               "| *     * |",
               "|         |",
               "|_________|"
         },
         {
               "___________",
               "|         |",
               "|         |",
               "| *  *  * |",
               "|         |",
               "|_________|"
         },
         {
               "___________",
               "| *     * |",
               "|         |",
               "|         |",
               "|         |",
               "|_*_____*_|"
         },
         {
               "___________",
               "| *     * |",
               "|         |",
               "|    *    |",
               "|         |",
               "|_*_____*_|"
         },
         {
               "___________",
               "| *     * |",
               "|         |",
               "| *     * |",
               "|         |",
               "|_*_____*_|"
         }
   };

   void printSideBySide(int userRoll, int computerRoll)
   {
      System.out.printf("%-15s %13s\n", "You", "Computer");
      for (int i = 0; i < 6; i++)
      System.out.printf("%-15s %15s\n", graphics[userRoll - 1][i], graphics[computerRoll - 1][i]);
   }

   boolean validity(String s)
   {
      if (!s.equals("0") && s.matches("\\d+"))
      return true;
      return false;
   }

   void ScoreBoard(int a,int b)
   {
      System.out.println("\nScores \nYou : "+a+"\nComputer : "+b+"\n");
   }
}