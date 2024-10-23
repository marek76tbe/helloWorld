package be.abis.exercise.model;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private int personID;
    private String firstName;
    private String lastName;

    private LocalDate birthday;
    private String emailAddress;
    private String password;
    private String language;
    private Company company;

    public Person() {
    }

    public Person(int personID, String firstName, String lastName, int age, String emailAddress, String password, String language, Company company) {
        this.personID = personID;
        this.firstName = firstName;
        this.lastName = lastName;
        //this.age = age;

        this.emailAddress = emailAddress;
        this.password = password;
        this.language = language;
        this.company = company;
    }

    public int getPersonId() {
        return personID;
    }

    public void setPersonId(int personID) {
        this.personID = personID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return Period.between(birthday, LocalDate.now() ).getYears();
    }

    public void setBirthday(LocalDate bDayDate) {
        this.birthday = bDayDate;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String sayHello(){
        return "ciao";
    }

    @Override
    public String toString() {
        return firstName + " " +
                lastName + " is " +
                this.getAge() + " years old, speaks " + language.toUpperCase() + " and works for " +
                company.getName() + " in " + company.getAddress().getTown() + ".";
    }

    public String toFullString() {
        return "Person{" +
                "personID=" + personID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + this.getAge() +
                ", emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                ", language='" + language + '\'' +
                ", company=" + company +
                '}';
    }


}
