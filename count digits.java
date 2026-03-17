class Solution {
    static int evenlyDivides(int n) {
        int count=0;
        int temp=n;
        int l=0;
        while(temp!=0){
            l=temp%10;
             temp=temp/10;
            if(l!=0&&n%l==0)
                count++;
        }
        return count;
    }
}
