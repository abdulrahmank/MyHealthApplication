package abdulrahmank.com.myhealthapplication;

import android.graphics.Color;

public enum Calorie {
    BELOW_500(Color.YELLOW),
    ABOVE_500(Color.RED),
    ABOVE_600(Color.BLUE),
    ABOVE_700(Color.BLUE);


    private int value;
    private int color;

    Calorie(int color) {
        this.color = color;
    }

    public Calorie setValue(int value) {
        this.value = value;
        return this;
    }

    public int getValue() {
        return value;
    }

    public int getColor() {
        return color;
    }

    static Calorie createCalroieEnumFor(int value) throws RuntimeException {
        if (value < 500) {
            return BELOW_500.setValue(value);
        } else if (value > 500 && value < 600) {
            return ABOVE_500.setValue(value);
        } else if (value > 600 && value < 700) {
            return ABOVE_600.setValue(value);
        } else if (value > 700) {
            return ABOVE_700.setValue(value);
        }
        throw new RuntimeException("Unknown calorie value");
    }
}
