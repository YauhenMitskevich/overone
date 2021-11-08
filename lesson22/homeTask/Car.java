package lesson22.homeTask;

import java.util.Scanner;

public abstract class Car {
    Scanner scanner = new Scanner(System.in);


    @Override
    public String toString() {

        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hpPower=" + hpPower +
                ", engineVol=" + engineVol +
                '}';
    }

    public String brand;
    public String model;
    public int year;
    public int hpPower;
    public double engineVol;

    public Car(String brand, String model, int year, int hpPower, double engineVol) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.hpPower = hpPower;
        this.engineVol = engineVol;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHpPower() {
        return hpPower;
    }

    public void setHpPower(int hpPower) {
        this.hpPower = hpPower;
    }

    public double getEngineVol() {
        return engineVol;
    }

    public void setEngineVol(double engineVol) {
        this.engineVol = engineVol;
    }
}
