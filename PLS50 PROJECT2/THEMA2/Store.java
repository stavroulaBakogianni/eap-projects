public class Store extends Property
{
    private double locationFactor;
    
    //Constructor that initializes the class variables: propertyID, objectiveValue, propertyArea, locationFactor.
    //Use super for propertyID, objectiveValue, propertyArea variables.
    public Store ( String propertyID, int objectiveValue, double propertyArea, double locationFactor )
    {
        super( propertyID, objectiveValue, propertyArea );
        this.locationFactor = locationFactor;
    }
    
    //Method that calculates  the yearly rent based on objective value and location factor.
    public int calcRent()
    {
        //Turn the possible double result into integer.
        int yearlyRent = (int) (0.03 * this.objectiveValue * this.locationFactor);
        return yearlyRent;
    }
    
    //Method to calculate and return the formated string <Λεκτικό τύπου ακινήτου>#<Εκτιμώμενο ενοίκιο>#<Επιφάνεια ακινήτου>#<Συντελεστής εμπορικότητας>
    public String propertyDetails()
    {
        String type = super.propertyDetails();
        int rent = this.calcRent();
        return type + "#" + rent + "#" + this.propertyArea + "#" + this.locationFactor;
    }
    
}