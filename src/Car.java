import org.jetbrains.annotations.NotNull;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Yana on 14.03.2017.
 */
import java.util.*;

public class Car implements Comparable<Car> {
    @Override
    public int compareTo(@NotNull Car car) {
        //ascending order
        return this.getDateOfIssue().compareTo(car.getDateOfIssue());
    }

    enum Marka {TOYOTA, BMW, MERSEDES, CHEVROLET, CADILLAC, BUICK}

    enum Model {CORROLA, CAMRY, MB193, M407D, X5, R172, SL63}

    enum Color {RED, PINK, YELLOW, GREEN, BLACK, GREY, WHITE}

    private Marka marka;
    private Model model;
    private Color color;
    private String number;
    private User owner = new User();
    private Calendar dateOfIssue = new GregorianCalendar();

    public Marka getMarka() {
        return this.marka;
    }

    public void setMarka(Marka marka) {
        this.marka = marka;
    }

    public Model getModel() {
        return this.model;
    }

    public void setModel(Model model1) {
        this.model = model1;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color1) {
        this.color = color1;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number1) {
        this.number = number1;
    }

    public User getOwner() {
        return this.owner;
    }

    public void setOwner(User owner1) {
        this.owner = owner1;
    }

    public Calendar getDateOfIssue() {
        return this.dateOfIssue;
    }

    public void setDateOfIssue(Calendar dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public Car(Marka marka, Model model, Color color, String number, Calendar dateOfIssue) {
        super();
        setMarka(marka);
        setModel(model);
        setColor(color);
        setNumber(number);
        setDateOfIssue(dateOfIssue);
    }

    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return "Mark of car: " + this.marka + " " + this.model + "-- date of issue: " + formatter.format(this.dateOfIssue.getTime()) + ", Car number: " + this.number + ", Car color: " + this.color/* + "Car owner: " + this.owner*/;
    }

}
