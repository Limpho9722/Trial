public class Calculator extends ClassAbstract {


    public Calculator(int n1, int n2) {
        super(n1, n2);
    }

    @Override
    public int calculate(int a, int b) {
        return (a+b+number1)*number2;
    }
}
