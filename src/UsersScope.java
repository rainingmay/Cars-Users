/**
 * Created by Yana on 16.03.2017.
 */
import java.util.*;

public class UsersScope {

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

    public List<User> getSortedByName() {
        Collections.sort(usersList, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().toString().compareTo(o2.getName().toString());
            }
        });
        return usersList;

    }
}