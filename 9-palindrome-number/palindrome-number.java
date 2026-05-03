class Solution {
    public boolean isPalindrome(int x) {
      if(x<0) return false;
      if(x<10 && x>0) return true;
      int y = x;
      int revno=0;
      while(y != 0){
        int rem=y % 10;
        revno = revno * 10 + rem;
        y /= 10;
      }
      if(revno==x){
        return true;
      }
      return false;
    }
}