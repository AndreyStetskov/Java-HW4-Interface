import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Worker firstPerson = new Worker("Sam", 65, 198, 118);
        firstPerson.setMinSalary(748.89);
        firstPerson.setMaxSalary(3525.77);
        double firstPersonsPension = firstPerson.calculatePension();

        Worker secondPerson = new Worker("Anna", 41, 168, 75);
        secondPerson.setMinSalary(1184.11);
        secondPerson.setMaxSalary(9514.78);
        double secondPersonsPension = secondPerson.calculatePension();

        Worker thirdPerson = new Worker("Bill", 11, 139, 31);
        thirdPerson.setMinSalary(0);
        thirdPerson.setMaxSalary(0);
        double thirdPersonsPension = thirdPerson.calculatePension();

        Worker fourthPerson = new Worker("Jessica", 25, 165, 52);
        fourthPerson.setMinSalary(4556.99);
        fourthPerson.setMaxSalary(5500);
        double fourthPersonsPension = fourthPerson.calculatePension();

        Worker fifthPerson = new Worker("Jenifer", 0, 49, 4);
        fifthPerson.setMinSalary(0);
        fifthPerson.setMaxSalary(0);
        double fifthPersonsPension = fifthPerson.calculatePension();

        Worker sixthPerson = new Worker("Alisa", 49, 158, 51);
        sixthPerson.setMinSalary(897.11);
        sixthPerson.setMaxSalary(7538.03);
        double sixthPersonsPension = sixthPerson.calculatePension();

        Worker seventhPerson = new Worker("Bruce", 71, 187, 71);
        seventhPerson.setMinSalary(1965.75);
        seventhPerson.setMaxSalary(6784.88);
        double seventhPersonsPension = seventhPerson.calculatePension();

        Worker eighthPerson = new Worker("Sarah", 19, 171, 61);
        eighthPerson.setMinSalary(2358.07);
        eighthPerson.setMaxSalary(3154.44);
        double eighthPersonsPension = eighthPerson.calculatePension();

        Worker ninthPerson = new Worker("Laura", 57, 172, 61);
        ninthPerson.setMinSalary(5481.24);
        ninthPerson.setMaxSalary(35110);
        double ninthPersonsPension = ninthPerson.calculatePension();

        Worker tenthPerson = new Worker("Monica", 25, 175, 89);
        tenthPerson.setMinSalary(7780.87);
        tenthPerson.setMaxSalary(8584.88);
        double tenthPersonsPension = tenthPerson.calculatePension();
    }
}