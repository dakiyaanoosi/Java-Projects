package CharacterRevealEffect;
class Main
{
    public static void main(String[] args)
    {
        String name="Avinish Kumar Tripathi";
        StringBuilder sb=new StringBuilder();
        char start;
        for(int i=0;i<name.length();i++)
        {
            char ch=name.charAt(i);
            if(Character.isAlphabetic(ch))
            {
                if(Character.isLowerCase(ch)) start='a';
                else start='A';
                for(char j=start;j<=ch;j++)
                {
                    System.out.print("\r");
                    System.out.print(sb.toString());
                    System.out.print(j);
                    try{Thread.sleep(25);}catch(InterruptedException e){e.printStackTrace();}
                }
            }
            sb.append(ch);
        }
    }
}