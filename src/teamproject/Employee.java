package teamproject;

import java.util.Date;

public class Employee extends Person {
    
    private String paymentType;
    
    private Date dateVinculation;

    private Date dismisallDate;

    private Date resignation;

    private String internalId;

    private double deductions;

    private Date disabilityEntry;

    private int incapacityDays;

    private int disalibityId;

    private String entryTime;

    private String departureTime;
    
    private Position positionEmployee;
    
////    private Incapacity[] incapacityList = new Incapacity[10];
//    private Workday[] workdayList = new Workday[10];
//
//    private Deductions[] deductionsList = new Deductions[10];
    public Employee() {
        this.dateVinculation = null;
        this.dismisallDate = null;
        this.resignation = null;
        this.internalId = null;
        this.deductions = 0.0;
        this.disabilityEntry = null;
        this.incapacityDays = 0;
        this.disalibityId = 0;
        this.entryTime = " ";
        this.departureTime = " ";
        this.paymentType = " ";        
        this.positionEmployee= null;
    }
    public Employee(String paymentType, Date dateVinculation, Date dismisallDate, Date resignation, String internalId, double deductions, Date disabilityEntry, int incapacityDays, int disalibityId, String entryTime, String departureTime, Position positionEmployee) {       
        this.paymentType = paymentType;
        this.dateVinculation = dateVinculation;
        this.dismisallDate = dismisallDate;
        this.resignation = resignation;
        this.internalId = internalId;
        this.deductions = deductions;
        this.disabilityEntry = disabilityEntry;
        this.incapacityDays = incapacityDays;
        this.disalibityId = disalibityId;
        this.entryTime = entryTime;
        this.departureTime = departureTime;
        this.positionEmployee = positionEmployee;
    }

    /**
     * @return the paymentType
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * @param paymentType the paymentType to set
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

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

    /**
     * @return the entryTime
     */
    public String getEntryTime() {
        return entryTime;
    }

    /**
     * @param entryTime the entryTime to set
     */
    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    /**
     * @return the departureTime
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * @param departureTime the departureTime to set
     */
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    /**
     * @return the positionEmployee
     */
    public Position getPositionEmployee() {
        return positionEmployee;
    }

    /**
     * @param positionEmployee the positionEmployee to set
     */
    public void setPositionEmployee(Position positionEmployee) {
        this.positionEmployee = positionEmployee;
    }

    
}
