package COW4;

public class Looper
{
    public void countUpTo10(Intake feed) {
        int i = 1;
        while (i <= 10) {
            feed.give(i);
            i++;
        }
    }

    public void countDownFrom10(Intake feed) {
        int i = 10;
        while (i >= 1) {
            feed.give(i);
            i--;
        }
    }

    public void countUpToX(Intake feed, int x) {
        int i = 1;
        while (i <= x) {
            feed.give(i);
            i++;
        }
    }

    public void countDownFromX(Intake feed, int x) {
        while (x >= 1) {
            feed.give(x);
            x--;
        }
    }

    public void countUpToXfromYbyA(Intake feed, int x, int y, int a) {
        while (y <= x) {
            feed.give(y);
            y += a;
        }
    }

    public void countDownFromXtoYbyA(Intake feed, int x, int y, int a) {
        while (x >= y) {
            feed.give(x);
            x -= a;
        }
    }

    public void runSequence1(Intake feed, int stop) {
        int n = 1;
        while (n <= stop) {
            feed.give(n);
            n = n * 2 + 1;
        }
    }

    public void runSequence2(Intake feed, int stop) {
        int n = 1;
        while (n <= stop) {
            feed.give(n);
            n = n * 2 + 2;
        }
    }

    public void runSequence4(Intake feed, int n) {
        int count = 0;
        while (count < n) {
            if (count % 2 == 0) {
                feed.give(1);
            } else {
                feed.give(-1);
            }
            count++;
        }
    }

    public void runSequence5(Intake feed, int n) {
        int count = 0;
        int value = 1;
        while (count < n) {
            feed.give(value);
            value *= -10;
            count++;
        }
    }
    
    public void runSequence7(Intake feed, int stop){
        
    }
    
    public void runSequence8(Intake feed, int n){
        
    }
}
