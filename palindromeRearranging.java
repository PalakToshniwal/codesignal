boolean palindromeRearranging(String str) 
{
    char ch;
    char s[] = str.toCharArray();
    int count=0, k=0, c1=0;
    int ar[] = new int[str.length()];
    for(int i=0; i < str.length(); i++)
    {
        ch = s[i];
        count = 0;
        for(int j=0; j< str.length(); j++)
        {
            if(ch == s[j] && ch != '0')
            {
                count++;
                s[j] = '0';
            }
        }
        if(count>0)
        {
        ar[k] = count;
        k++;
        }
    }
    System.out.print(Arrays.toString(ar));
    
    for(int i=0; i< ar.length; i++)
    {
        if(ar[i]%2 != 0)
        {
            c1++;
        }
    }
    return c1<2;
}
