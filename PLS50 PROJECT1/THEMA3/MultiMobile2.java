import java.util.Scanner;

public class MultiMobile2
{
    double[] gain = new double[10];
    
    // Fill the array with zeroes with the costructor
    public MultiMobile2()
    {
        for(int i=0;i<10;i++)
        {
            gain[i] = 0;
        }
    }
    
    // Read from keyboard the time in seconds and return the value
    public int read_time()
    {
        int seconds;
        Scanner keyboard = new Scanner(System.in);   
        System.out.println("Enter time in seconds:");
        seconds = keyboard.nextInt();  
        return seconds;
    }
    
    // Read from keyboard the sms count and return the value
    public int read_messages()
    {
        int sms;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter sms count:");
        sms = keyboard.nextInt();
        return sms;
    }
    
    // Calculate and return total cost of the first package
    public double calculate_invoice(int seconds, int sms)
    {
        double timeCost,smsCost,subToll,vat,totalCost;
        int fixedCost = 12;
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
        return totalCost;
    }
    
    // Calculate and return total cost of the free package
    public double calculate_invoice_free( int seconds,int sms)
    {
       double totalCostFree,subTollFree,timeCostFree,vatFree,smsCost;
       
       smsCost = sms*0.08;
       timeCostFree = seconds*0.02;
       subTollFree = (timeCostFree + smsCost)*0.05;
       vatFree = (subTollFree + smsCost + timeCostFree)*0.24;
       totalCostFree = timeCostFree + smsCost + subTollFree +vatFree;
       return totalCostFree;
    }
    
    // Find and show the two biggest values of the gain array also their positions
    public void calc_largest()
    {
        double maxDcAbsolute = gain[0];
        int maxPosition = 0;
        
        // Find max|dc| in the array and store the position
        for(int i=1;i<10;i++)
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
        for(int i=0; i<10;i++)
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