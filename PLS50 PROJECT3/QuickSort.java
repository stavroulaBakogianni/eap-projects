public class QuickSort
{
    // https://www.programiz.com/dsa/quick-sort
    // perform Quik Sort
    // method to find the partition position
    public static int partition(double array[], int low, int high )
    {
        // choose the rightmost element as pivot
        double pivot = array[high];
        // pointer for greater element
        int i = (low - 1);
        
        // traverse through all elements
        // compare each element with pivot
        for (int j = low; j < high; j++)
        {
            if (array[j] <= pivot)
            {
                // if element smaller than pivot is found
                // swap it with the greatr element pointed by i
                i++;
                // swapping element at i with element at j
                double temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        
        // swapt the pivot element with the greater element specified by i
        double temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        // return the position from where partition is done
        return (i + 1);
    }
    
    public static void quickSort(double array[], int low, int high)
    {
        if (low < high)
        {
           // find pivot element such that
           // elements smaller than pivot are on the left
           // elements greater than pivot are on the right
           int pi = partition(array, low, high);
      
           // recursive call on the left of pivot
           quickSort(array, low, pi - 1);

           // recursive call on the right of pivot
           quickSort(array, pi + 1, high);
        }
    }
}