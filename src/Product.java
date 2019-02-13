import java.text.DecimalFormat;
import java.text.NumberFormat;

public abstract class Product {

    private String code;
    private String description;
    private double price;
    protected static int count = 0; // a protected static variable

    public Product() {
        code = "";
        description = "";
        price = 0;
    }

    // Get and set accessors for the code, description, and price instance variables
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "Code:               " + code + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice() + "\n";
    }

    /* Create an override of the equals class for the superclass, and Book and Software subclasses.*/
    @Override
    public boolean equals(Object p){
        Product prod = (Product) p;
        if (this.getDescription().equalsIgnoreCase(prod.getDescription())){
            return true;
        } else {
            return false;
        }
    }

    private String getFormattedPrice() {
        // Use the NumberFormat class to format the price to 2 decimal places
        NumberFormat formatter = new DecimalFormat("#0.00");
        return formatter.format(price);
    }

    // Create public access for the count variable
    public static int getCount() {
        return count;
    }
}