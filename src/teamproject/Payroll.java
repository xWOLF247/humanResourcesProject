package teamproject;
import java.util.Date;

public class Payroll {

    public Payroll() {
    }

    public Payroll(Date paymentDate) {
        this.paymentDate = paymentDate;
    }


    private Date paymentDate;

    public void printPayroll() {
        
    }

    public void calculatePayment() {
    }

    public void contract() {
    }

    public void dismiss() {
    }

    public void editEmployee() {
    }

    public void calculateBenefits() {
    }

    public void netSalary() {
    }

    public void salary() {
    }

    /**
     * @return the paymentDate
     */
    public Date getPaymentDate() {
        return paymentDate;
    }

    /**
     * @param paymentDate the paymentDate to set
     */
    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
}
