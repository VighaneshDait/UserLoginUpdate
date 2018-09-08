package com.example.user.userloginupdate.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class AddEmployeeRequest implements Parcelable{

    /**
     * UserId : fece3ba8-7876-43cc-82f8-da7fb8487e90
     * UserTypeId : 71b786ba-5eaa-4e6d-9aaf-469f78b4fcbd
     * UserType : Employee
     * Username : Raoul.Jadhav
     * Password : null
     * DepartmentId : 00000000-0000-0000-0000-000000000000
     * DepartmentName : Real Estate
     * FirstName : Raoul
     * MiddleName : null
     * LastName : null
     * ContactNo1 : null
     * ContactNo2 : null
     * Email : null
     * Address : null
     * AreaId : e783080e-ae29-4e3e-8a7c-0e209c37a219
     * Latitude : null
     * Longitude : null
     * WeekOffId : null
     * OTP : null
     * OTPDT : null
     * BatteryPer : null
     * CreatedBy : null
     * CreatedDT : null
     * Flag : true
     * IsDeleted : false
     * ReportingHead : null
     * ReportingHeadList : null
     * UserTypeList : null
     * DepartmentList : null
     * AreaList : null
     * WeekOffList : null
     */

    private String UserId;
    private String UserTypeId;
    private String UserType;
    private String Username;
    private Object Password;
    private String DepartmentId;
    private String DepartmentName;
    private String FirstName;
    private Object MiddleName;
    private Object LastName;
    private Object ContactNo1;
    private Object ContactNo2;
    private Object Email;
    private Object Address;
    private String AreaId;
    private Object Latitude;
    private Object Longitude;
    private Object WeekOffId;
    private Object OTP;
    private Object OTPDT;
    private Object BatteryPer;
    private Object CreatedBy;
    private Object CreatedDT;
    private boolean Flag;
    private boolean IsDeleted;
    private Object ReportingHead;
    private Object ReportingHeadList;
    private Object UserTypeList;
    private Object DepartmentList;
    private Object AreaList;
    private Object WeekOffList;

    protected AddEmployeeRequest(Parcel in) {
        UserId = in.readString();
        UserTypeId = in.readString();
        UserType = in.readString();
        Username = in.readString();
        DepartmentId = in.readString();
        DepartmentName = in.readString();
        FirstName = in.readString();
        AreaId = in.readString();
        Flag = in.readByte() != 0;
        IsDeleted = in.readByte() != 0;
    }


    public static final Creator<AddEmployeeRequest> CREATOR = new Creator<AddEmployeeRequest>() {
        @Override
        public AddEmployeeRequest createFromParcel(Parcel in) {
            return new AddEmployeeRequest(in);
        }

        @Override
        public AddEmployeeRequest[] newArray(int size) {
            return new AddEmployeeRequest[size];
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

    public Object getPassword() {
        return Password;
    }

    public void setPassword(Object Password) {
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

    public Object getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(Object MiddleName) {
        this.MiddleName = MiddleName;
    }

    public Object getLastName() {
        return LastName;
    }

    public void setLastName(Object LastName) {
        this.LastName = LastName;
    }

    public Object getContactNo1() {
        return ContactNo1;
    }

    public void setContactNo1(Object ContactNo1) {
        this.ContactNo1 = ContactNo1;
    }

    public Object getContactNo2() {
        return ContactNo2;
    }

    public void setContactNo2(Object ContactNo2) {
        this.ContactNo2 = ContactNo2;
    }

    public Object getEmail() {
        return Email;
    }

    public void setEmail(Object Email) {
        this.Email = Email;
    }

    public Object getAddress() {
        return Address;
    }

    public void setAddress(Object Address) {
        this.Address = Address;
    }

    public String getAreaId() {
        return AreaId;
    }

    public void setAreaId(String AreaId) {
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

    public Object getOTP() {
        return OTP;
    }

    public void setOTP(Object OTP) {
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

    public Object getReportingHead() {
        return ReportingHead;
    }

    public void setReportingHead(Object ReportingHead) {
        this.ReportingHead = ReportingHead;
    }

    public Object getReportingHeadList() {
        return ReportingHeadList;
    }

    public void setReportingHeadList(Object ReportingHeadList) {
        this.ReportingHeadList = ReportingHeadList;
    }

    public Object getUserTypeList() {
        return UserTypeList;
    }

    public void setUserTypeList(Object UserTypeList) {
        this.UserTypeList = UserTypeList;
    }

    public Object getDepartmentList() {
        return DepartmentList;
    }

    public void setDepartmentList(Object DepartmentList) {
        this.DepartmentList = DepartmentList;
    }

    public Object getAreaList() {
        return AreaList;
    }

    public void setAreaList(Object AreaList) {
        this.AreaList = AreaList;
    }

    public Object getWeekOffList() {
        return WeekOffList;
    }

    public void setWeekOffList(Object WeekOffList) {
        this.WeekOffList = WeekOffList;
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
        dest.writeString(AreaId);
        dest.writeByte((byte) (Flag ? 1 : 0));
        dest.writeByte((byte) (IsDeleted ? 1 : 0));
    }

}
