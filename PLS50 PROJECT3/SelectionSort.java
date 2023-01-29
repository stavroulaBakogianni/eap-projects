public class SelectionSort 
{
    // https://www.programiz.com/dsa/selection-sort
    // perform selection sort
    public void selectionSort( double array[] )
    {
        int size = array.length;
        
        for (int step = 0; step < size - 1; step++)
        {
            int min_idx = step;
            
            for (int i = step + 1; i < size; i++)
            {
                // Select the minimum element in each loop.
                if (array[i] < array[min_idx])
                {
                    min_idx = i;
                }
            }
            
            // put min at the correct position
            double temp = array[step];
            array[step] = array[min_idx];
            array[min_idx] = temp;
        }
    }
}