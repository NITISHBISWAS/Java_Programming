
package evenodd;

import java.util.Scanner;

public class EvenOdd{
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.print("Enter Number : ");
        num = input.nextInt();
        
        if(num%2==0){
            System.out.println(num+" is Even Number");
        }
        else{
            System.out.println(num+" is Odd Number");
        }
       
    }
}