//Import the ArrayList class
import java.util.ArrayList; 

public class Author
{
    private String authorName;
    
    //Create an ArrayList object.
    private ArrayList<String> authorPapers = new ArrayList<String>();
    
    //Constructor 
    public Author(String authorName)
    {
        this.authorName = authorName;
    }
    
    //Method to return author's name
    public String getName()
    {   
        return this.authorName;
    }
    
    //Use add() method to add elements in the list
    public void addPaper(String paper)
    {
        this.authorPapers.add(paper);
    }
    
    //Method to return author's papers
    public ArrayList<String> getPapers()
    {
        return this.authorPapers;
    }
    
    //Method to check if title excist in author's papers by using contains method.
    public boolean hasPaper(String paperTitle)
    {
        boolean check = this.authorPapers.contains(paperTitle);
        return check;
    }
    
}
    