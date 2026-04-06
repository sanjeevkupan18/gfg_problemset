class Solution {
    static boolean isPrime(int n) {
        // code here
        if(n==0 || n==1){
            return false;
        }
        boolean isprime = true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                isprime = false;
                break;
            }
        }
        if(isprime){
            return true;
        }
        else{
            return false;
        }
    }
}