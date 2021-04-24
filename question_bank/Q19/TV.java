public class TV {
    public String brand;
    public int year;
    public int inch;

    // this: 클래스의 속성을 가리킬 때 사용하는 키워드
    public TV(String myBrand, int myYear, int myInch) {
        brand = myBrand;
        year = myYear;
        inch = myInch;
    }

    public void show() {
        System.out.println("My TV is "+inch+" inches manufactured by "+brand+" in "+year+".");
    }

    public static void main(String[] args) {
        TV myTV = new TV("LG", 2021, 85);
        myTV.show();
    }
}