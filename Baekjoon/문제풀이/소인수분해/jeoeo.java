package Baekjoon.문제풀이.소인수분해;

import java.util.Scanner;
 
public class jeoeo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        
		int N = in.nextInt();
 
		for (int i = 2; i <= Math.sqrt(N); i++) {	
			while (N % i == 0) {
				System.out.println(i);
				N /= i;
			}
		}
		if (N != 1) {
			System.out.println(N);
		}
	}
}