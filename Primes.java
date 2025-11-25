public class Primes {
    public static void main(String[] args) {
      final int n = Integer.parseInt(args[0]);
      System.out.println("Prime numbers up to " + n + ":");
      boolean[] isPrime = new boolean[n + 1];
      for (int i = 2; i <= n; i++) {
        isPrime[i] = true;
        }
    for (int p = 2; p <= Math.sqrt(n); p++) {
        if (isPrime[p] == true) {
          for (int i = p + p; i <= n; i = i + p) {
                isPrime[i] = false; 
            }    
        }
    }
    int count = 0;
    for (int i = 2; i <= n; i++) {
         if (isPrime[i] == true) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("There are " + count + " primes between 2 and " + n + 
        " (" + (int)((double)count / n * 100) + "% are primes)");
}
}