public class HumanApp {
    public static void main(String[] args) {
        int myAge = 35;
        String myNam = "Baek Ga-young";
        char myBloodType = 'A';     
        String myID = "871026-2xxxxxx";
        String myJob = "Singer";
        int myDebutYear = 2013;
        String myMBTI = "INFP";

        Gayoung GY = new Gayoung(myAge, myNam, myBloodType, myID, myJob, myDebutYear, myMBTI);

        GY.getInfo();
    }
}
