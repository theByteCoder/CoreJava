/**
 * @author SHUBHASISH
 *
 * Enhanced for loop java: Enhanced for loop is useful when scanning the array instead of using for loop.
 *  Syntax : for (data_type variable: array_name)
 */

class EnhancedForLoop {
  public static void main(String[] args) {
    Object primes[] = { 2, "Subhasish", 12.34, 'S', 17, true};
 
    for (Object t: primes) {
      System.out.println(t); 
    }
  }
}