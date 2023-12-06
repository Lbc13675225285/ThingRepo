public class Thing {

    private String name;
    private double price;

    public Thing() {
        this.name = "A Thing";
        this.price = 99.99;
    }

    public Thing(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
