package model;
import java.util.*;
import java.text.SimpleDateFormat;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Yana on 16.03.2017.
 */



public class User {
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Surname")
    private String surname;
    @JsonProperty("PhoneNumber")
    private String phoneNumber;
    @JsonProperty("PhoneNumber#2")
    private String phoneNumber2;
    @JsonProperty("DateOfBirth")
    private Calendar dateOfBirth = new GregorianCalendar();
    @JsonProperty("Vars")
    private List<Car> cars = new ArrayList<Car>();
  //  private Car car;

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

//    public Car getCar() {
//        return car;
//    }
//
//    public void setCar(Car car) {
//        this.car = car;
//    }


    public User() {
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
                this.phoneNumber2 + ", Date of birth: " + formatter.format(this.dateOfBirth.getTime()) + " Autopark: " + this.cars;
    }
    public void addCarToUser(Car car) {
        cars.add(car);
        }


}
