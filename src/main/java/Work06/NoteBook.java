package Work06;

public class NoteBook {
    int price;
    String model;
    String brand;
    int year;

    public NoteBook(int price, String model, String brand, int year) {
        this.price = price;
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

}
