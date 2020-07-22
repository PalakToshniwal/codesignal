boolean almostIncreasingSequence(int[] seq) 
{
    int m1=-999,m2=-999,dec=0;
    
    if(seq.length == 1)
     return true;
     
    else
     {
         for(int i=0; i<seq.length; i++)
         {
             if(seq[i] > m1)
             {
                 m2=m1;
                 m1=seq[i];
             }
             else if(seq[i] > m2)
             {
                 m1=seq[i];
                 dec++;
             }
             else
               dec++;
         }
         return dec<2;

     }
}
