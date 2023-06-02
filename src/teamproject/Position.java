package teamproject;

public class Position {

    private String id;
    private String kindPosition;

    private double salary;

    private int bonus;

    public Position() {
        this.id = " ";
        this.kindPosition = null;
        this.salary = 0.0;
        this.bonus = 0;
    }

    public Position(String id, String kindPosition, double salary, int bonus) {
        this.id = id;
        this.kindPosition = kindPosition;
        this.salary = salary;
        this.bonus = bonus;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the kindPosition
     */
    public String getKindPosition() {
        return kindPosition;
    }

    /**
     * @param kindPosition the kindPosition to set
     */
    public void setKindPosition(String kindPosition) {
        this.kindPosition = kindPosition;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the bonus
     */
    public int getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

}
