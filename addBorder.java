String[] addBorder(String[] pic) 
{
    String star = new String();
    int len = pic[0].length();
    List <String> bpic = new ArrayList<String>();
    
    for(int i=0; i<len+2; i++)
    {
       star += "*" ;
    }
    bpic.add(star);
    
    for(int i=0; i< pic.length; i++)
    {
        pic[i] = "*" + pic[i] + "*";
        bpic.add(pic[i]);
    }
    bpic.add(star);
    
    return bpic.toArray(pic);
}
