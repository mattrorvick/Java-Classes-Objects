public class Pets {
    

    // Variables
    private String name;

    private int age;

    private String location;

    private String type;




    // Constructors

    public Pets(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }

    public Pets() {
        this.name = "";
        this.age = 0;
        this.type = "";
    }

    // Methods

    //get methods

    public void getPetsName() {
        System.out.println("My pet's name is " + name + ".");
    }

    public void getPetsAgeInPetYears() {
        System.out.println("Their age in pet years is " + age + ".");
    }

    public void getPetAnimalType() {
        System.out.println("This pet is a " + type + ".");
    }


    //set methods

    public void changeName(String PetNameChange) {
        System.out.println("I changed one of my pet's names to " + PetNameChange + ".");
        this.name = PetNameChange;
    }

    public void changeAge(int PetAgeChange) {
        System.out.println("They are now " + PetAgeChange + " years old in animal years.");
        this.age = PetAgeChange;
    }

    public void changeLocation(String LocationChange) {
        System.out.println("I rescued them at the " + LocationChange + ".");
        this.location = LocationChange;
    }






}