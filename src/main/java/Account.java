public class Account {
    private String customerCode;
    private String customerName;
    private int accNumber;
    private long amount;

    public Account() {
    }

    public Account(String customerCode, String customerName, int accNumber, long amount) {
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.accNumber = accNumber;
        this.amount = amount;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String toString() {
        return "Account{" + "customerCode=" + customerCode + ", customerName=" + customerName + ", accNumber=" + accNumber + ", amount=" + amount + '}';
    }
}
