/**
 * Created by Yana on 16.03.2017.
 */
import java.util.*;
import java.util.Scanner;

public class UsersService {

    private List<User> usersList = new ArrayList<User>();

    public List getUsersList() {
        return this.usersList;
    }

    public void setUsersList(List usersList) {
        this.usersList = usersList;
    }

    public void addUser(User user1) {
        usersList.add(user1);
    }

    //    придумать как с консоли вводить нового юзера
    public User addUserManually(User user) {

        Scanner scanner = new Scanner(System.in); // создаём объект класса Scanner
        System.out.println("Enter the new user's name of : ");
        String enteredName = scanner.nextLine();
     //   System.out.println("You didn't enter the name. Please enter again: ");

        System.out.println("Enter the new user's surname: ");
        String enteredSurname = scanner.nextLine();
  //      System.out.println("You didn't enter the surname. Please enter again: ");


        System.out.println("Enter the new user's phone at 380********* format:");
        String enteredPhoneNumber = scanner.nextLine();
//        if (enteredPhoneNumber == null) {
//            System.out.println("You didn't enter the phone number. Please enter again: ");
//            enteredSurname = scanner.nextLine();
//        }
//        // сделать проверку на формат введенного
//       if (enteredPhoneNumber == null) {
//           System.out.println("You didn't enter the phone number. Please enter again: ");
//           enteredSurname = scanner.nextLine();
//       }
        System.out.println("In case of presence add another phone at 380********* format. If you haven't just click Enter key");
        String enteredPhoneNumber2 = scanner.nextLine();
        System.out.println("Enter the new user's birthday at yyyy-mm-dd format: ");

        Calendar dateOfBirth = new GregorianCalendar();
        User user1 = new User(enteredName, enteredSurname, enteredPhoneNumber, enteredPhoneNumber2, dateOfBirth);
        System.out.println(user1);
    return user1;
    }

//        usersList.add(user1);
//    }

    public List<User> getSortedByName() {
        Collections.sort(usersList, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().toString().compareTo(o2.getName().toString());
            }
        });
        return usersList;
    }

    public User getByPhone(String phoneNumber) {
        User result = null;
        for (User user : usersList) {
            if (user.getPhoneNumber().contains(phoneNumber)) {
                result = user;
            }
        }
        return result;
    }

    public void createCarWithUser(Car car, User user) {
        user.addCarToUser(car);
        car.setOwner(user);
    }

    public void createCarWithUser2(Car car, User user) {

     if (checkExixtanceOfCarAtCarslist(car.getNumber()))  {
    //    if (checkExixtanceOfCarAtCarslist(car.number == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("This car " + car.getNumber() + " is already exist. The owner is " + car.getOwner() + ". Do you want to overwrite it's data? If YES press Y, If NO press another key");
            String overwrite = scanner.nextLine();
            if (overwrite.equals("Y")) {
                user.addCarToUser(car);
                car.setOwner(user);
                return;
            } else {
                System.out.println("Car isn't added");
            }
        } else createCarWithUser(car, user);
    }

    public boolean checkExistanceOfCarAtUser(User user, String number) {
        //якщо немає машини с таким номером у юзера
        for (Car car : user.getCars()) {
            if (car.getNumber().equals(number)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkExixtanceOfCarAtCarslist(String number) {
        for (User user : usersList) {
            for (Car car : user.getCars()) {
                if (car.getNumber().equals(number)) {
                    return true;
                }
            }
        }
        return false;
    }
}