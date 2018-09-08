package com.example.user.userloginupdate.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class UserLoginResponse implements Parcelable{


    /**
     * UserId : 41d10c8e-b5a0-478a-aecb-5ee316d1860d
     * UserTypeId : 71b786ba-5eaa-4e6d-9aaf-469f78b4fcbd
     * UserType : Employee
     * Username : MAX.Petra
     * DepartmentId : ee11d711-42ca-4131-92d8-9c975a0a6788
     * DepartmentName : Real Estate
     * FirstName : MAX
     * MiddleName : w
     * LastName : Petra
     * ContactNo1 : 9561885596
     * ContactNo2 : 9872582287
     * Email : raoul@gmail.com
     * Address : Winterfell
     * AuthToken : 587d2f3ba509446a78bdaad67e8b9190
     * OTP : 1149
     */

    private String UserId;
    private String UserTypeId;
    private String UserType;
    private String Username;
    private String DepartmentId;
    private String DepartmentName;
    private String FirstName;
    private String MiddleName;
    private String LastName;
    private String ContactNo1;
    private String ContactNo2;
    private String Email;
    private String Address;
    private String AuthToken;
    private int OTP;

    protected UserLoginResponse(Parcel in) {
        UserId = in.readString();
        UserTypeId = in.readString();
        UserType = in.readString();
        Username = in.readString();
        DepartmentId = in.readString();
        DepartmentName = in.readString();
        FirstName = in.readString();
        MiddleName = in.readString();
        LastName = in.readString();
        ContactNo1 = in.readString();
        ContactNo2 = in.readString();
        Email = in.readString();
        Address = in.readString();
        AuthToken = in.readString();
        OTP = in.readInt();
    }

    public static final Creator<UserLoginResponse> CREATOR = new Creator<UserLoginResponse>() {
        @Override
        public UserLoginResponse createFromParcel(Parcel in) {
            return new UserLoginResponse(in);
        }

        @Override
        public UserLoginResponse[] newArray(int size) {
            return new UserLoginResponse[size];
        }
    };

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public String getUserTypeId() {
        return UserTypeId;
    }

    public void setUserTypeId(String UserTypeId) {
        this.UserTypeId = UserTypeId;
    }

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getDepartmentId() {
        return DepartmentId;
    }

    public void setDepartmentId(String DepartmentId) {
        this.DepartmentId = DepartmentId;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String DepartmentName) {
        this.DepartmentName = DepartmentName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String MiddleName) {
        this.MiddleName = MiddleName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getContactNo1() {
        return ContactNo1;
    }

    public void setContactNo1(String ContactNo1) {
        this.ContactNo1 = ContactNo1;
    }

    public String getContactNo2() {
        return ContactNo2;
    }

    public void setContactNo2(String ContactNo2) {
        this.ContactNo2 = ContactNo2;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getAuthToken() {
        return AuthToken;
    }

    public void setAuthToken(String AuthToken) {
        this.AuthToken = AuthToken;
    }

    public int getOTP() {
        return OTP;
    }

    public void setOTP(int OTP) {
        this.OTP = OTP;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(UserId);
        dest.writeString(UserTypeId);
        dest.writeString(UserType);
        dest.writeString(Username);
        dest.writeString(DepartmentId);
        dest.writeString(DepartmentName);
        dest.writeString(FirstName);
        dest.writeString(MiddleName);
        dest.writeString(LastName);
        dest.writeString(ContactNo1);
        dest.writeString(ContactNo2);
        dest.writeString(Email);
        dest.writeString(Address);
        dest.writeString(AuthToken);
        dest.writeInt(OTP);
    }
}
