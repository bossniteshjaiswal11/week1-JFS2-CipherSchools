interface olaCustomer{
    void bookCab();
    void findRide();
    void rentCab();
    void rateDriver();
    void scheduleCab();
    void cancelCab();
    void addMoneytoWallet();
    void raiseTicket();
    void signup();
    void signIn();
}

interface olaDriver{
    void acceptBooking();
    void getCustomerLocation();
    void setAvailableStatus();
    void getMyCommission();
    void raiseMoneyTransferRequest();
    void callCustomer();
    void setUpYourVehicle();
    void customerFeedback();
}

interface olaOwner{
    void getDriverRecords();
    void getRportByDriverID();
    void getReportByRegion();
    void getTotalRevenue();
    void getCustomersFeedback();
    void addDriver();
    void removeDriver();
    void changeDriverStatus();
}
public class ola implements olaOwner, olaDriver, olaCustomer{
    public static void main(String args[]) {
        olaCustomer cust = new ola();
        olaDriver manoj = new ola();
    }

    @Override
    public void bookCab() {
        // TODO Auto-generated method stub
    }

    @Override
    public void findRide() {
        // TODO Auto-generated method stub
    }

    @Override
    public void rentCab() {
        // TODO Auto-generated method stub
    }

    @Override
    public void rateDriver() {
        // TODO Auto-generated method stub
    }

    @Override
    public void scheduleCab() {
        // TODO Auto-generated method stub
    }

    @Override
    public void cancelCab() {
        // TODO Auto-generated method stub
    }

    @Override
    public void addMoneytoWallet() {
        // TODO Auto-generated method stub
    }

    @Override
    public void raiseTicket() {
        // TODO Auto-generated method stub
    }

    @Override
    public void signup() {
        // TODO Auto-generated method stub
    }

    @Override
    public void signIn() {
        // TODO Auto-generated method stub
    }

    @Override
    public void acceptBooking() {
        // TODO Auto-generated method stub
    }

    @Override
    public void getCustomerLocation() {
        // TODO Auto-generated method stub
    }

    @Override
    public void setAvailableStatus() {
        // TODO Auto-generated method stub
    }

    @Override
    public void getMyCommission() {
        // TODO Auto-generated method stub
    }

    @Override
    public void raiseMoneyTransferRequest() {
        // TODO Auto-generated method stub
    }

    @Override
    public void callCustomer() {
        // TODO Auto-generated method stub
    }

    @Override
    public void setUpYourVehicle() {
        // TODO Auto-generated method stub
    }

    @Override
    public void customerFeedback() {
        // TODO Auto-generated method stub
    }

    @Override
    public void getDriverRecords() {
        // TODO Auto-generated method stub
    }

    @Override
    public void getRportByDriverID() {
        // TODO Auto-generated method stub
    }

    @Override
    public void getReportByRegion() {
        // TODO Auto-generated method stub
    }

    @Override
    public void getTotalRevenue() {
        // TODO Auto-generated method stub
    }

    @Override
    public void getCustomersFeedback() {
        // TODO Auto-generated method stub
    }

    @Override
    public void addDriver() {
        // TODO Auto-generated method stub
    }

    @Override
    public void removeDriver() {
        // TODO Auto-generated method stub
    }

    @Override
    public void changeDriverStatus() {
        // TODO Auto-generated method stub
    }
}

