package entity;

import java.io.Serializable;

public class Customer extends User {
    private long wallet;
    private Library library;

    public Customer() {}

    public Customer(long wallet, Library library) {
        this.wallet = wallet;
        this.library = library;
    }

    public Customer(int id, String name, String phone, String password, String email, long wallet, Library library) {
        super(id, name, phone, password, email);
        this.wallet = wallet;
        this.library = library;
    }

    public long getWallet() {
        return wallet;
    }

    public void setWallet(long wallet) {
        this.wallet = wallet;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "wallet: " + wallet;
    }
}
