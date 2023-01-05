public class Main {
    public static void main(String[] args) {

        SuperannuationFund forFirstPerson = new SuperannuationFund("Pupkin and Ko", false, "15.07.1981");
        SuperannuationFund forSecondPerson = new SuperannuationFund("NPF", true, "21.09.2007");
        SuperannuationFund forThirdPerson = new SuperannuationFund("No fund", true, "00.00.0000");
        SuperannuationFund forFourthPerson = new SuperannuationFund("PensCorp", false, "15.07.2022");
        SuperannuationFund forFifthPerson = new SuperannuationFund("No fund", true, "00.00.0000");
        SuperannuationFund forSixthPerson = new SuperannuationFund("Social Protection fund", true, "26.10.1991");
        SuperannuationFund forSeventhPerson = new SuperannuationFund("National Pension fund", true, "30.11.1970");
        SuperannuationFund forEighthPerson = new SuperannuationFund("New State fund", true, "21.11.2021");
        SuperannuationFund forNinthPerson = new SuperannuationFund("Horns and hooves", false, "15.07.1983");
        SuperannuationFund forTenthPerson = new SuperannuationFund("Freedom Peak Financial", true, "01.07.2022");

        Worker firstPerson = new Worker(748.89, 3525.77, forFirstPerson.getIsNational(), forFirstPerson.getDateCreated());
        firstPerson.calculatePension(forFirstPerson);

        Worker secondPerson = new Worker(1184.11, 9514.78, forSecondPerson.getIsNational(), forFirstPerson.getDateCreated());
        secondPerson.calculatePension(forSecondPerson);

        Worker thirdPerson = new Worker(0, 0, forThirdPerson.getIsNational(), forThirdPerson.getDateCreated());
        thirdPerson.calculatePension(forThirdPerson);

        Worker fourthPerson = new Worker(4556.99, 5500, forFourthPerson.getIsNational(), forFourthPerson.getDateCreated());
        fourthPerson.calculatePension(forFourthPerson);

        Worker fifthPerson = new Worker(0, 0, forFifthPerson.getIsNational(), forFifthPerson.getDateCreated());
        fifthPerson.calculatePension(forFifthPerson);

        Worker sixthPerson = new Worker(897.11, 7538.03, forSixthPerson.getIsNational(), forSixthPerson.getDateCreated());
        sixthPerson.calculatePension(forSixthPerson);

        Worker seventhPerson = new Worker(1965.75, 6784.88, forSeventhPerson.getIsNational(), forSeventhPerson.getDateCreated());
        seventhPerson.calculatePension(forSeventhPerson);

        Worker eighthPerson = new Worker(2358.07, 3154.44, forEighthPerson.getIsNational(), forEighthPerson.getDateCreated());
        eighthPerson.calculatePension(forEighthPerson);

        Worker ninthPerson = new Worker(5481.24, 35110, forNinthPerson.getIsNational(), forNinthPerson.getDateCreated());
        ninthPerson.calculatePension(forNinthPerson);

        Worker tenthPerson = new Worker(7780.87, 8584.88, forTenthPerson.getIsNational(), forTenthPerson.getDateCreated());
        tenthPerson.calculatePension(forTenthPerson);

    }
}