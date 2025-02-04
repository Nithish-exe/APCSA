package COW_7.Group;

import java.util.*;

public class Group {
    private Person[] people;

    public Group(Person[] people) {
        this.people = people;
    }

    public Person[] getPeople() {
        return people;
    }

    public void printList() {
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].toString());
        }
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < people.length; i++) {
            result += people[i].toString() + "\n";
        }
        return result;
    }

    public String printAllWithSurname(String lastName) {
        String result = "";
        for (int i = 0; i < people.length; i++) {
            if (people[i].getName().getLastName().equals(lastName)) {
                System.out.println(people[i].getName().toString());
                result += people[i].getName().toString() + "\n";
            }
        }
        return result;
    }

    public String printAllWithFirstName(String firstName) {
        String result = "";
        for (int i = 0; i < people.length; i++) {
            if (people[i].getName().getFirstName().equals(firstName)) {
                System.out.println(people[i].getName().toString());
                result += people[i].getName().toString() + "\n";
            }
        }
        return result;
    }

    public String printThoseOnStreet(String streetName) {
        String result = "";
        for (int i = 0; i < people.length; i++) {
            if (people[i].getHomeAddress().getStreet().equals(streetName)) {
                System.out.println(people[i].getName().toString());
                result += people[i].getName().toString() + "\n";
            }
        }
        return result;
    }

    public String printThoseInState(String state) {
        String result = "";
        for (int i = 0; i < people.length; i++) {
            if (people[i].getHomeAddress().getState().equals(state)) {
                System.out.println(people[i].getName().toString());
                result += people[i].getName().toString() + "\n";
            }
        }
        return result;
    }

    public String printThoseBornInYear(int year) {
        String result = "";
        for (int i = 0; i < people.length; i++) {
            if (people[i].getBirthDay().getYear() == year) {
                System.out.println(people[i].getName().toString());
                result += people[i].getName().toString() + "\n";
            }
        }
        return result;
    }

    public String printThoseBornInMonthOf(String birthMonth) {
        String result = "";
        for (int i = 0; i < people.length; i++) {
            if (convertMonthToName(people[i].getBirthDay().getMonth()).equalsIgnoreCase(birthMonth)) {
                result += people[i].getName().toString() + "\n";
            }
        }
        return result;
    }

    private String convertMonthToName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        if (month >= 1 && month <= 12) {
            return months[month - 1];
        }
        return "Unknown";
    }

    public int compareTo(Group other) {
        if (this.people.length == other.people.length) {
            return 0;
        } else if (this.people.length > other.people.length) {
            return 1;
        } else {
            return -1;
        }
    }

    public boolean isInGroup(Person them) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals(them)) {
                return true;
            }
        }
        return false;
    }

    public String printThoseWithAnInterestIn(String interest) {
        String result = "";
        for (int i = 0; i < people.length; i++) {
            for (int j = 0; j < people[i].getInterests().length; j++) {
                if (people[i].getInterests()[j].equals(interest)) {
                    System.out.println(people[i].getName().toString());
                    result += people[i].getName().toString() + "\n";
                    break;
                }
            }
        }
        return result;
    }

    public boolean equals(Group other) {
        if (this.people.length != other.people.length) {
            return false;
        }
        for (int i = 0; i < this.people.length; i++) {
            if (!this.people[i].equals(other.people[i])) {
                return false;
            }
        }
        return true;
    }

    public String printInZipCode(int zip){
        String result = "";

        return result;
    }

    public String printAllOlderThan(int numYears, MyDate currentDate){
        String result = "";

        return result;
    }
}



