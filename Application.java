import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Application {
    public static void main(String args[]){
        Calendar c1=Calendar.getInstance();
        c1.set(Calendar.DAY_OF_MONTH, 1);
        Calendar c2=Calendar.getInstance();
        c2.set(Calendar.MONTH, 9);
        c2.set(Calendar.DAY_OF_MONTH, 20);
        Calendar c3=Calendar.getInstance();
        c3.set(Calendar.MONTH, 8);
        Calendar c4=Calendar.getInstance();
        c4.set(Calendar.MONTH, 8);
        
        List<User> userList = new ArrayList<>();
        userList.add(new User("Mihai", "Silitră","mihai.silitra@Student.usv.ro", 21, User.USER_NEW, c1));
        userList.add(new User("Victoria", "Toma", "victoria.toma@Student.usv.ro", 22,  User.USER_NEW, c2));
        userList.add(new User("Maria", "Iacob","maria.iacob@Student.usv.ro", 25, User.USER_INACTIVE, c3));
        userList.add(new User("Floarea", "Popescu","floarea.popescu@Student.usv.ro",  30,  User.USER_INACTIVE, c4));
        setActiveUsers(userList, 2, User.USER_NEW, User.USER_ACTIVE);
        setActiveUsers(userList, 30, User.USER_INACTIVE, User.USER_BLOCKED);
        for(int i=0;i < userList.size();i++){
            System.out.println(userList.get(i).toString());
        }
    }
    public static void setActiveUsers(List<User> userList, int days, int status, int newStatus)
    {   
        for(int i=0; i< userList.size();i++)
        {            
            if(checkUserStatus(userList.get(i), status, days))
                userList.get(i).setStatus(newStatus);
        }        
    }
    public static boolean checkUserStatus(User user, int status, int days)
    {
        Calendar today = Calendar.getInstance();
        if(user.getStatus()==status)
                if (ChronoUnit.DAYS.between(
                    user.getTimestamp().toInstant(), 
                    today.toInstant()) >= days)
                        return true;
        return false;
    }
}
