public class Song {
    public String title;
    public String artist;
    public String country;
    public int year;

    // 생성자로 초기화 시 속성별로 명시해야 한다.
    // ex) this(속성1, 속성2, ...) -> X
    public Song() {
        title = "";
        artist = "";
        country = "";
        year = 0;
    }

    public Song(String title, String artist, String country, int year) {
        this.title = title;
        this.artist = artist;
        this.country = country;
        this.year = year;
    }

    public void show() {
        System.out.println(title+" by "+artist+" from "+country+", "+year);
    }

    public static void main(String[] args) {
        Song bts = new Song("Dynamite", "BTS", "Korea", 2021);
        bts.show();
    }
}