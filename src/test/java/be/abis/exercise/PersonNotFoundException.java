package be.abis.exercise;

public class PersonNotFoundException extends Throwable {
    public PersonNotFoundException(String not_found) {
        System.out.println(not_found);
    }
}
