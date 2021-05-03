public class TVApp {
    public static void main(String[] args) {
        IPTV myTV = new IPTV("192.1.1.2", 82, "Netflix");
        myTV.printProperty();       
    }
}