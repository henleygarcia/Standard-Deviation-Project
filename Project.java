package project;

/**
 *
 *  Team leader: Henley Garcia Panther ID: 4156157 COP2210
 *  David Huerta Panther ID: 5057953 COP2210
 *  Project Description: Write a program that simulates a statistics tool, 
 * by letting the user determine the minimum, the maximum, the range (maximum – minimum), 
 * the mode (value that is repeated more often), the mean
* (average), and the standard deviation of a set of numbers. 
* These numbers, that will be stored in an array, represent salaries in the $30K – $60K range 
* and are to be generated randomly.
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Project 
{

    public static void main(String[] args) 
    {
       double average = 0.0;
     
       
       Scanner in = new Scanner(System.in);
       Random rand = new Random();
//       double salary = in.nextDouble();
       int [] salaryArray = new int [5];
       
        for (int i = 0; i < salaryArray.length; i++) 
        {
            salaryArray[i] = rand.nextInt(30000) + 30000;
            System.out.print(salaryArray[i] + " ");
        }
        System.out.println("");
        
        int UserInput = 0;       
        do 
        {
            System.out.println(" ");
            System.out.println("1) Populate Array");
            System.out.println("2) Display Array");
            System.out.println("3) Minimum");
            System.out.println("4) Maximum");
            System.out.println("5) Range");
            System.out.println("6) Mode");
            System.out.println("7) Mean");
            System.out.println("8) Standard Deviation");
            System.out.println("9) Exit");
            System.out.print("PLease enter a number: ");
            UserInput = in.nextInt();
            
            switch(UserInput)
            {
                case 1:
                {
                    
                    //System.out.println("Populate Array");
                      for (int i = 0; i < salaryArray.length; i++) 
                      {
                        salaryArray[i] = rand.nextInt(30000) + 30000;
                        System.out.print(salaryArray[i] + " ");
                      }
                    break;
                }
                case 2:
                {
                    //System.out.println("Display Array");
                    for (int i = 0; i < salaryArray.length; i++) 
                    {
                        System.out.print("$" + salaryArray[i] + " ");
                        
                    }
                   
                    break;                   
                }
                case 3: 
                {
                    //System.out.println("Minimum");
                    break;
                }
                case 4: 
                {
                    //System.out.println("Maximum");
                    break;
                }
                case 5: 
                {
                    //System.out.println("Range");
                    break;
                }
                case 6: 
                {
                    //System.out.println("Mode");
                    break;
                }
                case 7 :
                {
                    //System.out.println("Mean");
                    double total = 0;
                    for (double element: salaryArray) 
                    {
                        total += element;
                        average = (total / salaryArray.length);
                    }
                    System.out.println("The mean is: " + average);
                    
                    break;
                }
                case 8:
                {
                    //System.out.println("Standard Deviation");
                    System.out.println(standardDeviation(salaryArray));
                    break;
                }
                default:
                {
                    //System.out.println("");
                    break;
                }                   
            }           
        } while (UserInput != 9);
        System.out.println("Goodbye!");
        
        // Calculating Average (The Mean)
        
        
        
        
        
       
        
    }
    
    //Popluate Array Method
    public static double PopulateArray(int [] numbers)
    {
        Random rand = new Random();
        int x = numbers[4];
        
        for (int i = 0; i < numbers.length; i++) 
        {
         
           // x  =(double)(Math.random()31000.00 + 30000.00);
            x = rand.nextInt(31000) + 30000;
            
           
        }
        return x;
        
    }
    
    //Display array method
//    public static double DisplayArray(int[] numbers)
//    {
//        int x = numbers[0];
//        
//    }
        
        
    
    
    // Standard DeviationMethod
    public static double standardDeviation(int[] salaryArray)
    {
        double average = 0.0;
        double stanDev = 0.0;
        double total = 0;
        double total2 = 0;
        double result = 0;
        for (double element: salaryArray) 
        {
           total += element;
        }
        average = (total / salaryArray.length);
        //System.out.println("The average is: " + average);
        //System.out.println(salaryArray.length);
        //System.out.println(total);
        for(double element: salaryArray)
        {
            result += Math.pow((element - average), 2);
            
        } // end for
       // System.out.println(salaryArray.length);
        stanDev = (result/salaryArray.length);
        stanDev = Math.sqrt(stanDev);
             
  
        return (int)stanDev;
    }
            
        
        
        
    
    
    //Max method
    public static double getMaxValue(double [] numbers)
    {
        double maxValue = numbers[0];
        for(int i=0;i < numbers.length;i++)
        {
            if(numbers[i] > maxValue)
            {
                maxValue = numbers[i];
            }
        }
        System.out.println("the max value is: " + maxValue);
        return maxValue;
    }
    
    // Min method
    public static double getMinValue(double [] numbers)
    {
        double minValue = 60001.00;
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i] < minValue)
            {
                minValue = numbers[i];
            }
        }
        System.out.println("the min value is: " + minValue);
        String Output = "the min value is " + minValue;
        
        return minValue;
    }
        
        
    
}
