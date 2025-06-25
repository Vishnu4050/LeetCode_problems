import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int org=x;
        while(x>0){
            int ld=x%10;
            rev=rev*10+ld;
            x/=10;
        }
        if(org==rev)
            return true;
        
        else
            return false;
        

    }
}