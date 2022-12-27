import java.util.Scanner;

public class Mobile 
{
    Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args)
    {
        // I declare the variables that the user will input
        int customerCode,seconds,sms;
        
        
        // I read the first input from the keyboard
        System.out.println("Enter customer code:");
        customerCode=keyboard.nextInt();
        
        System.out.println("Enter time in seconds:");
        seconds=keyboard.nextInt();
        
        System.out.println("Enter sms count:");
        sms=keyboard.nextInt();
        
        // I declare the variable to calculate the costs
        double totalCost,timeCost,smsCost,subToll,vat;
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
        
        smsCost = sms*0.08;
        subToll = (fixedCost + timeCost + smsCost)*0.05;
        vat = (fixedCost + timeCost + smsCost + subToll)*0.24;
        totalCost = fixedCost + timeCost + smsCost + subToll + vat;
        
        // Show the results for the first mobile plan package
        System.out.println("Customer code: " + customerCode);
        System.out.println("Time:          " + seconds);
        System.out.println("SMS:           " + sms);
        System.out.println("Fee:           " + subToll);
        System.out.println("Vat:           " + vat);
        System.out.println("TOTAL:         " + totalCost);
        
        // Calculate and show the result for the free package
        double totalCostFree,subTollFree,timeCostFree,vatFree;
        timeCostFree = seconds*0.02;
        subTollFree = (timeCostFree + smsCost)*0.05;
        vatFree = (subTollFree + smsCost + timeCostFree)*0.24;
        totalCostFree = timeCostFree + smsCost + subTollFree +vatFree;
        System.out.println("TOTAL (free):  " + totalCostFree);
    }
}