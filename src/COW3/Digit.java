package COW3;

import java.awt.*;

class Digit {
    private int value;

    public Digit(int value) {
        this.value = value;
    }

    public int getValue() { return value; }
    public void setValue(int nextValue) { this.value = nextValue; }

    public void increment() { value = (value + 1) % 10; }
    public void decrement() { value = (value - 1 + 10) % 10; }

    public boolean equals(Digit otherDigit) {
        return this.value == otherDigit.getValue();
    }

    public int compareTo(Digit otherDigit) {
        return Integer.compare(this.value, otherDigit.getValue());
    }
}
