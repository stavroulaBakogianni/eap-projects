//import java lang.Math package
import java.lang.Math;

public class SortExperiment
{
    public static void main( String[] args )
    {
        // create BubbleSort object
        BubbleSort exampleBubbleSort = new BubbleSort();
        // create InsertionSort object
        InsertionSort exampleInsertionSort = new InsertionSort();
        // create SelectionSort object
        SelectionSort exampleSelectionSort = new SelectionSort();
        // create MergeSort object
        MergeSort exampleMergeSort = new MergeSort();
        // create QuickSort object
        QuickSort exampleQuickSort = new QuickSort();
        
        //loop from 1 to 5 to run the five sorting algorithms
        for ( int k = 1; k <= 5; k++ )
        {
            // loop from 1000 to 10.000 for array sizes
            for ( int i = 1000; i <= 10000; i += 1000 )
            {
                // initialize a random array
                double[] randomArray = new double[i];
                // initialize already sorted array 
                double[] sortedArray = new double[i];
                // initialize a reverse sorted array
                double[] reverseSortedArray = new double[i];
                
                // fill the arrays with values 
                for ( int j = 0; j < i; j++ )
                {
                   //use java.lang.Math.random() method to generate random values between [0,1]
                   randomArray[j] = Math.random();
                   
                   // procedure to generate incremental values for the sortedArray
                   if ( j==0 )
                   {
                       sortedArray[j] = 0;
                   }
                   else
                   {
                       sortedArray[j] = sortedArray[j-1] + ((double) 1/i);
                   }
                   
                   // procedure to generate decrimental values for the rerverseSortedArray
                   if ( j==0 )
                   {
                      reverseSortedArray[j] = 1.0;
                   }
                   else
                   {
                       reverseSortedArray[j] = reverseSortedArray[j-1] - ((double) 1/i);
                   }
                }
                //declare algorithm name variable
                String algorithmName = "";
                //take the start time in nano second 
                long startTime = System.nanoTime();
                
                // sort the randomArray using the k method
                if ( k==1 )
                {
                    exampleBubbleSort.bubbleSort(randomArray);
                    algorithmName = "Bubble";
                }
                else if ( k==2 )
                {
                    exampleInsertionSort.insertionSort(randomArray);
                    algorithmName = "Insertion";
                }
                else if ( k==3 )
                {
                    exampleSelectionSort.selectionSort(randomArray);
                    algorithmName = "Selection";
                }
                else if ( k==4 )
                {
                    exampleMergeSort.mergeSort(randomArray, 0, i/2, i-1);
                    algorithmName = "Merge";
                }
                else if ( k==5 )
                {
                    exampleQuickSort.quickSort(randomArray, 0, i-1);
                    algorithmName = "Quick";
                }
                //get the ending time in nano second
                long endTime = System.nanoTime();
                
                // calculate and show the Random Array Bubble sort algorithm time
                System.out.println( " Random Array " + algorithmName + " sort algorithm time for " + i + " array size is : " + ( endTime - startTime ) );
                
                startTime = System.nanoTime();
                
                // sort the sortedArray using the k method
                if( k==1 )
                {
                exampleBubbleSort.bubbleSort(sortedArray);
                }
                else if ( k==2 )
                {
                    exampleInsertionSort.insertionSort(sortedArray);
                }
                else if ( k==3 )
                {
                    exampleSelectionSort.selectionSort(sortedArray);
                }
                else if ( k==4 )
                {
                    exampleMergeSort.mergeSort(sortedArray, 0, i/2, i-1);
                }
                else if ( k==5 )
                {
                    exampleQuickSort.quickSort(sortedArray, 0, i-1);
                }
                
                endTime = System.nanoTime();
                //calculate and show the Sorted Array Bubble sort algorithm time
                System.out.println( " Sorted Array " + algorithmName + " sort algorithm time for " + i + " array size is : " + ( endTime - startTime ) );
                
                startTime = System.nanoTime();
                
                // sort the reverseSortedArray using the bubbleSort method
                if( k==1 )
                {
                exampleBubbleSort.bubbleSort(reverseSortedArray);
                }
                else if ( k==2 )
                {
                    exampleInsertionSort.insertionSort(reverseSortedArray);
                }
                else if ( k==3 )
                {
                    exampleSelectionSort.selectionSort(reverseSortedArray);
                }
                else if ( k==4 )
                {
                    exampleMergeSort.mergeSort(reverseSortedArray, 0, i/2, i-1);
                }
                else if ( k==5 )
                {
                    exampleQuickSort.quickSort(reverseSortedArray, 0, i-1);
                }
                endTime = System.nanoTime();
                //calculate and show the Reverse Sorted Array Bubble sort algorithm time
                System.out.println( " Reverse Sorted Array " + algorithmName + " sort algorithm time for " + i + " array size is : " + ( endTime - startTime ) );
                
                System.out.println( " " );
            }
        }
    }
}