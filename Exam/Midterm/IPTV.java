public class IPTV extends TV {
    String IP;
    String app;

    public IPTV(String IP, int size, String app) {
        super(size);
        this.IP = IP;
        this.app = app;
    }

    public void printProperty() {
        System.out.println("My TV is "+getSize()+" and IP address is "+IP+", supports to play "+app);
    }
}
