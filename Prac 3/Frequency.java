import java.util.Scanner;
public class Frequency
{
    public static void main(String[] args) {
    Frequency f= new Frequency();
    Scanner s= new Scanner(System.in);
    System.out.println("Provide a sentence");
    String a =s.nextLine();
    a = a.toLowerCase();  //*convert string to lowercase*/
    for(char j='a';j<='z';j++)
    {
        int count=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)==j)
           {
               count++;
           }
        }
        if(count>0)
        {
            System.out.println(j+"  frequency= "+count);
        }
    }
  }
}
