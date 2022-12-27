public abstract class Property 
{
    public static String[] propertyTypes = new String[]{"RESIDENCE","STORE"};
    private String propertyID;
    public int objectiveValue;
    public double propertyArea;
    
    //Constructor that initializes the class variables: propertyID, objectiveValue, propertyArea
    public Property (String propertyID, int objectiveValue, double propertyArea)
    {
        this.propertyID = propertyID;
        this.objectiveValue = objectiveValue;
        this.propertyArea = propertyArea;
    }

    //Method to identify the property type
    public String propertyDetails()
    {
        if( this.propertyID.charAt(0) == '0' )
        {
            return propertyTypes[0];
        }
        
        return propertyTypes[1];
    }
    
    public abstract int calcRent();
}