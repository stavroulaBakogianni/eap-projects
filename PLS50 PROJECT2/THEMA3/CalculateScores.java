//Import the Scanner class
import java.util.Scanner;

//Import the ArrayList class
import java.util.ArrayList; 

public class CalculateScores
{
    public static void main (String[] args)
    {
        //Use nextInt() method from Scanner class to read how many authors
        Scanner keyboard = new Scanner(System.in);
        System.out.println( "How many authors:" );
        int authorsTotal = keyboard.nextInt();
        
        // That's because the Scanner.nextInt method does not read the newline character in your input created by hitting "Enter,"
        // and so the call to Scanner.nextLine returns after reading that newline.
        // https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
        keyboard.nextLine();
        
        //Create authors array 
        Author[] authorsArray = new Author[authorsTotal];
        
        //Create authors objects
        for( int i=0; i < authorsTotal; i++ )
        {
            System.out.println( "Type author's name and press enter" );
            
            //Use nextLine() method from Scanner class to read author's name.
            String name = keyboard.nextLine();
            
            //Store the author object to array.
            authorsArray[i] = new Author(name);
            
            //Read how many papers the author has.
            System.out.println( "How many papers:" );
            int papersTotal = keyboard.nextInt();
            keyboard.nextLine();
            
            //Store the paper title
            for( int j=0; j < papersTotal; j++ )
            {
                System.out.println( "Type title of each paper in a separate line" );
                String title = keyboard.nextLine();
                authorsArray[i].addPaper(title);
            }
        }
        
        System.out.println( "Authors’ Scores" );
        
        //Get the papers for each author.
        //Use getPapers() method.
        for( int i=0; i < authorsTotal; i++ )
        {
                ArrayList<String> papers = authorsArray[i].getPapers();

                //Variable to store the total score of the author's papers.
                double totalScore = 0.0;
                
                //Use size() method from ArrayList to loop through the papers.
                for( int j = 0; j < papers.size(); j++ )
                {
                    //Use get() method of ArrayList to store the paper title.
                    String paperTitle = papers.get(j);
                    int countPapers = 0;
                    
                    for( int k = 0; k < authorsTotal; k++ )
                    {
                        boolean paperExists = authorsArray[k].hasPaper(paperTitle);
                        
                        //Increase count if paper exist in authors.
                        if( paperExists )
                        {
                            countPapers++;
                        }
                    }
                    
                    //Calculate the score for the current paper/author.
                    double score = 10/countPapers;
                    
                    //Calculate the total score for the current author.
                    totalScore += score;
                }
                
                //Show author's name and author's total score.
                System.out.println( "Author: " + authorsArray[i].getName() + " Score: " + totalScore );
        }
    }
}
