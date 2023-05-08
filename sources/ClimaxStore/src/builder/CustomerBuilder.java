package builder;

import entity.Customer;

import java.time.LocalDate;

public class CustomerBuilder implements ICustomerBuilder{
    protected int id;
    protected String name;
    protected String phone;
    protected String password;
    protected LocalDate birthday;
    protected String address;
    protected String email;
    protected long wallet;

    @Override
    public ICustomerBuilder id(int id) {
        this.id = id;
        return this;
    }

    @Override
    public ICustomerBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public ICustomerBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public ICustomerBuilder password(String password) {
        this.password = password;
        return this;
    }

    @Override
    public ICustomerBuilder birthday(LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }

    @Override
    public ICustomerBuilder address(String address) {
        this.address = address;
        return this;
    }

    @Override
    public ICustomerBuilder email(String email) {
        this.email = email;
        return this;
    }

    @Override
    public ICustomerBuilder wallet(long wallet) {
        this.wallet = wallet;
        return this;
    }

    @Override
    public Customer build() {
        return new Customer(id, name, phone, password, birthday, address, email, wallet);
    }
}
