
boolean isIPv4Address(String str) 
{
    boolean flag=true;
    int j=0;
    String[] s = str.split("\\.");
     
    if(s.length<4 || s.length>4)
    return false;
    
    while( j < s.length)
    {
        if( s[j].isEmpty())
        return false;
        
        if(s[j].length() >1 )
        {
            if(s[j].charAt(0) == '0')
            return false;
            
            else if(s[j].length()>3)
            return false;
        }
        for(int k=0; k<s[j].length(); k++)
        {
            if(s[j].charAt(k)>='a' && s[j].charAt(k)<='z' || s[j].charAt(k) >= 'A' && s[j].charAt(k)<='Z')
            return false;
        }
        int x = Integer.parseInt(s[j]);
        if(0 <= x && x <= 255)
        flag = true;
        
        else
        {flag = false;
        break;}
        j++;
    }
    return flag;
}
