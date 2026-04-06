// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int original = n;
        int sum=0;
        while(n>0){
            int r = n%10;
            sum+=(r*r*r);
            n=n/10;
        }
        if(original == sum){
            return true;
        }else{
            return false;
        }
    }
}