/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ashis
 */
public class Person {

    String nuid;
    String firstName;
    String lastName;
    String collegeName;
    String phone;
    String emailid;
    Address address;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    public Person(){
        this.firstName = "";
        this.lastName = "";
        this.collegeName = "";
        this.emailid = "";
        this.nuid = " ";
        this.phone = "";
        this.address = new Address();
    }
    
    public static void main(String args[]){
        Person obj = new Person();
        
        obj.setFirstName("Harish");
        obj.setLastName("T");
        obj.setCollegeName("COE");
        obj.setNuid("0027");
        obj.setPhone("6172384207");
        obj.setEmailid("harish_t@neu.com");
        
        
        Address currentaddr = obj.getAddress();
        currentaddr.setStreetName("Horadan Way");
        
        Address permanentaddr = obj.getAddress();
        permanentaddr.setStreetName("Horadan Way");
        
        
        
    }

}
