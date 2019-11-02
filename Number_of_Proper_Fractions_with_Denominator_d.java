
//public class ProperFractions {
//  public static long properFractions(long n) {
//    if (n == 1)
//      return 0;
//    long r = n;
//    for (long d = 2; d * d <= n; d++)
//      if (n % d < 1) {
//        while (n % d < 1)
//          n /= d;
//        r -= r / d;
//      }
//    if (n > 1)
//      r -= r / n;
//    return r;
//  }
//}

public class Number_of_Proper_Fractions_with_Denominator_d {

  public static void main(String[] args) {
    System.out.println(properFractions(20));
  }

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

