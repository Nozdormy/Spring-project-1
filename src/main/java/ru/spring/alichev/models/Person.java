package ru.spring.alichev.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Person {

    private int id;
    @NotNull(message = "Name should be not empty")
    @Size(min = 5, max = 50, message = "Name should be between 5 and 50 characters")
    @Pattern(regexp = "[A-Z]\\w+, [A-Z]\\w+",
            message = "Your full name should be in this form: Name, Last name")
    private String fullName;

/*    @NotNull(message = "Year of Birth should be not empty")*/
    @Min(value = 1900, message = "Age should be greater than 0")
    private int yearOfBirth;

    public Person() {
    }

    public Person(String fullName, int yearOfBirth) {
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
