/**
 * Created by Yana on 14.03.2017.
 */
import jsonService.ToJason;
import model.User;
import model.Car;
import java.io.File;
import java.io.IOException;

import java.util.*;

public class MainClass {
//   public static void main(String[] Args) {
public static void main(String[] Args) throws IOException {


        Park park1 = new Park();
        UsersService allUsers = new UsersService();
        ConsoleReader consoleReader = new ConsoleReader();
        ToJason toJason = new ToJason();

        User user1 = new User("Chuck", "Palaniuk", "380979797977", "380979797978", new GregorianCalendar(1966,11,10));
        User user2 = new User("Bob", "Bobko", "380970909099", "" , new GregorianCalendar(1988,10,1));
        User user3 = new User("Rob", "Robo", "38066787877", "380970909888", new GregorianCalendar(1999,01,20));
        User user4 = new User("Jack", "Daniels", "380505050500", " " , new GregorianCalendar(1977,11,12));

        allUsers.addUser(user1);
        allUsers.addUser(user2);
        allUsers.addUser(user3);
        allUsers.addUser(user4);

        Car car = new Car(Car.Marka.BMW, Car.Model.X5, Car.Color.BLACK, "АН4545АН",
                new GregorianCalendar(1996, Calendar.FEBRUARY, 23));
        Car car1 = new Car(Car.Marka.BUICK, Car.Model.M407D, Car.Color.GREEN, "ПП777ОО",
                new GregorianCalendar(1988, Calendar.MARCH, 3));
        Car car2 = new Car(Car.Marka.TOYOTA, Car.Model.CORROLA, Car.Color.BLACK, "АН4534АП",
                new GregorianCalendar(1977, Calendar.APRIL, 13));
        Car car3 = new Car(Car.Marka.MERSEDES, Car.Model.M407D, Car.Color.YELLOW, "АК6734АП",
                new GregorianCalendar(1970, Calendar.APRIL, 1));

        //add cars to park1
        park1.addCarToList(car);
        park1.addCarToList(car1);
        park1.addCarToList(car2);
        park1.addCarToList(car3);

        //connect cars to user
        allUsers.createCarWithUser2(car, user1);
        allUsers.createCarWithUser2(car1, user2);
        allUsers.createCarWithUser2(car2, user1);
        allUsers.createCarWithUser2(car3, user4);
        toJason.toJSON(user1);
        toJason.toJavaObject();

        Car car4 = new Car(consoleReader.markaReader(), consoleReader.modelReader(), consoleReader.colorReader(),
                consoleReader.numberReader(), consoleReader.dateOfIssueReader());
        park1.addCarToList(car4);

        allUsers.createCarWithUser2(car4, user1);

        System.out.println("Autopark of " + user1.getName() +" " + user1.getSurname() + ": " + user1.getCars() );




        //     Car car4 = park1.addCarManuallyToList(car);

//        User user5 = allUsers.addUserManually(user1);

     //   System.out.println(car4);
//        System.out.println(user5);

    //    allUsers.addCarToList(car);

//        System.out.println("List of car owners:");
//        List<User> sortedByName = allUsers.getSortedByName();
//        for (User byName : sortedByName         ) {
//            System.out.println(byName);
//        }
//
//        System.out.println("__________");
//        System.out.println("List of cars sorted by mark + date of issue:");
//        List<Car> sortedByMarka = park1.getSortedByMarka();
//        for (Car byMarka : sortedByMarka          ) {
//            System.out.println(byMarka);
//        }
//        System.out.println("__________");
//        System.out.println("List of cars sorted by date of issue:");
//        List<Car> sortedByYear = park1.sortCarsByYear();
//        for (Car byYear : sortedByYear){
//            System.out.println(byYear);
//        }
//        System.out.println("__________");
//        System.out.println("List of cars sorted by date of issue (Reverse):");
//        List<Car> sortedByYearReverse = park1.getSortedByYearReverse();
//        for (Car byYearReverse : sortedByYearReverse          ) {
//            System.out.println(byYearReverse);
//        }
//
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
