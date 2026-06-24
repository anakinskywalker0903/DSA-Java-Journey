class Solution {
    public void printNumbers(int n) {
        if( n < 1 ){
            return  ;
        }
        System.out.println(n);

        printNumbers(n-1);
    }
}