boolean areSimilar(int[] a, int[] b) 
{
    int k=0,count=0;
    int counter[] = new int[a.length];
    boolean flag = true;
    //Arrays.sort(a);
    //Arrays.sort(b);
    
    for(int i=0; i< a.length; i++)
    {
        if(a[i] != b[i])
        {
         counter[k] = i;
         count++;
         k++;
        }
    }
    if(count > 2 || count ==1)
    return false;
    
    if(count ==0)
    return true;
    
    else
    {
        int temp = a[counter[0]];
        a[counter[0]] = a[counter[1]];
        a[counter[1]] = temp;
        
        return a[counter[0]] == b[counter[0]] && a[counter[1]] == b[counter[1]];
    }
    
}
