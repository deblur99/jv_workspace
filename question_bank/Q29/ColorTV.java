public class ColorTV extends TV {
    public int colors;
    
    public ColorTV(int size, int colors) {
        super(size);
        this.colors = colors;
    }

    public void printProperty() {
        System.out.println(getSize()+" inches, "+colors+" colors");
    }
}