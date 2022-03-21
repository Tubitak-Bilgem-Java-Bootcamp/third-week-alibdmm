package PaticaStore;

public class Product {
    private int Id;
    private double price;
    private int rateOfDiscount;
    private int stock;
    private String productName;
    private Brand brand;

    public Product(int Id, double price, int rateOfDiscount, int stock, String productName,
                   Brand brand) {
        this.Id = Id;
        this.price = price;
        this.rateOfDiscount = rateOfDiscount;
        this.stock = stock;
        this.productName = productName;
        this.brand = brand;
    }

    public Product() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRateOfDiscount() {
        return rateOfDiscount;
    }

    public void setRateOfDiscount(int rateOfDiscount) {
        this.rateOfDiscount = rateOfDiscount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
