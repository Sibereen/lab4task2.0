// Car class representing the car entity
class Car {
    // 1. Private fields
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;

    // 2. Constructor consisting of all fields
    public Car(String model, String brand, int year, double price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    // 3. Getter methods
    public String getModel() { return model; }
    public String getBrand() { return brand; }
    public int getYear() { return year; }
    public double getPrice() { return price; }
    public String getColor() { return color; }
    public int getQuantity() { return quantity; }

    // 3. Setter methods
    public void setModel(String model) { this.model = model; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setYear(int year) { this.year = year; }
    public void setPrice(double price) { this.price = price; }
    public void setColor(String color) { this.color = color; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    // 4. Delivery and Sell methods
    public void delivery(int amount) {
        quantity += amount;
        System.out.println("Delivery processed: +" + amount + " cars.");
    }

    public void sell(int amount) {
        if (quantity >= amount) {
            quantity -= amount;
            System.out.println("Sale processed: -" + amount + " cars.");
        } else {
            System.out.println("Error: Not enough stock to sell!");
        }
    }

    // 5. toString() method returning a String with field names and states
    @Override
    public String toString() {
        return "Car Details ---> " +
                "Brand: " + brand +
                ", Model: " + model +
                ", Year: " + year +
                ", Price: $" + price +
                ", Color: " + color +
                ", Quantity: " + quantity;
    }
}

// Main class to execute and test the functionality
public class Main {
    public static void main(String[] args) {
        // - We create an object of the Car class by using the constructor
        Car myCar = new Car("Model S", "Tesla", 2023, 79999.99, "Black", 5);

        // - We call and print what the toString() method passes
        System.out.println("Initial Car State:");
        System.out.println(myCar.toString());
        System.out.println("--------------------------------------------------");

        // - We call the sell() method
        myCar.sell(2);

        // - We print all fields using the previously declared "get" methods
        System.out.println("\nChecking fields after sale using Getters:");
        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Price: $" + myCar.getPrice());
        System.out.println("Color: " + myCar.getColor());
        System.out.println("Quantity: " + myCar.getQuantity());
        System.out.println("--------------------------------------------------");

        // - Using the "set" methods we change some fields of the object
        myCar.setPrice(74999.50);
        myCar.setColor("Pearl White");

        // - We call and print again toString() method to notice the changes
        System.out.println("\nCar State After Using Setters (Price & Color update):");
        System.out.println(myCar.toString());
    }
}