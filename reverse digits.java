class Solution {
    public int reverseDigits(int n) {
        int rev=0;
        while(n!=0){
            int l=n%10;
            rev=(rev*10)+l;
            n=n/10;
        }
        return rev;
    }
}
