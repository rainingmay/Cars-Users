/**
 * Created by Yana on 14.03.2017.
 */

import java.util.*;

public class Park {
    private List<Car> carsList = new ArrayList<Car>();

    public List getCarsList() {
        return this.carsList;
    }

    public void setCarsList(List carsList) {
        this.carsList = carsList;
    }

    public void addCar(Car car) {
        carsList.add(car);
    }

    public List<Car> sortCarsByYear() {
        Collections.sort(carsList);
        return carsList;
    }

    public List<Car> getSortedByMarka(){
        Collections.sort(carsList, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {

                return o1.getMarka().toString().compareTo(o2.getMarka().toString());
            }
        });
        return carsList;
    }
    public List<Car> getSortedByYearReverse() {
        Collections.reverse(this.sortCarsByYear());
        return carsList;
    }
}

