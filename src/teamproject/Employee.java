package teamproject;
import java.util.Date;

public class Employee extends Person {

    public Employee() {
        this.dateVinculation = null;
        this.dismisallDate = null;
        this.resignation = null;
        this.internalId = null;
        this.deductions = 0.0;
    }
    
    
    public Employee(Date dateVinculation, Date dismisallDate, Date resignation, String internalId, double deductions) {
        this.dateVinculation = dateVinculation;
        this.dismisallDate = dismisallDate;
        this.resignation = resignation;
        this.internalId = internalId;
        this.deductions = deductions;
    }
    
    private Date dateVinculation;

    private Date dismisallDate;

    private Date resignation;

    private String internalId;

    private double deductions;

    private Incapacity [] incapacityList = new Incapacity[10];

    private Workday [] workdayList = new Workday[10];

    private Deductions [] deductionsList = new Deductions[10];

    /**
     * @return the dateVinculation
     */
    public Date getDateVinculation() {
        return dateVinculation;
    }

    /**
     * @param dateVinculation the dateVinculation to set
     */
    public void setDateVinculation(Date dateVinculation) {
        this.dateVinculation = dateVinculation;
    }

    /**
     * @return the dismisallDate
     */
    public Date getDismisallDate() {
        return dismisallDate;
    }

    /**
     * @param dismisallDate the dismisallDate to set
     */
    public void setDismisallDate(Date dismisallDate) {
        this.dismisallDate = dismisallDate;
    }

    /**
     * @return the resignation
     */
    public Date getResignation() {
        return resignation;
    }

    /**
     * @param resignation the resignation to set
     */
    public void setResignation(Date resignation) {
        this.resignation = resignation;
    }

    /**
     * @return the internalId
     */
    public String getInternalId() {
        return internalId;
    }

    /**
     * @param internalId the internalId to set
     */
    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }

    /**
     * @return the deductions
     */
    public double getDeductions() {
        return deductions;
    }

    /**
     * @param deductions the deductions to set
     */
    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    /**
     * @return the incapacityList
     */
    public Incapacity[] getIncapacityList() {
        return incapacityList;
    }

    /**
     * @param incapacityList the incapacityList to set
     */
    public void setIncapacityList(Incapacity[] incapacityList) {
        this.incapacityList = incapacityList;
    }

    /**
     * @return the workdayList
     */
    public Workday[] getWorkdayList() {
        return workdayList;
    }

    /**
     * @param workdayList the workdayList to set
     */
    public void setWorkdayList(Workday[] workdayList) {
        this.workdayList = workdayList;
    }

    /**
     * @return the deductionsList
     */
    public Deductions[] getDeductionsList() {
        return deductionsList;
    }

    /**
     * @param deductionsList the deductionsList to set
     */
    public void setDeductionsList(Deductions[] deductionsList) {
        this.deductionsList = deductionsList;
    }

    void getFirstName(String fName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
