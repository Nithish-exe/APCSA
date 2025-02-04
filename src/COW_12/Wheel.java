package COW_12;

public class Wheel {
    private int result;


    public Wheel() {
        result = -1;
    }

    public void spin() {
        result = (int) (Math.random() * 37);
    }

    public boolean isEven() {
        if (result == 0) {
            return false;
        } else {
            return (result % 2 == 0);
        }
    }


    public boolean isOdd() {
        if (result == 0) {
            return false;
        } else {
            return !(result % 2 == 0);
        }
    }


    public int whichThird() {
        if (result == 0) {
            return 0;
        } else if (result < 13) {
            return 1;
        } else if (result < 25) {
            return 2;
        } else {
            return 3;
        }
    }


    public int getResult() {
        return result;
    }

    public void setResult(int val) {
        result = val;
    }
}
