package RawData;

import java.util.List;

class Tyre {
    private double[] pressure;
    private int[] age;

    Tyre(String[] input) {
        this.pressure = new double[4];
        this.age = new int[4];

        int count = -1;
        for (int i = 0; i < 4; i++) {
            pressure[i] = Double.parseDouble(input[++count]);
            age[i] = Integer.parseInt(input[++count]);
        }
    }

    public double[] getPressure() {
        return pressure;
    }
}
