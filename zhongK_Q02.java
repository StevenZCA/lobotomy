/* Write a program that gets three integers from the user, min, max and numsPerLine. 
Next output the integers from min to max inclusive from lowest to highest numsPerLine integers per line. 
Assume min <= max and that numsPerLine is between 1 and 6 inclusive. Your integers MUST be right aligned in 8 spaces. 
Author: Krissy Zhong*/

import java.util.Scanner;

public class zhongK_Q02{
    public static void main(){
        int min, max, number, counter, numsPerLine;
        counter = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an integer: ");
        min = sc.nextInt();
        
        System.out.println("Enter another integer: ");
        max = sc.nextInt();
        
        System.out.println("Enter the number of integers per line (1-6): ");
        numsPerLine = sc.nextInt(); 
        
        if(min > max){
            number = max;
            max = min;
            min = number;
        }
        
        for(int i = min; i <= max; i++){
            counter++;
            System.out.printf("%8d", i);
            if(counter % numsPerLine == 0){
                System.out.println();
            }
        }
    }
}
