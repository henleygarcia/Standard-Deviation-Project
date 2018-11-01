package Project;

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
//       double salary = in.nextDouble();
       double [] salaryArray = new double [5];
       
//        for (int i = 0; i < salaryArray.length; i++) 
//        {
//            salaryArray[i] = rand.nextInt(30000) + 30000;
//            System.out.print(salaryArray[i] + " ");
//        }
//        System.out.println("");
        
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
            System.out.print("Please enter a number: ");
            UserInput = in.nextInt();
            
            switch(UserInput)
            {
                case 1:
                {
                    
                    //System.out.println("Populate Array");
                      for (int i = 0; i < salaryArray.length; i++) 
                      {
                        salaryArray[i] = rand.nextInt(30000) + 30000;
                        //System.out.print(salaryArray[i] + " ");
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
                    System.out.println("the minimum value is: "  + getMinValue(salaryArray));
                    break;
                }
                case 4: 
                {
                    //System.out.println("Maximum");
                    System.out.println("the maximum value is: " + getMaxValue(salaryArray));
                    break;
                }
                case 5: 
                {
                    //System.out.println("Range");
                    System.out.println("the range is: " + (getMaxValue(salaryArray) - getMinValue(salaryArray)));
                    break;
                }
                case 6: 
                {
                    //System.out.println("Mode");
                    
                    if (getMode(salaryArray) == 0) 
                    {
                        System.out.println("there is no mode");
                        
                    }
                    else 
                        System.out.println(getMode(salaryArray));
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
                    System.out.println("Standard Deviation");
                    System.out.println(dec.format(standardDeviation(salaryArray)));
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
        //System.out.println("the max value is: " + maxValue);
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
        //System.out.println("the min value is: " + minValue);
        //String Output = "the min value is " + minValue;
        
        return minValue;
    }
    
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
        }
        if (count1 > count2)
        {
                popular2 = pupular1;
                count2 = count1;
        }
        else if(count1 == count2)
        {
            popular2 = Math.min(popular2, pupular1);          
        }
    }  
    return popular2;
 
    }
  
}
