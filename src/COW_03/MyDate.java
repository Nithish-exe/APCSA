package COW3;

class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() { return day; }
    public int getMonth() { return month; }
    public int getYear() { return year; }

    public String toString() {
        return month + "\\" + day + "\\" + year;
    }

    public boolean equals(MyDate otherDate) {
        return (this.day == otherDate.getDay() && this.month == otherDate.getMonth() && this.year == otherDate.getYear());
    }

    public int compareTo(MyDate otherDate) {
        if (this.year != otherDate.year) return this.year - otherDate.year;
        if (this.month != otherDate.month) return this.month - otherDate.month;
        return this.day - otherDate.day;
    }
}
