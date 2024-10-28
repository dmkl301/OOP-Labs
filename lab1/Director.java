package lab1;

public class Director {
    private String name;
    private String surname;
    private Date birthdate;

    public Director() {
    }

    public Director(String name, String surName, Date birthDate) {
        this.name = name;
        this.surname = surName;
        this.birthdate = birthDate;
    }

    public void printInfo() {
        System.out.printf("Director info name: %s, surname %s%n", name, surname);
        System.out.println("Director birthadate: ");
        birthdate.printInfo();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return birthdate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthdate = birthDate;
    }
}
