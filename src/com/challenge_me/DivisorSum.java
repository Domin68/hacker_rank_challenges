package com.challenge_me;
interface AdvancedArithmetic{
    int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic{
    /*
    * overwritten method to sum all divisors*/
    @Override
    public int divisor_sum(int n) {
        int x;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i == 0){
                x = i;
                sum += x;
            }
        }
        return sum;
    }
}

public class DivisorSum {
    public static void main(String[] args) {

    }
}
