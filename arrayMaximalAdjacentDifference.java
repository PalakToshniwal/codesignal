int arrayMaximalAdjacentDifference(int[] inputArray) 
{
    int max1= 0, max2=0; 
    for (int i=0; i< inputArray.length-1; i++)
    {
        max1 = Math.abs(inputArray[i] - inputArray[i+1]);
        
        if(max1 > max2)
         max2 = max1;
        
    }
return max2;
}
