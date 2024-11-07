package COW3;

class Person {
    private Name theName;
    private MyDate birthday;
    private int socialSecurityNumber;

    public Person(Name theName, MyDate birthday, int socialSecurityNumber) {
        this.theName = theName;
        this.birthday = birthday;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Name getName() { return theName; }
    public MyDate getBirthDay() { return birthday; }
    public int getSocSecNumber() { return socialSecurityNumber; }

    public String toString() {
        return "Name: " + theName.toString() + "\n" +
                "Birthday: " + birthday.toString() + "\n" +
                "Social Security Number: " + socialSecurityNumber;
    }

    public boolean equals(Person other) {
        return this.socialSecurityNumber == other.getSocSecNumber();
    }

    public int compareTo(Person other) {
        return this.theName.compareTo(other.getName());
    }
}
