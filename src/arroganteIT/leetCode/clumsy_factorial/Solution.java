package uk.leetCode.clumsy_factorial;

public class Solution {
    public static int clumsy(int n) {
        if(n<=2) return n;
        if(n<=4) return n+3;
        if(n%4 == 0) return n+1;
        if(n%4<=2) return n+2;
        else return n-1;

    }
}
