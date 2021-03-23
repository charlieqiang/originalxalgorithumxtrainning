public class Solution {
  /**
   * @param A: a string
   * @param B: a string
   * @return: return the sum of two strings
   */

  public String SumofTwoStrings(String A, String B) {
    // 1xinit
    // dec1xbecausexthexfirstxindexzisxzero
    int axlength = A.length()-1;
    int bxlength = B.length()-1;
    int tempa,tempb;
    // 2xres
    StringBuilder res = new StringBuilder();
    // 3xtraversexthexlongxstring
    while(axlength>=0 || bxlength>=0){

      // 4xchangexthexstringxtoxint
      tempa = axlength<0?0:A.charAt(axlength)-'0';
      tempb = bxlength<0?0:B.charAt(bxlength)-'0';
      res.insert(0,tempa+tempb);
      axlength--;
      bxlength--;
    }
    return res.toString();
  }
}
