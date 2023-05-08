package builder;

import entity.Customer;

import java.time.LocalDate;

public interface ICustomerBuilder {
    ICustomerBuilder name(String name);
    ICustomerBuilder phone(String phone);
    ICustomerBuilder password(String password);
    ICustomerBuilder birthday(LocalDate birthday);
    ICustomerBuilder address(String address);
    ICustomerBuilder email(String email);
    ICustomerBuilder wallet(long wallet);
    Customer build();
}
