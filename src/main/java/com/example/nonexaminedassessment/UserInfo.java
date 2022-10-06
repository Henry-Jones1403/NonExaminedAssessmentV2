package com.example.nonexaminedassessment;

public class UserInfo {
    int UserID;
    String FirstName;
    String LastName;
    String Email;
    String Phone;
    String Postcode;
    int HouseNumber;
    String Street;

    public UserInfo(int userID, String firstName,String LastName, String email, String phone, String postcode, int houseNumber, String street) {
        UserID = userID;
        FirstName = firstName;
        LastName = LastName;
        Email = email;
        Phone = phone;
        Postcode = postcode;
        HouseNumber = houseNumber;
        Street = street;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getPostcode() {
        return Postcode;
    }

    public void setPostcode(String postcode) {
        Postcode = postcode;
    }

    public int getHouseNumber() {
        return HouseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        HouseNumber = houseNumber;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "UserID=" + UserID +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName+ '\'' +
                ", Email='" + Email + '\'' +
                ", Phone=" + Phone +
                ", Postcode='" + Postcode + '\'' +
                ", HouseNumber=" + HouseNumber +
                ", Street='" + Street + '\'' +
                '}';
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
