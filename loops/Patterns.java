package com.loops;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

class PatternsAccending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}
}

/*
 1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5*/

class PatternsDeccending {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 6-i ; j++) {
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}
}

/* 
 1 2 3 4 5
 1 2 3 4
 1 2 3
 1 2
 1 */

class PatternsDeccendingInc  {
	public static void main(String[] args) {
		for (int i = 1; i<= 5 ; i++) {
			for (int j = i;j <= 5; j++) {
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}
}
/*
 1 2 3 4 5
 2 3 4 5
 3 4 5
 4 5
 5
 */
class PatternsDeccendingDec {
	public static void main(String[] args) {
		for (int i = 1;i <= 5; i++ ) {
			for (int j = 6-i; j >= 1; j--) {
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}
}
/*
 5 4 3 2 1
 4 3 2 1
 3 2 1
 2 1
 1
 */
class PatternsDeccendingDecCase1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}
}
/*
 5 4 3 2 1
 5 4 3 2
 5 4 3
 5 4
 5
 */

class PatternsCase1{
	public static void main(String[] args) {
		for (int i = 5; i >= 1 ; i--) {
			for (int j = i; j <=  5; j++) {
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}
}

/*
 5
 4 5
 3 4 5
 2 3 4 5
 1 2 3 4 5
*/

class PatternsCase3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}
}
/*
 1
 2 1
 3 2 1
 4 3 2 1
 5 4 3 2 1
*/

class PatternsCase4 {
	public static void main(String[] args) {
		for (int i = 5; i >= 1 ; i--) {
			for (int j = 5; j >= i ; j--) {
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}
}
/*
 5
 5 4
 5 4 3
 5 4 3 2
 5 4 3 2 1
 */

class PatternsCase5 {
	public static void main(String[] args) {
		for(int i = 1; i<= 5; i++) {
			for (int j=1; j<= i; j++) {
				System.out.print(" "+i);
			}
			System.out.println();
		}
	}
}

/*
 1
 2 2
 3 3 3
 4 4 4 4
 5 5 5 5 5
 */

class PatternCase6 {
	public static void main(String[] args) {
		for (int i = 5;i>= 1; i--) {
			for (int j = i;j <= 5; j++ ) {
				System.out.print(" "+i);
			}
			System.out.println();
		}
	}
}

/*
 5
 4 4
 3 3 3
 2 2 2 2
 1 1 1 1 1
 */

class PatternCase7 {
	public static void main(String[] args) {
		for (int i = 5; i >=1 ; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(" "+i);
			}
			System.out.println();
		}
	}
}

/*
 5 5 5 5 5
 4 4 4 4
 3 3 3
 2 2
 1 
 */

class PatternCase8{
	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {
			for (int j=i; j<=5; j++ ) {
				System.out.print(" "+i);
			}
			System.out.println();
		}
	}
}
/*
 1 1 1 1 1
 2 2 2 2
 3 3 3
 4 4
 5 
*/

class PatternCase9 {
	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			if (i%2 == 1) {
				for (int j=1;j<=6-i;j++) {
					System.out.print(" "+j);
				}
				System.out.println();
			} else {
				for (int j=6-i;j>=1;j--) {
					System.out.print(" "+j);
				}
				System.out.println();
			}
		}
	}
}

/*
 1 2 3 4 5
 4 3 2 1
 1 2 3
 2 1
 1
 */

class PatternCase10 {
	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			if (i%2 == 1) {
				for (int j = 1; j <= 8-i; j++) {
					System.out.print(" "+j);
				}
				System.out.println();
			}
		}
	}
}


/*
 1 2 3 4 5 6 7
 1 2 3 4 5
 1 2 3
 1
 */

class PatternCase11 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if (j%2 == 1) {
					System.out.print(" "+1);
				} else {
					System.out.print(" "+0);
				}
			}
			System.out.println();
		}
	}
}


/*
 1
 1 0
 1 0 1
 1 0 1 0
 1 0 1 0 1
*/

class PatternCase12 {
	public static void main(String[] args) {
		for (int i = 5; i >= 2; i--) {
			for (int j = i; j >= 2; j--) {
				if (j%2 == 1) {
					System.out.print(" "+1);
				} else {
					System.out.print(" "+0);
				}
			}
			System.out.println();
		}
	}
}

/*
 1 0 1 0
 0 1 0
 1 0
 0
 */
class PatternCase13 {
	public static void main(String[] args) {
		for (int i = 5; i >= 2; i--) {
			for (int j = i; j <= 5; j++) {
				if (j%2 == 1) {
					System.out.print(" "+1);
				} else {
					System.out.print(" "+0);
				}
			}
			System.out.println();
		}
	}
}


/*
 1
 0 1
 1 0 1
 0 1 0 1
 */

class PatternCase14 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = i; j <= 9; j++) {
				if (i%2 == 1 && j%2 == 1) {
					System.out.print(" "+j);
				}
			}System.out.println();
		}
	}
}

/*
 1 3 5 7 9

 3 5 7 9

 5 7 9

 7 9

 9
 */

class PatternCase15 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			if (i%2 == 1) {
				for (int j = 1; j <= i; j++) {	
					if (j%2 == 1) {
						System.out.print(" "+j);
						}
					}
				System.out.println();
				} 		
				else {
				for (int j = 1; j <= i; j++) {	
					if (j%2 == 0) {
						System.out.print(" "+j);
						}
					}
				System.out.println();
				}
		}
	}
}

