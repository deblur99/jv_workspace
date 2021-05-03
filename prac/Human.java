public class Human {
    public int age;
    public String name;
    public char bloodType;
    private String ID;
    
    public Human(int age, String name, char bloodType, String ID) {
        this.age = age;
        this.name = name;
        this.bloodType = bloodType;
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }
}
