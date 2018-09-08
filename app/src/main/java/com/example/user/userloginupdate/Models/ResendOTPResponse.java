package com.example.user.userloginupdate.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class ResendOTPResponse implements Parcelable{

    /**
     * UserId : 41d10c8e-b5a0-478a-aecb-5ee316d1860d
     * UserTypeId : 71b786ba-5eaa-4e6d-9aaf-469f78b4fcbd
     * UserType : Employee
     * Username : MAX.Petra
     * Password : e39f1bfc21dba9eb230104628176ae26
     * DepartmentId : ee11d711-42ca-4131-92d8-9c975a0a6788
     * DepartmentName : Real Estate
     * FirstName : MAX
     * MiddleName : w
     * LastName : Petra
     * ContactNo1 : 9561885596
     * ContactNo2 : 9872582287
     * Email : raoul@gmail.com
     * Address : Winterfell
     * AreaId : null
     * Latitude : null
     * Longitude : null
     * WeekOffId : null
     * OTP : 2661
     * OTPDT : null
     * BatteryPer : null
     * CreatedBy : null
     * CreatedDT : null
     * Flag : true
     * IsDeleted : false
     */

    private String UserId;
    private String UserTypeId;
    private String UserType;
    private String Username;
    private String Password;
    private String DepartmentId;
    private String DepartmentName;
    private String FirstName;
    private String MiddleName;
    private String LastName;
    private String ContactNo1;
    private String ContactNo2;
    private String Email;
    private String Address;
    private Object AreaId;
    private Object Latitude;
    private Object Longitude;
    private Object WeekOffId;
    private String OTP;
    private Object OTPDT;
    private Object BatteryPer;
    private Object CreatedBy;
    private Object CreatedDT;
    private boolean Flag;
    private boolean IsDeleted;

    protected ResendOTPResponse(Parcel in) {
        UserId = in.readString();
        UserTypeId = in.readString();
        UserType = in.readString();
        Username = in.readString();
        Password = in.readString();
        DepartmentId = in.readString();
        DepartmentName = in.readString();
        FirstName = in.readString();
        MiddleName = in.readString();
        LastName = in.readString();
        ContactNo1 = in.readString();
        ContactNo2 = in.readString();
        Email = in.readString();
        Address = in.readString();
        OTP = in.readString();
        Flag = in.readByte() != 0;
        IsDeleted = in.readByte() != 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(UserId);
        dest.writeString(UserTypeId);
        dest.writeString(UserType);
        dest.writeString(Username);
        dest.writeString(Password);
        dest.writeString(DepartmentId);
        dest.writeString(DepartmentName);
        dest.writeString(FirstName);
        dest.writeString(MiddleName);
        dest.writeString(LastName);
        dest.writeString(ContactNo1);
        dest.writeString(ContactNo2);
        dest.writeString(Email);
        dest.writeString(Address);
        dest.writeString(OTP);
        dest.writeByte((byte) (Flag ? 1 : 0));
        dest.writeByte((byte) (IsDeleted ? 1 : 0));
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ResendOTPResponse> CREATOR = new Creator<ResendOTPResponse>() {
        @Override
        public ResendOTPResponse createFromParcel(Parcel in) {
            return new ResendOTPResponse(in);
        }

        @Override
        public ResendOTPResponse[] newArray(int size) {
            return new ResendOTPResponse[size];
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

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
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

    public Object getAreaId() {
        return AreaId;
    }

    public void setAreaId(Object AreaId) {
        this.AreaId = AreaId;
    }

    public Object getLatitude() {
        return Latitude;
    }

    public void setLatitude(Object Latitude) {
        this.Latitude = Latitude;
    }

    public Object getLongitude() {
        return Longitude;
    }

    public void setLongitude(Object Longitude) {
        this.Longitude = Longitude;
    }

    public Object getWeekOffId() {
        return WeekOffId;
    }

    public void setWeekOffId(Object WeekOffId) {
        this.WeekOffId = WeekOffId;
    }

    public String getOTP() {
        return OTP;
    }

    public void setOTP(String OTP) {
        this.OTP = OTP;
    }

    public Object getOTPDT() {
        return OTPDT;
    }

    public void setOTPDT(Object OTPDT) {
        this.OTPDT = OTPDT;
    }

    public Object getBatteryPer() {
        return BatteryPer;
    }

    public void setBatteryPer(Object BatteryPer) {
        this.BatteryPer = BatteryPer;
    }

    public Object getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(Object CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    public Object getCreatedDT() {
        return CreatedDT;
    }

    public void setCreatedDT(Object CreatedDT) {
        this.CreatedDT = CreatedDT;
    }

    public boolean isFlag() {
        return Flag;
    }

    public void setFlag(boolean Flag) {
        this.Flag = Flag;
    }

    public boolean isIsDeleted() {
        return IsDeleted;
    }

    public void setIsDeleted(boolean IsDeleted) {
        this.IsDeleted = IsDeleted;
    }
}
