package teamproject;

public class Person {

    public Person() {
        this.id = 0;
        this.firstName = " ";
        this.secondName = " ";
        this.firstLastName = " ";
        this.secondLastName = " ";
        this.email = " ";
    }

    public Person(int id, String firstName, String secondName, String firstLastName, String secondLastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
        this.email = email;
    }

    private int id;

    private String firstName;

    private String secondName;

    private String firstLastName;

    private String secondLastName;

    private String email;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the secondName
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * @param secondName the secondName to set
     */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /**
     * @return the firstLastName
     */
    public String getFirstLastName() {
        return firstLastName;
    }

    /**
     * @param firstLastName the firstLastName to set
     */
    public void setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
    }

    /**
     * @return the secondLastName
     */
    public String getSecondLastName() {
        return secondLastName;
    }

    /**
     * @param secondLastName the secondLastName to set
     */
    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
