int makeArrayConsecutive2(int[] statues) 
{
    int x=0, count=0;
    int temp = 0;
    
 for(int i=1 ; i< statues.length; i++)
 {
     for(int j=0 ; j< statues.length; j++)
     {
         if(statues[j] > statues[i])
         {
           temp = statues[j];
         statues[j] = statues[i];
         statues[i] = temp;  
         }
     }
 }
 for(int k=0 ; k< statues.length ; k++)
 {
     System.out.print(statues[k]);
 }
 while(x < statues.length-1)
 {
     if(statues[x]+1 == statues[x+1])
       x++;
      
      else
       {
          count += ((statues[x+1] - statues[x]) - 1); 
          x++;
       } 
 }
 return count;
 
}
