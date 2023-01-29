public class BubbleSort
{
    // https://www.programiz.com/dsa/bubble-sort
    // perform the bubble sort
    public void bubbleSort(double array[]) 
    {
        int size = array.length;
        
        // loop to access each array element
        for (int i = 0; i < size - 1; i++)
        {
            // declare flag for early exit
            boolean flag = false;
            
            // loop to compare array elements
            for (int j = 0; j < size - i - 1; j++)
            {
            
                // compare two adjacent elements
                // change > to < to sort in descending order
                if (array[j] > array[j + 1]) {
                
                    // swapping occurs if elements
                    // are not in the intended order
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    
                    // the next element is smaller so we continue the loop
                    flag = true;
                }
            }
            
            //  If there weren't elements to swap in inner loop, then break
            if (flag == false)
            {
                break;
            }
        }
    }
}