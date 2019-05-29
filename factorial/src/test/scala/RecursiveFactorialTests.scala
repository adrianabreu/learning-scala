import Factorial.RecursiveFactorial

class RecursiveFactorialTests extends org.scalatest.FunSuite {
  test("RecursiveFactorial base case is cover") {
    assert(RecursiveFactorial.Calculate(0) === 1)
  }

  test("Factorial works properly") {
    assert(RecursiveFactorial.Calculate(3) === 6)
  }
}
