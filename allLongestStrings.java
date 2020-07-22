String[] allLongestStrings(String[] inputArray) 
{
    int len1=0, len2=0, l=0, total=0;
    
    for(int i=0; i<inputArray.length; i++)
    {
        len1 = inputArray[i].length();
         if(len1>len2)
         {
             len2 = len1;
         }
    }
    for(int j=0; j<inputArray.length; j++)
    {
        if(inputArray[j].length() == len2)
        {
            total++;
        }
    }
    String newArray[] = new String[total];
    for(int k=0; k<inputArray.length; k++)
    {
        if(inputArray[k].length() == len2)
        {
            newArray[l]= inputArray[k];
            l++;
        }
    }
   return newArray; 
}
