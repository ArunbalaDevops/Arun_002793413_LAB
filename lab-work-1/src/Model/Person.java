/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Model;

/**
 *
 * @author Arun
 */
public class Person {

    String nuid;
    String firstName;
    String lastName;
    String collegeName;

    Address permanentAddress;
    Address currentAddress;

    Contact personalContact;
    Contact officeContact;

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public Address getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(Address currentAddress) {
        this.currentAddress = currentAddress;
    }

    public Contact getPersonalContact() {
        return personalContact;
    }

    public void setPersonalContact(Contact personalContact) {
        this.personalContact = personalContact;
    }

    public Contact getOfficeContact() {
        return officeContact;
    }

    public void setOfficeContact(Contact officeContact) {
        this.officeContact = officeContact;
    }

    public String getNuid() {
        return nuid;
    }

    public void setNuid(String nuid) {
        this.nuid = nuid;
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

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.collegeName = "";
        this.nuid = " ";
        
        this.permanentAddress = new Address();
        this.currentAddress = new Address();
        
        this.personalContact = new Contact();
        this.officeContact = new Contact();

    }

    public static void main(String args[]) {
        Person obj = new Person();

        obj.setFirstName("Arun");
        obj.setLastName("Balasubramanian");
        obj.setCollegeName("COE");
        obj.setNuid("3413");

    }

}
