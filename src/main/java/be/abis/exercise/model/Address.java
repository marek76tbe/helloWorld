package be.abis.exercise.model;

public class Address {
    private String street;
    private int nr;
    private String ZipCode;
    private String Town;

    public Address() {
    }

    public Address(String street, int nr, String zipCode, String town) {
        this.street = street;
        this.nr = nr;
        ZipCode = zipCode;
        Town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String zipCode) {
        ZipCode = zipCode;
    }

    public String getTown() {
        return Town;
    }

    public void setTown(String town) {
        Town = town;
    }
}
