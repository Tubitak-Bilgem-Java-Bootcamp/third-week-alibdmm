package PaticaStore;

public class NoteBook extends Product{

    private int RAM = 6;

    private int memory = 512;

    private double screenSize = 14;

    public NoteBook(int ıd, double price, int rateOfDiscount, int stock, String productName,
    Brand brand, int memory, double screenSize,int RAM) {
        super(ıd, price, rateOfDiscount, stock, productName, brand);
        this.RAM = RAM;
        this.memory = memory;
        this.screenSize =screenSize;
    }

    public NoteBook(int ıd, double price, int rateOfDiscount, int stock, String productName, Brand brand) {
        super(ıd, price, rateOfDiscount, stock, productName, brand);
    }

    public NoteBook() {

    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}
