public class intcentinal {
    public static void main(String[] args) {
        System.out.println("  --prime numbers-- : ");
        int count = 0;
        int primeNumber = 2;

        while (count <= 50) {
            boolean isPrime = true;
            for (int i = 2; i < primeNumber; i++) {
                if (primeNumber % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                System.out.print(primeNumber + "\t");

                if (count % 10 == 0) {
                    System.out.println();
                }
            }

            primeNumber++;
        }


    }
}


