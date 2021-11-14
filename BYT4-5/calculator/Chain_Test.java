public class Chain_Test {
    public static int result = 0;
    static Numbers req = null;

    public static void main(String[] args) {
        Chain chainCalc1= new Add_Numbers();
        Chain chainCalc2= new Subtract_Numbers();
        Chain chainCalc3= new Multiply_Numbers();
        Chain chainCalc4= new Divide_Numbers();

        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);

        Numbers request = new Numbers(8, 2, "/");

        chainCalc1.calculate(request);
    }

}