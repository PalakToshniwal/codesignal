int avoidObstacles(int[] inputArray) 
{
    int count=0,num=0, i=2;
    while( i<=1001)
    {
        count=0;
        for(int j=0; j<inputArray.length; j++)
        {
            if(inputArray[j]%i ==0)
            {
                 i++;
                 break;
            }
            else
             count++;         
        }
        if(count == inputArray.length)
         break;
    }
return i;
}
