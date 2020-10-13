public class Calculator {
    
    private int num1;

    private int num2;


// constructors

    

    public Calculator(int num1, int num2) {

        this.num1 = num1;

        this.num2 = num2;

    }

    public Calculator(int num1) {
        this.num1 = num1;
    }

// methods

    public void getAddition() {
        System.out.println(num1 + num2);
    }

    public void getSubtraction() {
        System.out.println(num1 - num2);
    }
    
    public void getMultiply() {
        System.out.println(num1 * num2);
    }

    public void getDivide() {
        System.out.println(num1 / num2);
    }

    public void getSquare() {
        System.out.println(num1 * num1);
    }

    public void getSquareRoot() {
        System.out.println(Math.sqrt(num1));
    }

    // public void getSin() {
    //     System.out.println(Math.sin);
    // }
    





}