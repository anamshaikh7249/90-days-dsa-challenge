class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }//n is temporary
        int n = x; 
        int rev = 0;

        while(n>0){
            int digit = n%10;//extract last digit
            rev = (rev*10)+digit; //calculate
            n=n/10; //single digit
        }
        if(rev == x){
            return true;
        }
        else{
            return false;
        }
    }
}