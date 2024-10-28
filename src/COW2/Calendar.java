package COW2;

public class Calendar
{
    public boolean isSchoolOpen(boolean isWeekDay, boolean isHoliday, boolean timeForVacation) {
        if (isWeekDay && !isHoliday && !timeForVacation) {
            return true;
        } else {
            return false;
        }
    }

    public int getNumberOfMonth(String month) {
        if (month.equals("January")) {
            return 1;
        } else if (month.equals("February")) {
            return 2;
        } else if (month.equals("March")) {
            return 3;
        } else if (month.equals("April")) {
            return 4;
        } else if (month.equals("May")) {
            return 5;
        } else if (month.equals("June")) {
            return 6;
        } else if (month.equals("July")) {
            return 7;
        } else if (month.equals("August")) {
            return 8;
        } else if (month.equals("September")) {
            return 9;
        } else if (month.equals("October")) {
            return 10;
        } else if (month.equals("November")) {
            return 11;
        } else if (month.equals("December")) {
            return 12;
        } else {
            return -1; // Invalid month
        }
    }

    public String whatSeason(String month, int day) {
        if ((month.equals("March") && day >= 19) || month.equals("April") || month.equals("May") || (month.equals("June") && day < 20)) {
            return "spring";
        } else if ((month.equals("June") && day >= 20) || month.equals("July") || month.equals("August") || (month.equals("September") && day < 22)) {
            return "summer";
        } else if ((month.equals("September") && day >= 22) || month.equals("October") || month.equals("November") || (month.equals("December") && day < 21)) {
            return "fall";
        } else {
            return "winter";
        }
    }

    public String whatZodiacSign(String month, int day) {
        if ((month.equals("January") && day >= 20) || (month.equals("February") && day <= 18)) {
            return "Aquarius";
        } else if ((month.equals("February") && day >= 19) || (month.equals("March") && day <= 20)) {
            return "Pisces";
        } else if ((month.equals("March") && day >= 21) || (month.equals("April") && day <= 19)) {
            return "Aries";
        } else if ((month.equals("April") && day >= 20) || (month.equals("May") && day <= 20)) {
            return "Taurus";
        } else if ((month.equals("May") && day >= 21) || (month.equals("June") && day <= 20)) {
            return "Gemini";
        } else if ((month.equals("June") && day >= 21) || (month.equals("July") && day <= 22)) {
            return "Cancer";
        } else if ((month.equals("July") && day >= 23) || (month.equals("August") && day <= 22)) {
            return "Leo";
        } else if ((month.equals("August") && day >= 23) || (month.equals("September") && day <= 22)) {
            return "Virgo";
        } else if ((month.equals("September") && day >= 23) || (month.equals("October") && day <= 22)) {
            return "Libra";
        } else if ((month.equals("October") && day >= 23) || (month.equals("November") && day <= 21)) {
            return "Scorpio";
        } else if ((month.equals("November") && day >= 22) || (month.equals("December") && day <= 21)) {
            return "Sagittarius";
        } else {
            return "Capricorn";
        }
    }
    
    public static boolean isALeapYear(int year){
        return false;
    }
}




