public class Worker extends Person implements AbleToCalculatePension{

    private double minSalary;
    private double maxSalary;
    private boolean isNational;
    private final String dateCreated;


    public Worker(double minSalary, double maxSalary, boolean isNational, String dateCreated) {
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.isNational = isNational;
        this.dateCreated = dateCreated;
    }


    @Override
    public void die() {
        System.out.println(getName() + " didn't live up to pension");
    }

    @Override
    public void calculatePension(SuperannuationFund pensionFund) {
        SuperannuationFund fund = new SuperannuationFund(null, true, null);

        fund.setDateCreated(dateCreated);
        fund.getDateCreated();

        fund.setIsNational(isNational);
        fund.getIsNational();

        String yearCreated = fund.getDateCreated().substring(6);
        int currentYear = 2023;
        int timeWorked = currentYear - Integer.parseInt(yearCreated);

        fund.pensionCalculation(timeWorked, getMinSalary(), getMaxSalary());
    }

    public double getMinSalary() {
        return minSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public boolean getIsNational() {
        return isNational;
    }

    public String getDateCreated() {
        return dateCreated;
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
