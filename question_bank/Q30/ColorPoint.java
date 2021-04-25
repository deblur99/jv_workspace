class ColorPoint extends Point {
    public String color;
    
    ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public void setXY(int x, int y) {
        move(x, y);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return (color+" color on "+"("+Integer.toString(getX())+", "+Integer.toString(getY())+")");
    }
}