package ru.netology.statistic.JavaHome13;

public class Smartphone extends Product {
    private String name;
    private String manufacturer;

    public Smartphone(int id, String name, int price, String manufacturer) {
        super(id, price);
        this.name = name;
        this.manufacturer = manufacturer;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
