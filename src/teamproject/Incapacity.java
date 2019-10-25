package teamproject;
import java.util.Date;

public class Incapacity {

    public Incapacity() {
    }

    public Incapacity(Date disabilityEntry, int incapacityDays, int disalibityId) {
        this.disabilityEntry = disabilityEntry;
        this.incapacityDays = incapacityDays;
        this.disalibityId = disalibityId;
    }

    private Date disabilityEntry;

    private int incapacityDays;

    private int disalibityId;

    /**
     * @return the disabilityEntry
     */
    public Date getDisabilityEntry() {
        return disabilityEntry;
    }

    /**
     * @param disabilityEntry the disabilityEntry to set
     */
    public void setDisabilityEntry(Date disabilityEntry) {
        this.disabilityEntry = disabilityEntry;
    }

    /**
     * @return the incapacityDays
     */
    public int getIncapacityDays() {
        return incapacityDays;
    }

    /**
     * @param incapacityDays the incapacityDays to set
     */
    public void setIncapacityDays(int incapacityDays) {
        this.incapacityDays = incapacityDays;
    }

    /**
     * @return the disalibityId
     */
    public int getDisalibityId() {
        return disalibityId;
    }

    /**
     * @param disalibityId the disalibityId to set
     */
    public void setDisalibityId(int disalibityId) {
        this.disalibityId = disalibityId;
    }
}
