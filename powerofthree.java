class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {  //base case 
            return false;
        }
        while(n>=3){
            if(n%3 != 0){ 
                return false;
            }else{
                n = n/3;
            }
        }
        return n==1;
    }
}
