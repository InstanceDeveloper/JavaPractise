package com.oop;

class Recursion {
	public void recurserPrint(int n) {
		if (n != 1) {
			System.out.println(n);
			recurserPrint(n - 1);
		} else {
			System.out.println(1);
		}
	}
}

class RecursionReverse {
	int num = 1;

	public void recurseReverse(int n) {
		if (num <= n) {
			System.out.println(num);
			num++;
			recurseReverse(n);
		}
	}
}

class RecursionSum {
	int sum = 0;

	public int recurseSum(int n) {
		if (n != 1) {
			sum = n + recurseSum(n - 1);
			return sum;
		} else {
			return sum + 1;
		}
	}
}


class RecursionFib {
	int f , fd = 0, sd = 1;
	public void recurseFib(int n) {
		if (n != 0) {
			f = fd + sd;
			fd = sd;
			sd = f;
			System.out.println(f+"    ");
			recurseFib(n-1);
		}
	} 
}



/*
 * class Recursion { public int recursePrint(int n) { int num; if (n != 1) { num
 * = 1*recursePrint(n-1); return num; } else { return 1; } } }
 * 
 * class RecursionFact { public int fact(int n) { int f = 1; if (n != 0) { f = n
 * * fact(n - 1); return f; } else { return f * 1; } } }
 */

public class MethodRecursionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Recursion r1 = new Recursion();
		r1.recurserPrint(5);

		RecursionReverse r2 = new RecursionReverse();
		r2.recurseReverse(5);

		RecursionSum r3 = new RecursionSum();
		int result = r3.recurseSum(5);
		System.out.println(result);
		
		RecursionFib r4 = new RecursionFib();
		r4.recurseFib(5);
	}

}
