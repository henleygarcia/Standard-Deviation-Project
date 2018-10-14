package project;

/**
 *
 * @author Henley Garcia
 */
import java.util.Scanner;
public class Project 
{

    public static void main(String[] args) 
    {
       double average = 0.0;
     
       
       Scanner in = new Scanner(System.in);
//       double salary = in.nextDouble();
       double [] salaryArray = {22.0, 69.0, 10.0};
       
//        for (int i = 0; i < salaryArray.length; i++) 
//        {
//            
//        }
//       
        
        // Calculating Average
        double total = 0;
        for (double element: salaryArray) 
        {
           total += element;
           average = (total / salaryArray.length);
        }
        System.out.println("The average is: " + average);
        
        System.out.println(standardDeviation(salaryArray));
        
        
       
        
    }
    
    
    public static double standardDeviation(double[] salaryArray)
    {
        double average = 0.0;
        double stanDev = 0.0;
        double total = 0;
        for (double element: salaryArray) 
        {
           total += element;
           average = (total / salaryArray.length);
        }
        System.out.println("The average is: " + average);
        for (double element: salaryArray)
        {
            double result = Math.pow(2, element - average);
            stanDev = Math.sqrt(result/(salaryArray.length-1));
            
        } // end for
            
        
        
        return stanDev;
    }
    
}
