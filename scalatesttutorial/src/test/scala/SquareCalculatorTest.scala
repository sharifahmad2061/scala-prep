class SquareCalculatorTest extends org.scalatest.FunSuite{
    test("SquareCalculator.square"){
        assert(SquareCalculator.square(3) === 9)
    }
}