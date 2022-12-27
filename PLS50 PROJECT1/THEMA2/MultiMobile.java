import java.util.Scanner;
import java.lang.Math;

public class MultiMobile
{
    public static void main(String[] args)
    {
        // I declare the array gain
        double[] gain = new double[5];
        
        // I declare the variables that the user will input
        int seconds,sms;
        
        // I declare the variable to calculate the costs
        double totalCost,timeCost,smsCost,subToll,vat;
        int fixedCost = 12;
        double totalCostFree,subTollFree,timeCostFree,vatFree,dc,dcAbsolute;
        
        Scanner keyboard = new Scanner(System.in);
        
        // I iterate 5 times
        for(int i=0; i<5; i++)
        {
            System.out.println("Enter time in seconds:");
            seconds=keyboard.nextInt();
        
            System.out.println("Enter sms count:");
            sms=keyboard.nextInt();
            
            // Condition for free minutes
            if ( seconds > 1000*60 )
            {
                timeCost = (seconds - 1000*60)*0.02;
            }
            else 
            {
                timeCost = 0;
            }
        
            // Calculate the result for the first package
            smsCost = sms*0.08;
            subToll = (fixedCost + timeCost + smsCost)*0.05;
            vat = (fixedCost + timeCost + smsCost + subToll)*0.24;
            totalCost = fixedCost + timeCost + smsCost + subToll + vat;
            
            // Calculate the result for the free package
            timeCostFree = seconds*0.02;
            subTollFree = (timeCostFree + smsCost)*0.05;
            vatFree = (subTollFree + smsCost + timeCostFree)*0.24;
            totalCostFree = timeCostFree + smsCost + subTollFree +vatFree;
            
            // Calculate the difference "dc" of the two package
            dc = totalCost - totalCostFree ;
            
            // Calculate the absolute difference |dc|
            dcAbsolute = Math.abs(dc);
            
            // Store |dc| to an array
            gain[i] = dcAbsolute;
            
        }
        // Declare the max variable and max position variable
        double maxDcAbsolute = gain[0];
        int maxPosition = 0;
        
        // Find max|dc| in the array and store the position
        for(int i=1;i<5;i++)
        {
           if(maxDcAbsolute < gain[i])
           {
               maxDcAbsolute = gain[i];
               maxPosition = i;
           }
        }
        
        // Show the max|dc| value and position
        System.out.println("max|dc| = " + maxDcAbsolute);
        System.out.println("max_position = " + maxPosition);
        
        // Declare the second biggest |dc| and second biggest position variable
        double secondBiggestDcAbsolute = 0 ;
        int secondBiggestDcAbsolutePosition = 0;
        
        
        // Find the second biggest |dc| of the array
        for(int i=0; i<5;i++)
        {
            if(i!=maxPosition)
            {
                if( secondBiggestDcAbsolute <= gain[i])
                {
                    secondBiggestDcAbsolute = gain[i];
                    secondBiggestDcAbsolutePosition = i;
                }
            }
        }
        
        // Show the second biggest |dc| of the array and its position
        System.out.println("second_biggest_|dc| = " + secondBiggestDcAbsolute);
        System.out.println("second_biggest_position = " +  secondBiggestDcAbsolutePosition);
    
        
    }
}