
package Factorial

object RecursiveFactorial {
  def Calculate(n: Int): Int = {
      if (n == 0) 1
      else n * Calculate(n - 1)
  }
}