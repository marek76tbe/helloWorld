package be.abis.exercise.model;

public class Company {

    private String Name;
    private String telephoneNumber;
    private String vatNr;
    private Address address;

    public Company() {
    }

    public Company(String name, String telephoneNumber, String vatNr, Address address) {
        Name = name;
        this.telephoneNumber = telephoneNumber;
        this.vatNr = vatNr;
        this.address = address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getVatNr() {
        return vatNr;
    }

    public void setVatNr(String vatNr) {
        this.vatNr = vatNr;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
