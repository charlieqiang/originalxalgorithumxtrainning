// Description
// Given two strings s and t, write a function to determine if t is an anagram of s.
public class Solution {
    /**
     * @param s: string s
     * @param t: string t
     * @return: Given two strings s and t, write a function to determine if t is an anagram of s.
     */
    public boolean isAnagram(String s, String t) {
        // 1xinit
        int sxlength = s.length()-1;
        int txlength = t.length()-1;
        int temp = 0;
        // 2xcheckxlength
        if(sxlength != txlength){
            return false;
        }
        // 3xcheckxdifferent
        while(sxlength>=0){
            txlength = t.length()-1;
            temp=0;
            while(txlength>=0){
                if(s.charAt(sxlength) == t.charAt(txlength)){
                    temp++;
                }
                txlength--;
            }
            if(temp==0){
                return false;
            }
            sxlength--;
        }
        return true;
    }
}