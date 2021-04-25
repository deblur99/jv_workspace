public class IPTV extends ColorTV {
    public String address;

    public IPTV(String address, int size, int colors) {
        super(size, colors);
        this.address = address;
    }

    public void printProperty() {
        System.out.println(getSize()+" inches, "+colors+" colors and IP address is "+address);
    }
}