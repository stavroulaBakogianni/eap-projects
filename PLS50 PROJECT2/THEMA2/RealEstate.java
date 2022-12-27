
public class RealEstate
{
    public static void main(String[] args)
    {
        Property[] prop = {new Store("10001",100000,200,1.12),
                           new Store("10002",300000,150,0.78),
                           new Residence("00001",500000,145),
                           new Residence("00002",350000,115)};
                           
        for( int i=0; i < prop.length; i++)
        {
            //Store the result of property details in a variable.
            String print = prop[i].propertyDetails();
            //Seperate the string named print into parts.
            String[] parts = print.split( "#" );
            //Show the information for each property.
            System.out.println( "Property Type:" + parts[0] );
            System.out.println( "Estimated yearly rent:" + parts[1] );
            System.out.println( "Property Area:" + parts[2] );
            
            if(parts.length > 3)
            {
                System.out.println( "Location Factor:" + parts[3] );
            }
            
            System.out.println( " " );
            
        }
            
            
        }
}
