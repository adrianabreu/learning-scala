import Factorial.TailRecursiveFactorial

class TailRecursiveFactorialTests extends org.scalatest.FunSuite {
  test("RecursiveFactorial base case is cover") {
    assert(TailRecursiveFactorial.Calculate(0) === 1)
  }

  test("Factorial works properly") {
    assert(TailRecursiveFactorial.Calculate(3) === 6)
  }
}
