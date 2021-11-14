public class Numbers {

    private int number1;
    private int number2;
    private String operation;

    public Numbers(int NewNumber1, int NewNumber2, String NewOperation) {

       number1= NewNumber1;
       number2= NewNumber2;
       operation= NewOperation;
    }

    public String getOperation() {
        return operation;
    }

    public int getNumber2() {
        return number2;
    }

    public int getNumber1() {
        return number1;
    }

}