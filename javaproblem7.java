
package javaproblem1;

import java.util.Scanner;


public class javaproblem7 {
    public static void main(String[] args)
            
            
    {
        String w1,w2;
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st String: ");
        w1=sc.nextLine();
        System.out.print("Enter 1st String: ");
        w2=sc.nextLine();
        char[] first  = w1.toLowerCase().toCharArray();
    
char[] second = w2.toLowerCase().toCharArray();

int minLength = Math.min(first.length, second.length);

for(int i = 0; i < minLength; i++)
{
        if (first[i] != second[i])
        {
              count++;
        }
}
   System.out.println("There are "+count+" different characters! "); 
}
}

