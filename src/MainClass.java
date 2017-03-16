/**
 * Created by Yana on 14.03.2017.
 */
import javax.imageio.plugins.bmp.BMPImageWriteParam;
import java.util.*;
import java.text.SimpleDateFormat;

public class MainClass {
    public static void main(String[] Args) {
        Car car = new Car(Car.Marka.BMW, Car.Model.X5, Car.Color.BLACK, "АН4534АН", "Chuck",
                new GregorianCalendar(1996, Calendar.FEBRUARY, 23));
        Car car1 = new Car(Car.Marka.BUICK, Car.Model.M407D, Car.Color.GREEN, "ПП777ОО", "Bob",
                new GregorianCalendar(1988, Calendar.MARCH, 3));
        Car car2 = new Car(Car.Marka.TOYOTA, Car.Model.CORROLA, Car.Color.BLACK, "АН4534АП", "Rob",
                new GregorianCalendar(1977, Calendar.APRIL, 13));
        Car car3 = new Car(Car.Marka.MERSEDES, Car.Model.M407D, Car.Color.YELLOW, "АК6734АП", "Rob",
                new GregorianCalendar(1970, Calendar.APRIL, 1));

        Park park1 = new Park();

        park1.addCar(car);
        park1.addCar(car1);
        park1.addCar(car2);
        park1.addCar(car3);

        System.out.println("__________");
        System.out.println("List of cars sorted by mark + date of issue:");
        List<Car> sortedByMarka = park1.getSortedByName();
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
        for(int i = 0; i < park1.size(); i++) {
            if (park1.get(i).startsWith("bla")) {
                System.out.println("i = " + i + "; object: " + park1.get(i));
                park1.remove(i);
            }
        }
         /*
                System.out.println("Car owner1 " + car.getOwner());
        System.out.print("Car: " + car.getMarka() + " " + car.getModel()
                + ", Date of issue: " + formatter.format(car.getDateOfIssue().getTime()));
        System.out.println(", Car number: " + car.getNumber());
        System.out.println("Car color: " + car.getColor());
        System.out.println("_________________");
        */


            // Pass 2 - delete
            for (Car deleteCandidate : deleteCandidates) {
                myCars.remove(deleteCandidate);
            }

    }
}
