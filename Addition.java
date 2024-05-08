/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int a = 1;
        int b = 1;
        int sum = a ^ b;  // Sum without carry
        int carry = (a & b) << 1;  // Carry, if any
        
        // Adding carry until it becomes 0
        while (carry != 0) {
            int temp = sum;
            sum = sum ^ carry;
            carry = (temp & carry) << 1;
        }
        
        System.out.println(sum);  // Output: 2
	}
}
