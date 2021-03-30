package Test5;

import java.util.Scanner;

public class PrimeGenerator {

    public static void main(String[] args) {

        isPrime();
    }

    public static void isPrime() throws NullPointerException {

        Scanner scanner = new Scanner(System.in);
        StringBuilder lineWithNumbers = new StringBuilder();

        //how many times you want to write find prime (between 1 and 1000000000)
        int x = scanner.nextInt();
        scanner.nextLine();

        if (x <= 10) {
            for (int i = 0; i < x; i++) {

                //two numbers between you want find separate by space

                lineWithNumbers.append(" ");
                lineWithNumbers.append(scanner.nextLine());

            }

            String[] prime2 = lineWithNumbers.toString().split(" ");

            for (int i = 1; i < (prime2.length - 1); i++) {
                int m = Integer.parseInt(prime2[i]);
                int n = Integer.parseInt(prime2[i + 1]);
                if (m >= 1 && m <= n && n <= 1000000000 && n - m <= 100000) {

                    for (int j = m; j <= n; j++) {
                        if ( j >= m && j <= n) {

                            // finding 10 first primes
                            
                        if (j == 2 || j == 3 || j == 5 || j == 7) {

                            System.out.println(j);

                        } else if (j != 1 && j % 2 != 0 && j % 3 != 0 && j % 5 != 0 && j % 7 != 0) {

                            System.out.println(j);

                        }
                    }
                    }

                    System.out.println();
                }
            }
        }
    }

}
