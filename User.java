import java.util.Calendar;

public class User {
    public static final String USER_DEFAULT_FIRSTNAME= "NONE";
    public static final String USER_DEFAULT_LASTNAME= "NONE";
    public static final int USER_DEFAULT_AGE=0;
    public static final String USER_DEFAULT_EMAIL= "example@domain.com";
    public static final int USER_NEW=  0;
    public static final int USER_ACTIVE= 1;
    public static final int USER_INACTIVE= 2;
    public static final int USER_BLOCKED= 3;
    public static final String[] USER_STATUS= {"NEW", "ACTIVE", "INACTIVE", "BLOCKED"};

    private String firstname;
    private String lastname;
    private int age;
    private String email;
    private int status;
    private Calendar timestamp;
    public static void main(String[] args){
        
    }
    User(){
        firstname= USER_DEFAULT_FIRSTNAME;
        lastname=USER_DEFAULT_LASTNAME;
        age=USER_DEFAULT_AGE;
        email=USER_DEFAULT_EMAIL;
        status=USER_NEW;
        timestamp= Calendar.getInstance();
    }
    User(String firstname, 
    String lastname, 
    String email,
    int age,
    int status,
    Calendar timestamp){
        this.firstname= firstname;
        this.lastname=lastname;
        this.age=age;
        this.email=email;
        this.status=status;
        this.timestamp=timestamp;
    }
    void setFirstName(String firstname)
    {
        this.firstname=firstname;
    }
    void setLastName(String lastname)
    {
        this.lastname=lastname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    void setEmail(String email)
    {
        this.email=email;
    }
    void setStatus(int status)
    {
        this.status=status;
    }
    void setTimeStamp(Calendar timestamp)
    {
        this.timestamp=timestamp;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public int getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }
    public int getStatus() {
        return status;
    }
    public Calendar getTimestamp() {
        return timestamp;
    }
    public String toString()
    {
        return "Firstname: " + firstname 
                + "\nLastname: " + lastname 
                + "\nAge: " + age
                + "\nEmail: " + email
                + "\nStatus: " + USER_STATUS[status]
                + "\ntimestamp: " + timestamp.get(Calendar.DAY_OF_MONTH)
                + "/" + timestamp.get(Calendar.MONTH)
                + "/" + timestamp.get(Calendar.YEAR);
    }

}
