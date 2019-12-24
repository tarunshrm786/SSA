package com.example.mynavapp;

public class SaveData {

    String instituteName,Contact,Address,District,State,Pincode,Guards ;

    public SaveData(String instituteName, String contact, String address, String district, String state, String pincode, String guards) {
        this.instituteName = instituteName;
        Contact = contact;
        Address = address;
        District = district;
        State = state;
        Pincode = pincode;
        Guards = guards;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getPincode() {
        return Pincode;
    }

    public void setPincode(String pincode) {
        Pincode = pincode;
    }

    public String getGuards() {
        return Guards;
    }

    public void setGuards(String guards) {
        Guards = guards;
    }
}
