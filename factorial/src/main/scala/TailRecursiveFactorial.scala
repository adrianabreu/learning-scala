
package Factorial

object TailRecursiveFactorial {
  def Calculate(n: Int): Int = {
      def aux(n: Int, acc: Int): Int = {
        if (n == 0) acc
        else aux(n - 1, acc * n)
      }
      aux(n, 1)
  }
}