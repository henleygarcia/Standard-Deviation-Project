package Project;

/**
 *
 *  Team leader: Henley Garcia Panther ID: 4156157 COP2210
 *  David Huerta Panther ID: 5057953 COP2210
 *  Project Description: Write a program that simulates a statistics tool, 
 * by letting the user determine the minimum, the maximum, the range (maximum – minimum), 
 * the mode (value that is repeated more often), the mean
* (average), and the standard deviation of a set of numbers. T
* hese numbers, that will be stored in an array, represent salaries in the $30K – $60K range 
* and are to be generated randomly.
 */
import java.util.Arrays;
import java.util.Scanner;
public class Project 
{

    public static void main(String[] args) 
    {
       double average = 0.0;
     
       
       Scanner in = new Scanner(System.in);
//       double salary = in.nextDouble();
        int UserInput = 0;       
        do 
        {
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
                    break;
                }
                case 2:
                {
                    //System.out.println("Display Array");
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
                    break;
                }
                case 8:
                {
                    //System.out.println("Standard Deviation");
                    break;
                }
                default:
                {
                    //System.out.println(" ");
                    break;
                }                   
            }           
        } while (UserInput != 9);
        //System.out.println("Goodbye!");
        
       double [] salaryArray = {22.0, 69.0, 10.0};
       
//        for (int i = 0; i < salaryArray.length; i++) 
//        {
//            
//        }
//       
        
        // Calculating Average (The Mean)
        double total = 0;
        for (double element: salaryArray) 
        {
           total += element;
           average = (total / salaryArray.length);
        }
        System.out.println("The average is: " + average);
        
        System.out.println(standardDeviation(salaryArray));
        
        
       
        
    }
    // Standard Deviation Method
    public static double standardDeviation(double[] salaryArray)
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
        System.out.println("The average is: " + average);
        System.out.println(salaryArray.length);
        System.out.println(total);
        for(double element: salaryArray)
        {
            result += Math.pow((element - average), 2);
            
        } // end for
        System.out.println(salaryArray.length);
        stanDev = (result/salaryArray.length);
        stanDev = Math.sqrt(stanDev);
             
  
        return stanDev;
            
        
        
        return stanDev;
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
        double minValue = 61;
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
