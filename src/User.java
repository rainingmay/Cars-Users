import java.util.*;
import java.text.SimpleDateFormat;

/**
 * Created by Yana on 16.03.2017.
 */
public class User {
    private String name;
    private String surname;
    private String phoneNumber;
    private String phoneNumber2;
    private Calendar dateOfBirth = new GregorianCalendar();
    private List<Car> cars;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber2() {
        return this.phoneNumber2;
    }



    public void setPhoneNumber2(String phoneNumber2) {
        this.phoneNumber2 = phoneNumber2;
    }

        public List<Car> getCars() {
            return cars;
        }

        public void setCars(List<Car> cars) {
            this.cars = cars;
        }

    public Calendar getDateOfBirth() {
        return this.dateOfBirth;
    }



    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public User(String name, String surname, String phoneNumber, String phoneNumber2, Calendar dateOfBirth) {
        super();
        setName(name);
        setSurname(surname);
        setPhoneNumber(phoneNumber);
        setPhoneNumber2(phoneNumber2);
        setDateOfBirth(dateOfBirth);
        }
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
       // String s = this.phoneNumber == null ? "":this.phoneNumber;
        return "Name: " + this.name + " " + this.surname + ", Phone number: " + this.phoneNumber + ", " +
                this.phoneNumber2 + ", Date of birth: " + formatter.format(this.dateOfBirth.getTime()) + "Autopark: " + this.cars;
    }

}
