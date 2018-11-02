package project;

/**
 *
 *  Team leader: Henley Garcia Panther ID: 4156157 COP2210
 *  David Huerta Panther ID: 5057953 COP2210
 * 
 *  Project Description: Write a program that simulates a statistics tool, 
 * by letting the user determine the minimum, the maximum, the range (maximum – minimum), 
 * the mode (value that is repeated more often), the mean
* (average), and the standard deviation of a set of numbers. 
* These numbers, that will be stored in an array, represent salaries in the $30K – $60K range 
* and are to be generated randomly.
 */
import java.text.DecimalFormat;
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
        DecimalFormat dec = new DecimalFormat();
        dec.setMaximumFractionDigits(2);
       double [] salaryArray = new double [5];

        int UserInput = 0;       
        do 
        {
            // User Menu where the user decides what they want to do.
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
            System.out.print("Please enter a number: ");
            UserInput = in.nextInt(); // Getting user input from the menu
            
            switch(UserInput)
            {
                case 1:
                {
                    System.out.println("");
                    System.out.println("Populating Array");
                      for (int i = 0; i < salaryArray.length; i++) 
                      {
                        salaryArray[i] = rand.nextInt(30000) + 30000;
                      } // end for loop
                    break;
                } // end case 1 which is to populate the array with random numbers.
                case 2:
                {
                    System.out.println("");
                    System.out.println("Display Array");
                 
                    for (int i = 0; i < salaryArray.length; i++) 
                    {
                        System.out.print("$" + salaryArray[i] + " ");                       
                    } // end for loop                   
                    break;                   
                } // end case 2 which is to display the array of random numbers
                case 3: 
                {
                    System.out.println("");
                    System.out.println("Getting the Minimum");
                    System.out.println("The minimum value is: "  + "$" + getMinValue(salaryArray));
                    break;
                } // end case 3 which is getting the Minimum
                case 4: 
                {
                    System.out.println("");
                    System.out.println("Getting the Maximum");
                    System.out.println("The maximum value is: " + "$" + getMaxValue(salaryArray));
                    break;
                } // end case 4 which is getting the Maximum 
                case 5: 
                {
                    System.out.println("");
                    System.out.println("Getting the Range");
                    System.out.println("The range is: " + "$" + (getMaxValue(salaryArray) - getMinValue(salaryArray)));
                    break;
                } // end case 5 which is getting the Range
                case 6: 
                {
                    System.out.println("Getting the Mode");
                    
                    if (getMode(salaryArray) == 0) 
                    {
                        System.out.println("There is no mode for this list of numbers.");
                        
                    } // end if 
                    else 
                        System.out.println(getMode(salaryArray));
                    break;
                } // end case 6 which is the Mode
                case 7:
                {
                    System.out.println("Getting the Mean");
                    double total = 0;
                    for (double element: salaryArray) 
                    {
                        total += element;
                        average = (total / salaryArray.length);
                    }
                    System.out.println("The mean is: " + "$" + average);
                    
                    break;
                } // end Case 7 which is the Mean 
                case 8:
                {
                    System.out.println("Standard Deviation (Based on Population) ");
                    System.out.println("$" + dec.format(standardDeviation(salaryArray)));
                    break;
                } //  End case 8 (Standard Deviation)
                default:
                {
                   
                    break;
                } // default case                   
            }           
        } while (UserInput != 9);
        System.out.println("Goodbye!"); // Exits the program
    
    }  
   
    // Standard DeviationMethod
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
        } // end for each loop
        average = (total / salaryArray.length); // Calculating average variable
        
        for(double element: salaryArray)
        {
            result += Math.pow((element - average), 2); // Calculating piece of stanDev
            
        } // end for each loop
    ;
        stanDev = (result/salaryArray.length);
        stanDev = Math.sqrt(stanDev);            
  
        return stanDev;
    } // end method standardDeviation   
    
    //Max method
    public static double getMaxValue(double [] numbers)
    {
        double maxValue = numbers[0];
        for(int i=0;i < numbers.length;i++)
        {
            if(numbers[i] > maxValue)
            {
                maxValue = numbers[i];
            } // end if 
        } // end for loop
        return maxValue;
    } // end method getMaxValue
    
    // Min method
    public static double getMinValue(double [] numbers)
    {
        double minValue = 60001.00;
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i] < minValue)
            {
                minValue = numbers[i];
            } // end if 
        } // end for loop
        return minValue;
    } // end method  getMinValue
    
    public static double getMode(double[] num)
    {      
        Arrays.sort(num);   
    double count2 = 0;
    double count1 = 0;
    double pupular1 =0;
    double popular2 =0;
    for (int i = 0; i < num.length; i++)
    {
            pupular1 = num[i];
            count1 = 0;    
        for (int j = i + 1; j < num.length; j++)
        {
            if (pupular1 == num[j]) count1++;
        } // end for loop
        if (count1 > count2)
        {
                popular2 = pupular1;
                count2 = count1;
        } // end if 
        else if(count1 == count2)
        {
            popular2 = Math.min(popular2, pupular1);          
        } // end else if
    } // end for loop  
    return popular2;
 
    } // end method getMode
  
}
