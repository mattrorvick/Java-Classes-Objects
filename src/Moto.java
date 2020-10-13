public class Moto {

    // variables
    
    private String color;

    private int engineSize;

    private boolean fast;

    // constructors

    public Moto() {
        this.engineSize = 883;
    }

    public Moto(String color, int engineSize, boolean fast) {
        this.color = color;
        this.engineSize = engineSize;
        this.fast = fast;
    }

    public Moto(String color, int engineSize) {
        this.color = color;
        this.engineSize = engineSize;
    }


    //get methods

    public void getColor() {
        System.out.println("This motorcycle is the color " + color + ".");
    }

    public void getEngineSize() {
        System.out.println("This motorycle engine is " + engineSize + " cubic centimeters.");
    }

    public void getBoolean() {
        System.out.println("Is the bike fast? True or false?\n" + fast);
    }

    //set methods

    public void changeColor(String MotoColorChange) {
        System.out.println("The color changes from " + color + " to " + MotoColorChange + ".");
        this.color = MotoColorChange;
    }

    public void changeSize(int EngineSizeChange) {
        System.out.println("Increasing engine output to " + EngineSizeChange + " cubic centimeters.");
        this.engineSize = EngineSizeChange;
    }

    public void changeBoolean(boolean NotFast) {
        System.out.println("Is the new upgrade slower?\n" + NotFast);
        this.fast = NotFast;
    }












}