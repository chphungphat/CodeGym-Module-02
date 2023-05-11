package entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    private long wallet;
    private List<Integer> boughtGame;

    public Customer() {}

    public Customer(long wallet) {
        this.wallet = wallet;
    }

    public Customer(String name, String phone, String password, LocalDate birthday, Address address, String email, long wallet, List<Integer> boughtGame) {
        super(name, phone, password, birthday, address, email);
        this.wallet = wallet;
        this.boughtGame = boughtGame;
    }

    public long getWallet() {
        return wallet;
    }

    public void setWallet(long wallet) {
        this.wallet = wallet;
    }

    public List<Integer> getBoughtGame() {
        return boughtGame;
    }

    public void setBoughtGame(List<Integer> boughtGame) {
        this.boughtGame = boughtGame;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "wallet: " + wallet;
    }

    public String[] toArray() {
        return new String[]{name,
                            phone,
                            password,
                            birthday.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                            address.getNumber(),
                            address.getStreet(),
                            address.getWard(),
                            address.getDistrict(),
                            address.getProvince(),
                            address.getCountry(),
                            email,
                            String.valueOf(wallet)};
    }
}
