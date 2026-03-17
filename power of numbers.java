class Solution {
    public int reverseExponentiation(int n) {  
        int temp=n;
        int rev=0;
        while(temp>0){
            int l=temp%10;
            rev=(rev*10)+l;
            temp=temp/10;
        }
        int result=1;
        for(int i=0;i<rev;i++){
            result=result*n;
        }
        return result;
    }
}
