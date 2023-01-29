public class MergeSort
{
    // https://www.programiz.com/dsa/merge-sort
    // perform merge sort
    // Merge two subarrays L and M into arr
    public void mergeSort(double arr[], int p, int q, int r)
    {
        // Create L ← A[p..q] and M ← A[q+1..r]
        int n1 = q - p + 1;
        int n2 = r - q;

        double L[] = new double[n1];
        double M[] = new double[n2];
        
        for (int i = 0; i < n1; i++)
        {
            L[i] = arr[p + i];
        }
        for (int j = 0; j < n2; j++)
        {
            M[j] = arr[q + 1 + j];
        }
        
        // Maintain current index of sub-arrays and main array
        int i, j, k;
        i = 0;
        j = 0;
        k = p;
        
        // Until we reach either end of either L or M, pick larger among
        // elements L and M and place them in the correct position at A[p..r]
        while (i < n1 && j < n2)
        {
            if (L[i] <= M[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = M[j];
                j++;
            }
            k++;
        }
        
        // When we run out of elements in either L or M,
        // pick up the remaining elements and put in A[p..r]
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2)
        {
            arr[k] = M[j];
            j++;
            k++;
        }
    }
}