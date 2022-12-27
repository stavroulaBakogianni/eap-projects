import java.lang.Math;
import java.util.Scanner;

public class MultiMobileApp
{
    public static void main(String[] args)
    {
        
        char answer;
        
        do
        {
            MultiMobile2 mobile = new MultiMobile2();
            for(int i = 0; i<5; i++)
            {
                int readTime = mobile.read_time();
                int readMessages = mobile.read_messages();
                double invoiceCost = mobile.calculate_invoice(readTime,readMessages);
                double invoiceCostFree = mobile.calculate_invoice_free(readTime,readMessages);            
            
                // I find the absolute difference of two packages
                double absDifferenceOfPackages =  Math.abs( invoiceCost - invoiceCostFree );
                mobile.gain[i] = absDifferenceOfPackages;
            }
        
            mobile.calc_largest();
        
            // Ask the the user if he/she wants to repeat the procedure 
            System.out.println(" Do you want to repeat the procedure?");
            System.out.println(" Type Y for Yes or N for No");
            Scanner keyboard = new Scanner(System.in);
            answer = keyboard.nextLine().charAt(0);
            
        } while( answer == 'Y' );
        
        
        
    }
}