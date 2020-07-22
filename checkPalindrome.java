boolean checkPalindrome(String inputString) {
 String S1 = new String();
  int len = inputString.length();
  
  for(int i=len-1 ; i>=0 ; i--)
  {
      S1 += inputString.charAt(i);
  }
  System.out.print(S1);
  
   if(S1.equals(inputString))
     return true;
  else
   return false; 
}
