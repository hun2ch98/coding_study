package Baekjoon.문제풀이.나머지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hayeon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        System.out.println((a + b) % c);
        System.out.println(((a%c) + (b%c)) % c);
        System.out.println((a * b) % c);
        System.out.println(((a % c) * (b % c)) % c);

        br.close();
    }
}
