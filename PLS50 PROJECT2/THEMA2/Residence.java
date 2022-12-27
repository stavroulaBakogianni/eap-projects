public class Residence extends Property
{
    //Contructor that saves the variables propertyID, propertyArea, objectiveValue using the constructor of the class Property with super.
    public Residence( String propertyID, int objectiveValue, double propertyArea )
    {
        super( propertyID, objectiveValue, propertyArea );
        
    }
    
    //Calculate yearly rent based on objective value.
    public int calcRent()
    {
        //Turn the possible double result into integer.
        int yearlyRent = (int) ( 0.03 * this.objectiveValue);
        return yearlyRent;
    }
    
    //Method to calculate and return the formated string.
    public String propertyDetails()
    {
        String type = super.propertyDetails();
        int rent = this.calcRent();
        return type + "#" + rent + "#" + this.propertyArea;
    }
    
}