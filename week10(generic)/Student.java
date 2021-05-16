public class Student {
    public String myName;
    public String myMajor;
    public String myId;
    public double myGrade;

    public Student(String name, String major, String ID, double grade) {
        myName = name;
        myMajor = major;
        myId = ID;
        myGrade = grade;
    }

    public void printAll() {
        for (int i = 0; i < 27; i++)
            System.out.print("-");    

        System.out.println("\nName : "+myName);
        System.out.println("Major : "+myMajor);
        System.out.println("ID : "+myId);
        System.out.println("Avg. Grade : "+myGrade);

        for (int i = 0; i < 27; i++)
            System.out.print("-");
        
        System.out.println("");
    }

    public void processQuery(String name) {
        System.out.println(myName+", "+myMajor+", "+myId+", "+myGrade);
    }
}