int[] sortByHeight(int[] a)
{
    int size = a.length;
    int ar[] = new int[size];
    int k=0, count=0, temp;
   // int newar[] = new int[size];
    int i=0;
    
    for(i=0; i<size; i++)
    {
        if(a[i] != -1)
        {
            ar[k] = a[i];
            k++;
        }
    }
    Arrays.sort(ar,0,k);
    
    k=0;
    for(i=0; i<size; i++)
    {
        if(a[i] != -1)
        {
            a[i] = ar[k];
            k++;
        }
    }
    return a;
}