/*
 1
 2
 1 3
 2 4
 1 3 5
 2 4 6
 1 3 5 7
 2 4 6 8
 1 3 5 7 9
 */

class PatternCase16 {
	public static void main(String[] args) {
		for (int i = 5;i >= 1;i--) {
			for (int j = i; j <= 5; j++) {
				System.out.print(" "+j);
			}
			for (int k = 1; k < i; k++) {
				System.out.print(" "+5);
			}
			System.out.println();
		}
		
	}
}
/*
 5 5 5 5 5
 4 5 5 5 5
 3 4 5 5 5
 2 3 4 5 5
 1 2 3 4 5
 */

class PatternCase17 {
	public static void main(String[] args) {
		int k = 1;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" "+k);
				k++;
			}
			System.out.println();
		}
	}
}
/*
 1
 2 3
 4 5 6
 7 8 9 10
 */

class PatternCase18 {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			int k = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(" "+k);
				k += 5-j;
			}
			System.out.println();
		}
	}
}

/*
 1
 2 6
 3 7 10
 4 8 11 13
 5 9 12 14 15
*/

class PatternCase19 {
	public static void main(String[] args) {
		for (int i = 1; i <= 7; i++) {
			if (i%2 == 1) {
				for (int j = 1; j <= i ; j++) {
					System.out.print(" "+j);
				}
				System.out.println();
			}
		}
	}
}

/*
 1
 1 2 3
 1 2 3 4 5
 1 2 3 4 5 6 7 
 */

class PatternCase20 {
	public static void main(String args[]) {
	     for(int i=5;i>1;i--){
		        for(int j=1;j<i;j++){
		            System.out.print(j);
		           }
		        for(int j=5;j>i;j--){
		        		System.out.print("*");
		           }
		        for(int j=5;j>i;j--){
		        		System.out.print("*");
		           }
		        for(int j=i-1;j>=1;j--){
		        		System.out.print(j);
		           }
	           System.out.println();
		       }
	    }
}

/*
12344321
123**321
12****21
1******1
*/

class PatternCase20_1 {
	public static void main(String args[]) {
	     for(int i=5;i>1;i--){
		        for(int j=1;j<i;j++){
		            System.out.print(j);
		           }
		        for(int j=9;j>2*i-1;j--){
		        		System.out.print("*");
		           }
		        for(int j=i-1;j>=1;j--){
		        		System.out.print(j);
		           }
	           System.out.println();
		       }
	    }
}

/*
12344321
123**321
12****21
1******1
 */

class PatternCase21{
	public static void main(String[] args) {
		int n = 1;
		for (int i=3;i>=1;i--) {
			for (int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for (int k = 6; k > 2*i-1; k--) {
				System.out.print(n);
				n++;
			}
			for(int j=i;j>=1;j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}

/*
   1   
  234  
 56789
*/
class PatternCase23{
	public static void main(String args[]){
		for(int i=1;i<=5;i++){
			for(int j=5;j>i;j--){
				System.out.print(j);
				}
			System.out.print("*");
			for(int j=i-1;j>0;j--) {
				System.out.print(j);
			}
			System.out.println();
			}
		
		}
	}

/*
5432*
543*1
54*21
5*321
*4321
*/

class PatternCase24{
	public static void main(String args[]){
		for(int i=1;i<=5;i++){
			for(int j=i;j>=1;j--){
				if(j==i) {
					for(int k=1;k<j;k++) {
						System.out.print(k);
					}
				}
				if(j-1 < i) {
					System.out.print(j);
				}
			}
			System.out.println();
			}
		
		}
	}

/*
1
121
12321
1234321
123454321
*/

class patternCase24_case1 {
	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int j = i-1; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
			
		}
	}
}

/*
1
121
12321
1234321
123454321
 */
class PatternCase25{
	public static void main(String args[]){
		for(int i=1;i<=5;i++){
			for(int j=i;j>=1;j--){
				System.out.print(j);
				}
		
			System.out.println();
			}
		
		}
	}

/*
1
21
321
4321
54321
*/

class PatternCase26{
	public static void main(String args[]){
		for (int i=10;i>=1;i--) {
			for (int j=i;j<=9;j++) {
				System.out.print(j);
			}
			System.out.print(0);
			for(int j=9;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		}
	}

/*
0
909
89098
7890987
678909876
56789098765
4567890987654
345678909876543
23456789098765432
1234567890987654321
 */

class PatternCase27{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int k=10-2*i;k>=1;k--) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

/*
1        1
12      21
123    321
1234  4321
1234554321
 */

class PatternCase28{
	public static void main(String args[]){
		for(int i=1;i<=5;i++){
			for (int j = i; j < 5; j++) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--){
				System.out.print(j);
				}
		
			System.out.println();
			}
		
		}
	}

/*
    1
   21
  321
 4321
54321
 */

class patternCase29 {
	public static void main(String[] args) {
		int a = 1,b=2;
		for (int i=1;i<=4;i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(a);
				a++;
			}
			for (int j = i-1; j >= 1; j--) {
				System.out.print(b);
				b++;
				
			}
			System.out.println();
			
		}
	}
}

/*
Required Output
1
232
45654
78910987
 */


class PatternCase30 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4 ; i++) {
			for (int j=i;j>=1;j--) {
				for(int k=j;k>=1;k--) {
					System.out.print(j);
					j--;
				}
			
			}
			System.out.println();
		}
	}
}


