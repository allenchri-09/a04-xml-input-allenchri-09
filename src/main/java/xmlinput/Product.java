package xmlinput;

public abstract class Product {

    // From previous assignment
    private String productName;
    private String ISBN;
    private double unitPrice;

    // A constructor method that initializes the product name, ISBN number, and unit price
    public Product(String productName, String ISBN, double unitPrice) {
        this.productName = productName;
        this.ISBN = ISBN;
        this.unitPrice = unitPrice;
    }

    // getProductName() - Returns a String that is the name of the product
    public String getProductName() {
        return productName;
    }

    // getIsbn() - Returns a String representing the ISBN (barcode) number
    public String getIsbn() {
        return ISBN;
    }

    // getUnitPrice() - Returns a possible decimal value indicating the unit price for each product
    public double getUnitPrice() {
        return unitPrice;
    }


    // Add an abstract method called values()
    public abstract String values() {
        return productName + "," + ISBN + "," + unitPrice;


    }
}