package springintro;

public class MySQLCustomerDal implements ICustomerDal{

    @Override
    public void add() {
        System.out.println("mysql veri tabanına eklendi");
    }
}
