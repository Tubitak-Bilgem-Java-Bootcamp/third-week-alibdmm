package PaticaStore;

import java.util.Random;

public class MobilePhone extends Product{
    private String color = getColor();

    private int memory = 64;

    private double screenSize = 6.1;

    private int battery = 4000;

    private int RAM = 6;

    public MobilePhone(){

    }
    public MobilePhone(int Id, double price, int rateOfDiscount, int stock, String productName,
                       Brand brand, int memory, double screenSize, int battery, int RAM, String color) {
        super(Id, price, rateOfDiscount, stock, productName, brand);
        this.color = color;
        this.memory = memory;
        this.screenSize = screenSize;
        this.battery =battery;
        this.RAM = RAM;
    }

    public MobilePhone(int Id, double price, int rateOfDiscount, int stock, String productName,Brand brand) {
        super(Id, price, rateOfDiscount, stock, productName, brand);
    }

    public String getRandomColor(){
        Random r = new Random();
        int i = r.nextInt(3);
        switch (i){
            case 1:
                return "Kırmız";
            case 2:
                return "MAvi";
            default:
                return "Siyah";
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
}
