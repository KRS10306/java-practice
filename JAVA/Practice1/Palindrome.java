class Solution {
    public boolean isPalindrome(int x) {
        int y = x;
        int a;
        int z = 0;
        while(y!=0){
            a = y%10;
            z = (z*10) + a;
            y = y/10;
        }
        if(x >= 0){
            if(z == x){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
