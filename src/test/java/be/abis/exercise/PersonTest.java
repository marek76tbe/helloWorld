package be.abis.exercise;

import be.abis.exercise.model.Address;
import be.abis.exercise.model.Company;
import be.abis.exercise.model.Person;

public class PersonTest {

    public static void main(String[] args) {
        Address a = new Address("Street",2,"2030","Leuven");
        Company c = new Company("Abis","+32 1 232322","BE 774636462", a);
        Person p = new Person(1,"John", "Doe", 35, "j.d@abis.com","HisPassword", "NL", c);

        System.out.println(p.getFirstName() + " " + p.getLastName() + " is " + p.getAge() + " years old and works for " + p.getCompany().getName() + " in " + p.getCompany().getAddress().getTown() + ".");
        System.out.println(p);
    }

}
