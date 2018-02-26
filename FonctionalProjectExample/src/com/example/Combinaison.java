package com.example;

public class Combinaison {

	/***
	 * A==>0 AB==> 1 = 1 ABC==>2+1 = 3 ABCD==>3+2+1 = 6 ABCDE==>4+3+2+1 = 10
	 * ABCDEF==> 5 +4 +3 +2+1 = 15
	 * 
	 * nombreCombinaison = n-1 + n-2 + n-3
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 **/

	public static int find(int n) {

		int combinaison = 0;
		if (n <= 1) {
			return 0;
		}		
		else {

			for (int i = 1; i < n; i++) {
				combinaison = combinaison + i;
			}

		}

		return combinaison;
	}

	public static int find2(int n) {

		int combinaison = 0;
		if (n <= 1) {
			return 0;
		}
		if (n == 2) {
			return 1;
		}

		if (n > 2) {

			
				combinaison = combinaison + n-1 ;
			

		}

		return combinaison;
	}

	public static void main(String[] args) {

		System.out.println(find(2));
	}

}
