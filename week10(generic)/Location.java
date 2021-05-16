public class Location {
    public String city;
    public double latitude;
    public double longitude;

    public Location(String city, double latitude, double longitude) {
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    
    public void printAll() {
        System.out.println(city+"\t"+latitude+"\t"+longitude);
    }

    public boolean processQuery(String name) {
        if (city.equals(name)) {
            System.out.println(name+"\t"+latitude+"\t"+longitude);
            return true;
        }
        else
            return false;
    }
}
