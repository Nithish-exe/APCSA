package COW2;

public class PayRoll {
    public double getBonus(double sales) {
        if (sales > 300000) {
            return (sales - 300000) * 0.1;
        } else {
            return 0;
        }
    }

    public double whatIsMyBaseSalary(String degree) {
        if (degree.equals("Doctorate")) {
            return 100000;
        } else if (degree.equals("Masters")) {
            return 60000;
        } else if (degree.equals("Bachelors")) {
            return 40000;
        } else if (degree.equals("Associates")) {
            return 25000;
        } else {
            return 15000;
        }
    }

    public double whatIsMySalary(String degree, int yearsExperience, double sales) {
        double baseSalary = whatIsMyBaseSalary(degree);
        double bonus = getBonus(sales);
        return baseSalary + bonus + (baseSalary * 0.05 * yearsExperience);
    }

    public double taxAmount(double money) {
        if (money <= 9075) {
            return money * 0.1;
        } else if (money <= 36900) {
            return 907.5 + (money - 9075) * 0.15;
        } else if (money <= 89350) {
            return 5081.25 + (money - 36900) * 0.25;
        } else if (money <= 186350) {
            return 18193.75 + (money - 89350) * 0.28;
        } else if (money <= 405100) {
            return 45353.75 + (money - 186350) * 0.33;
        } else if (money <= 406750) {
            return 117541.25 + (money - 405100) * 0.35;
        } else {
            return 118118.75 + (money - 406750) * 0.396;
        }
    }

    public double whatIsMySalaryAfterTax(String degree, int yearsExperience, double sales){
        return 0;
    }

}