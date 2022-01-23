package springintro;

public class Main {
    public static void main(String[] args) {
       CustomerManager manager=new CustomerManager(new MySQLCustomerDal());
        manager.add();
    }
}
