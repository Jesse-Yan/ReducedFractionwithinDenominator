
public class ReducedFractionwithinDenominator {

  public static long properFractions(long n) {

    if (n == 1) {
      return 0;
    }

    long count = n;

    for (long i = 2l; i * i <= n; i++) {
      if (n % i < 1) {
        while (n % i < 1)
          n /= i;
        count -= count/ i;
      }
    }
    if (n > 1)
      count -= count/ n;
    return count;
  }
}

