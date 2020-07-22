int arrayChange(int[] arr)
{
    int prev =0;
    int count =0;
  for(int i=1; i< arr.length; i++)
  {
      if(arr[prev] >= arr[i])
      {
          while(arr[prev] > arr[i])
          {
              arr[i] = arr[i]+1;
              count++;
          }
          arr[i] = arr[i]+1;
          count++;
      }
      prev=i;
  }
  return count;
}
