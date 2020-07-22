int[] alternatingSums(int[] a) 
{
    int ar[] = new int[2];
  for(int i=0;i<a.length; i++)
  {
      if(i%2 == 0)
      {
          ar[0] += a[i];
      }
      else
        ar[1] += a[i];
  }
  return ar;
}
