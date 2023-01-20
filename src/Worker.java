import java.util.Random;

public class Worker extends Person implements AbleToCalculatePension{

    private double minSalary;
    private double maxSalary;

    public Worker(String name, int age, int height, int weight) {
        super(name, age,height, weight);
    }


    @Override
    public void die() {
        System.out.println(getName() + " didn't live up to pension");
    }

    @Override
    public double calculatePension() {
        Random random = new Random();
        boolean randomIsNational = random.nextBoolean();
        String nameOFPensionFond = "This pension fund for " + this.getName();
        int currentYear = 2023;
        int year = this.getAge();
          if (getAge() > 18) {
            year = currentYear - getAge();
        } else {
            year = 0;
        }
        int date = random.nextInt(31) + 1;
        int month = random.nextInt(12) + 1;
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            date -= 1;
        } else if (month == 2 && year % 4 == 0 && year != 100 || year % 400 == 0) {
            date -= 2;
        } else if (month == 2 && year % 4 != 0) {
            date -= 3;
        } else {
            date += 0;
        }
        String createdDate = String.valueOf(date) +"." + String.valueOf(month) + "." + String.valueOf(year);
        System.out.println(createdDate);
        SuperannuationFund fund = new SuperannuationFund(nameOFPensionFond, randomIsNational, createdDate);
        return fund.pensionCalculation(year, getMinSalary(), getMaxSalary());
    }


    public double getMinSalary() {
        return minSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }


    public void setMinSalary(double minSalary) {
        if (minSalary >= 0) {
            this.minSalary = minSalary;
        } else if (minSalary < 0) {
            System.err.print("Error. " + getName() + "'s min salary was entered negative. ");
            System.out.println("Please, enter some positive number for min salary");
        } else {
            System.err.print("Error. " + getName() + "'s min salary was entered incorrectly. ");
            System.out.println("Please, enter some positive number for min salary");
        }
    }

    public void setMaxSalary(double maxSalary) {
        if (maxSalary >= 0) {
            this.maxSalary = maxSalary;
        } else if (maxSalary < 0) {
            System.err.print("Error. " + getName() + "'s max salary was entered negative. ");
            System.out.println("Please, enter some positive number for max salary");
        } else {
            System.err.print("Error. " + getName() + "'s max salary was entered incorrectly. ");
            System.out.println("Please, enter some positive number for max salary");
        }
    }
}
