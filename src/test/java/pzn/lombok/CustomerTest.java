package pzn.lombok;

import org.junit.jupiter.api.Test;
import pzn.lombok.entity.Customer;

public class CustomerTest {
    @Test
    void testCustomer() {

        Customer customer = new Customer();
        customer.setId("1234");
        customer.setName("Addien");

        System.out.println(customer.getId());
        System.out.println(customer.getName());
    }
}
