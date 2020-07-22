boolean areEquallyStrong(int yl, int yr, int fl, int fr)
 {
     if(yl == fl && yr == fr)
     return true;
     
     else if(yl == fr && yr == fl)
     return true;
     
     else
     return false;

}
