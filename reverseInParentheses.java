
String reverseInParentheses(String str) 
{
    StringBuilder sb = new StringBuilder(str);
    int start, end;
    
    while(sb.indexOf("(")!= -1)
    {
        start = sb.lastIndexOf("(");
        end = sb.indexOf(")", start);
         sb.replace(start, end+1, new StringBuilder(sb.substring(start+1, end)).reverse().toString());
    }
    return sb.toString();
}
