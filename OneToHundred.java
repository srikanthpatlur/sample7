public class OneToHundred {
     // Corrected class name to OneToHundred
        public static void main(String[] args) {
            for (int i = 1; i <= 100; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        }
    
        // Method to check if a number is prime
        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    
    

