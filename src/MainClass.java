/**
 * Created by Yana on 14.03.2017.
 */
import javax.jws.soap.SOAPBinding;
import java.util.*;

public class MainClass {
    public static void main(String[] Args) {


        Park park1 = new Park();
        UsersScope allUsers = new UsersScope();

        User user1 = new User("Chuck", "Palaniuk", "380979797977", "380979797978", new GregorianCalendar(1966,11,10));
        User user2 = new User("Bob", "Bobko", "80970909099", "" , new GregorianCalendar(1988,10,1));
        User user3 = new User("Rob", "Robo", "38066787877", "380970909888", new GregorianCalendar(1999,01,20));
        User user4 = new User("Jack", "Daniels", "380505050500", " " , new GregorianCalendar(1977,11,12));

        allUsers.addUser(user1);
        allUsers.addUser(user2);
        allUsers.addUser(user3);
        allUsers.addUser(user4);

        //addCar to

        Car car = new Car(Car.Marka.BMW, Car.Model.X5, Car.Color.BLACK, "АН4534АН", user1,
                new GregorianCalendar(1996, Calendar.FEBRUARY, 23));
        Car car1 = new Car(Car.Marka.BUICK, Car.Model.M407D, Car.Color.GREEN, "ПП777ОО", user2,
                new GregorianCalendar(1988, Calendar.MARCH, 3));
        Car car2 = new Car(Car.Marka.TOYOTA, Car.Model.CORROLA, Car.Color.BLACK, "АН4534АП", user3,
                new GregorianCalendar(1977, Calendar.APRIL, 13));
        Car car3 = new Car(Car.Marka.MERSEDES, Car.Model.M407D, Car.Color.YELLOW, "АК6734АП", user1,
                new GregorianCalendar(1970, Calendar.APRIL, 1));



        park1.addCar(car);
        park1.addCar(car1);
        park1.addCar(car2);
        park1.addCar(car3);

        System.out.println("List of car owners:");
        List<User> sortedByName = allUsers.getSortedByName();
        for (User byName : sortedByName         ) {
            System.out.println(byName);
        }

        System.out.println("__________");
        System.out.println("List of cars sorted by mark + date of issue:");
        List<Car> sortedByMarka = park1.getSortedByMarka();
        for (Car byMarka : sortedByMarka          ) {
            System.out.println(byMarka);
        }
        System.out.println("__________");
        System.out.println("List of cars sorted by date of issue:");
        List<Car> sortedByYear = park1.sortCarsByYear();
        for (Car byYear : sortedByYear){
            System.out.println(byYear);
        }
        System.out.println("__________");
        System.out.println("List of cars sorted by date of issue (Reverse):");
        List<Car> sortedByYearReverse = park1.getSortedByYearReverse();
        for (Car byYearReverse : sortedByYearReverse          ) {
            System.out.println(byYearReverse);
        }

         /*
                System.out.println("Car owner1 " + car.getOwner());
        System.out.print("Car: " + car.getMarka() + " " + car.getModel()
                + ", Date of issue: " + formatter.format(car.getDateOfIssue().getTime()));
        System.out.println(", Car number: " + car.getNumber());
        System.out.println("Car color: " + car.getColor());
        System.out.println("_________________");
        */


    }
}
