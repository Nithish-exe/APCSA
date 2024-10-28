package COW3;

class Address {
    private int number;
    private String street;
    private String county;
    private String state;
    private int zipCode;
    private String country;

    public Address(int number, String street, String county, String state, int zipCode, String country) {
        this.number = number;
        this.street = street;
        this.county = county;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    public Address(int number, String street, boolean isApartment, int apartmentNumber, String county, String state, int zipCode, String country) {
        this.number = number;
        this.street = street;
        this.county = county;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    public int getNumber() {
        return number;
    }

    public String getStreet() {
        return street;
    }

    public String getCounty() {
        return county;
    }

    public String getState() {
        return state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getCountry() {
        return country;
    }

    public String toString() {
        return number + " " + street + "\n" +
                county + ", " + state + " " + zipCode + "\n" +
                country;
    }

    public boolean equals(Address other) {
        return this.number == other.getNumber() &&
                this.street.equals(other.getStreet()) &&
                this.county.equals(other.getCounty()) &&
                this.state.equals(other.getState()) &&
                this.zipCode == other.getZipCode() &&
                this.country.equals(other.getCountry());
    }
}
