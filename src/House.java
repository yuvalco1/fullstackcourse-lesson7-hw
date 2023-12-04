public class House {

    public final String address;

    public final double area;

    public String owner;

    public House(String address, double area, String owner) {
        this.address = address;
        this.area = area;
        this.owner = owner;
    }

    public House(String address, double area) {
        this.address = address;
        this.area = area;
    }
}
