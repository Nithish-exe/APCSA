package COW3;

class Name {
    private String firstName;
    private String middleName;
    private String lastName;

    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() { return firstName; }
    public String getMiddleName() { return middleName; }
    public String getLastName() { return lastName; }

    public String toString() {
        return firstName + " " + middleName + " " + lastName;
    }

    public boolean equals(Name otherName) {
        return this.firstName.equals(otherName.getFirstName()) &&
                this.middleName.equals(otherName.getMiddleName()) &&
                this.lastName.equals(otherName.getLastName());
    }

    public int compareTo(Name otherName) {
        int lastCompare = this.lastName.compareTo(otherName.getLastName());
        if (lastCompare != 0) return lastCompare;

        int firstCompare = this.firstName.compareTo(otherName.getFirstName());
        if (firstCompare != 0) return firstCompare;

        return this.middleName.compareTo(otherName.getMiddleName());
    }
}
