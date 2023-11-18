
package lab1dats;

import java.util.Scanner;

public class Lab1DatS {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter ten integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        DisplayReversed(numbers);
        DisplayMin(numbers);
        DisplayMax(numbers);
        DisplayMinInRange(numbers);
        DisplayRepetitions(numbers);
    }

    public static void DisplayReversed(int[] arr) {
        System.out.println("Reversed order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void DisplayMin(int[] arr) {
        int min= arr[0];
       for (int i = 0; i < arr.length; i++) {
           if (arr[i]<min)
               min=arr[i];
       }
        System.out.println("Min number: " + min);
    }

    public static void DisplayMax(int[] arr) {
        int max= arr[0]; 
       for (int i = 0; i < arr.length; i++) {
           if (arr[i]>max)
               max=arr[i];
       }
       System.out.println("Max number: " + max);
      
    }
    
    public static void DisplayMinInRange(int[] arr) {
    int minInRange= Integer.MAX_VALUE; 
       for (int i = 2; i <=7 ; i++) {
           if (arr[i]<minInRange)
               minInRange=arr[i];
       }
        System.out.println("Minimum value in the range: " + minInRange);
    } 
    

    public static void DisplayRepetitions(int[] a) {
        boolean NumberRepeat = false;

        for (int i = 0; i < a.length; i++) {
            int times = 0;

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    times++;
                    NumberRepeat = true;
                }
            }

            if (times > 0) {
                System.out.println(a[i] + " is repeated " + (times + 1) + " times");
            }
        }

        if (!NumberRepeat) {
            System.out.println("All numbers are unique");
        }
    }
    }

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
  
    
