/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author By Van Lung, IDStudent: SE140193
 */

public class Registration implements Comparable<Registration>{

    String registrationID, fullName, phone, email, address;
    int age, numberOfMember, numberOfChildren, numberOfAdults;
    boolean gender;

    public Registration() {
    }

    
    public Registration(String registrationID, String fullName, String phone, String email, String address, int age, int numberOfMember, int numberOfChildren, int numberOfAdults, boolean gender) {
        this.registrationID = registrationID;
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.age = age;
        this.numberOfMember = numberOfMember;
        this.numberOfChildren = numberOfChildren;
        this.numberOfAdults = numberOfAdults;
        this.gender = gender;
    }

    public String getRegistrationID() {
        return registrationID;
    }

    public void setRegistrationID(String registrationID) {
        this.registrationID = registrationID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfMember() {
        return numberOfMember;
    }

    public void setNumberOfMember(int numberOfMember) {
        this.numberOfMember = numberOfMember;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public int getNumberOfAdults() {
        return numberOfAdults;
    }

    public void setNumberOfAdults(int numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public int compareTo(Registration o) {
        return this.getFullName().compareTo(o.getFullName());
    }
    
    
}
