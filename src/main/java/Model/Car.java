package Model;

import java.util.Arrays;
import java.util.List;

public class Car {
    private String model;
    private int winNumber;
    private int series;

    public Car(String model, int winNumber, int series) {
        this.model = model;
        this.winNumber = winNumber;
        this.series = series;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWinNumber() {
        return winNumber;
    }

    public void setWinNumber(int winNumber) {
        this.winNumber = winNumber;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", winNumber=" + winNumber +
                ", series=" + series +
                '}';
    }
}
