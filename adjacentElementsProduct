int adjacentElementsProduct(int[] inputArray) 
{
   int prod1=Integer.MIN_VALUE, prod2= Integer.MIN_VALUE;
   
   for(int i=0; i<inputArray.length; i++)
   {
       if(i+1 < inputArray.length)
       {
       prod1 = inputArray[i] * inputArray[i+1];
    
        if(prod1 > prod2)
        prod2 = prod1;   
       }
   }
   
   return prod2;
}
