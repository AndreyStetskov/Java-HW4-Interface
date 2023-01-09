public class SuperannuationFund {

    private final double COEFF_OF_PENSION = 0.02;
    private int averagePension = 1500;

    private String name;
    private boolean isNational;
    private String dateCreated;


    public SuperannuationFund(String name, boolean isNational, String dateCreated) {
        this.name = name;
        this.isNational = isNational;
        this.dateCreated = dateCreated;
    }


    public double pensionCalculation (int timeWorked, double minWage, double maxWage) {
        double pension;
        if (getIsNational()) {
            pension = HalfValueUtils.halfValue(minWage, maxWage);
            System.out.println(pension * COEFF_OF_PENSION * timeWorked);
        } else {
            pension = HalfValueUtils.halfValueOFThree(minWage, maxWage, averagePension);
            System.out.println(pension * COEFF_OF_PENSION * timeWorked);
        }
        return pension * COEFF_OF_PENSION * timeWorked;
    }


    public String getName() {
        return name;
    }

    public boolean getIsNational() {
        return isNational;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsNational(boolean national) {
        this.isNational = national;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
}
