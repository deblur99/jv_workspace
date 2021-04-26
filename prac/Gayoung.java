public class Gayoung extends Human {
    public String job;
    public int debutYear;
    public String MBTI;

    public Gayoung(int age, String name, char bloodType, String ID, String job, int debutYear, String MBTI) {
        super(age, name, bloodType, ID);
        this.job = job;
        this.debutYear = debutYear;
        this.MBTI = MBTI;
    }

    public void getInfo() {
        System.out.println("Age: "+age+", Name: "+name+", BloodType: "+bloodType+", ID: "+getID()+", Job: "+job+", DebutYear: "+debutYear+", MBTI: "+MBTI);
    }
}