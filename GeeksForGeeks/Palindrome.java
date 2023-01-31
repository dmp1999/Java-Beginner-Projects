/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
    static int digitSum(int n) {
        
        int sum = 0;
        
        while (n > 0) {
            sum += n%10;
            n = n/10;
        }
        
        return sum;
        
    }
    
    static boolean isPalindrome(int n) {
        
        int divisor = 1;
        
        while (n/divisor >= 10) {
            divisor *=10;
        }
        
        while (n!=0) {
            
            int l = n%10;
            int f = n/divisor;
            
            if(l != f)
                return false;
            
            n = (n % divisor)/10;
            
            divisor /= 100;
            }
        return true;
    }
        
    static boolean isSumPalindrome(int n) {
        int sum = digitSum(n);
        boolean temp = isPalindrome(sum);
        if(temp)
            return true;
        return false;
            
    }
    
	public static void main (String[] args) {
	    int n = 56;
		if(isSumPalindrome(n))
	        System.out.println("Yes");
	    else System.out.println("No");
	}
}