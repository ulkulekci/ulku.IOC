package springintro;

public class customerManager {
    private ICustomerDal customerDal;
    public void CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public void add() {
        customerDal.add();
    }
}
