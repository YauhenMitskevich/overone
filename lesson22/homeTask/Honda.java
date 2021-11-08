package lesson22.homeTask;

public class Honda extends Car {
    public Honda(String brand, String model, int year, int hpPower, double engineVol) {
        super(brand, model, year, hpPower, engineVol);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
