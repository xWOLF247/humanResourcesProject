package teamproject;

public class Workday {

    public Workday() {
    }

    public Workday(int entryTime, int departureTime) {
        this.entryTime = entryTime;
        this.departureTime = departureTime;
    }

    private int entryTime;

    private int departureTime;

    public void calculateOvertime() {
    }

    /**
     * @return the entryTime
     */
    public int getEntryTime() {
        return entryTime;
    }

    /**
     * @param entryTime the entryTime to set
     */
    public void setEntryTime(int entryTime) {
        this.entryTime = entryTime;
    }

    /**
     * @return the departureTime
     */
    public int getDepartureTime() {
        return departureTime;
    }

    /**
     * @param departureTime the departureTime to set
     */
    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }
}
