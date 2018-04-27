import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        ArrayList<Order> orderList = new ArrayList<Order>();
        ManagerofSystem.ReadFile(customerList,orderList);
    }
}
