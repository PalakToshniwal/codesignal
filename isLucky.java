boolean isLucky(int n) 
{
  String[] str1 = Integer.toString(n).split("");
 // System.out.print(str1[0]);
 int size = str1.length;
  int i=0, count1=0, count2=0;
  
  for(i=0; i<size/2; i++)
  {
      count1 += Integer.parseInt(str1[i]);
  }
  
  for(i=size/2; i<size; i++)
  {
       count2 += Integer.parseInt(str1[i]);
  }
  
  return (count1 == count2);
  
}
