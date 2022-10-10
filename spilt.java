
package Exercise7;

import java.util.Scanner;

public class spilt {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the String:");
        String str1 =obj.next();
        System.out.print("Enter the String divided part (int):");
        int split_number =obj.nextInt();
        splitStrings s1=new splitStrings();
        s1.splitString(str1, split_number);
    }
}
class splitStrings 
{
    void splitString(String str1, int n) 
    {
        int str_size = str1.length();
        int part_size;
        if (str_size % n != 0) 
        {
            System.out.println("The size of the given string is not divisible by " + n);
        } 
        else
        {
            System.out.println("The given string is: " + str1);
            System.out.println("The string divided into " + n + " parts and they are: ");
            part_size = str_size / n;
            for (int i = 0; i < str_size; i++) 
            {   
                if (i % part_size == 0) 
                {
                    System.out.println();
                }
                System.out.print(str1.charAt(i));
            }
        }
    }
}