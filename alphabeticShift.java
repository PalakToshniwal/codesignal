String alphabeticShift(String inputString) 
{
    String nStr = new String();
  for(int i=0; i< inputString.length(); i++)
  {
      if(inputString.charAt(i)== 'z')
      {
          nStr = nStr.concat("a");
      }
      else{
      int n = (int) inputString.charAt(i);
      n= n+1;
      nStr += Character.toString((char)n);
      }
  }
  return nStr;
}
