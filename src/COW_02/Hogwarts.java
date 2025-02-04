package COW2;

public class Hogwarts
{
    public boolean isCauldronAtCorrectTemp(double temp) {
        if (temp == 200.23) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isGoodProfessor(String teacherName) {
        if (teacherName.equals("Dumbledore") || teacherName.equals("Flitwick") || teacherName.equals("McGonagall") ||
                teacherName.equals("Sprout") || teacherName.equals("Lupin") || teacherName.equals("Hagrid")) {
            return true;
        } else {
            return false;
        }
    }

    public String whatHogwartsHouse(int dedication, int intelligence, int bravery, int ambition) {
        if (bravery > dedication && bravery > intelligence && bravery > ambition) {
            return "Gryffindor";
        } else if (dedication > bravery && dedication > intelligence && dedication > ambition) {
            return "Hufflepuff";
        } else if (intelligence > bravery && intelligence > dedication && intelligence > ambition) {
            return "Ravenclaw";
        } else {
            return "Slytherin";
        }
    }

    public String whatDoYouTurnInto(int doorNumber, String drinkColor) {
        if (doorNumber == 1) {
            if (drinkColor.equals("pink")) {
                return "Cat";
            } else if (drinkColor.equals("green")) {
                return "Toad";
            } else if (drinkColor.equals("blue")) {
                return "Owl";
            }
        } else if (doorNumber == 2) {
            if (drinkColor.equals("pink")) {
                return "Rat";
            } else if (drinkColor.equals("green")) {
                return "Snake";
            } else if (drinkColor.equals("blue")) {
                return "Griffin";
            }
        } else if (doorNumber == 3) {
            if (drinkColor.equals("pink")) {
                return "Unicorn";
            } else if (drinkColor.equals("green")) {
                return "Dragon";
            } else if (drinkColor.equals("blue")) {
                return "Giant Squid";
            }
        }
        return "Unknown";
    }

    public String whereToApparate(boolean overseas, boolean onCoast, boolean inBigCity) {
        if (overseas) {
            if (onCoast) {
                return "Nassau";
            } else if (inBigCity) {
                return "Hong Kong";
            } else {
                return "Lucerne";
            }
        } else {
            if (onCoast) {
                return "Nags Head";
            } else if (inBigCity) {
                return "Chicago";
            } else {
                return "Blacksburg";
            }
        }
    }

    public String whatToPrepare(String day, double timeOfDay, boolean isVegetarian) {
        if (timeOfDay < 11) {
            if (day.equals("Saturday") || day.equals("Sunday")) {
                if (isVegetarian) {
                    return "waffles";
                } else {
                    return "biscuits with gravy";
                }
            } else {
                return "cereal";
            }
        } else {
            if (day.equals("Saturday") || day.equals("Sunday")) {
                if (isVegetarian) {
                    return "salad";
                } else {
                    return "steak and potatoes";
                }
            } else {
                if (isVegetarian) {
                    return "beans with rice";
                } else {
                    return "chicken with rice";
                }
            }
        }
    }
}
