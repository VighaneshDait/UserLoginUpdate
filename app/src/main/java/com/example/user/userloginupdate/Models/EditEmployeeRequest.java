package com.example.user.userloginupdate.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class EditEmployeeRequest implements Parcelable{


    /**
     * UserId : fece3ba8-7876-43cc-82f8-da7fb8487e90
     * UserTypeId : 71b786ba-5eaa-4e6d-9aaf-469f78b4fcbd
     * UserType : Employee
     * Username : Raoul.Jadhav
     * Password : 161d403c3e93c5f4bd2e171a07ca5628
     * DepartmentId : ee11d711-42ca-4131-92d8-9c975a0a6788
     * DepartmentName : Real Estate
     * FirstName : Raoul
     * MiddleName : S
     * LastName : Jadhav
     * ContactNo1 : 5412147875
     * ContactNo2 : 9872582287
     * Email : rahul.jadhav@nimbustech.in
     * Address : Mumbai
     * AreaId : e783080e-ae29-4e3e-8a7c-0e209c37a219
     * Latitude : null
     * Longitude : null
     * WeekOffId : a0148fd0-3899-43a4-bbaf-280bc4f56aa8
     * OTP : null
     * OTPDT : null
     * BatteryPer : null
     * CreatedBy : null
     * CreatedDT : null
     * Flag : true
     * IsDeleted : false
     * DeviceId : null
     * ReportingHead : 53005df9-1d67-4ff3-859b-0148370c250f
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
    private String AreaId;
    private Object Latitude;
    private Object Longitude;
    private String WeekOffId;
    private Object OTP;
    private Object OTPDT;
    private Object BatteryPer;
    private Object CreatedBy;
    private Object CreatedDT;
    private boolean Flag;
    private boolean IsDeleted;
    private Object DeviceId;
    private String ReportingHead;
    private Object ReportingHeadList;
    private Object UserTypeList;
    private Object DepartmentList;
    private Object AreaList;
    private Object WeekOffList;

    protected EditEmployeeRequest(Parcel in) {
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
        AreaId = in.readString();
        WeekOffId = in.readString();
        Flag = in.readByte() != 0;
        IsDeleted = in.readByte() != 0;
        ReportingHead = in.readString();
    }

    public static final Creator<EditEmployeeRequest> CREATOR = new Creator<EditEmployeeRequest>() {
        @Override
        public EditEmployeeRequest createFromParcel(Parcel in) {
            return new EditEmployeeRequest(in);
        }

        @Override
        public EditEmployeeRequest[] newArray(int size) {
            return new EditEmployeeRequest[size];
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

    public String getWeekOffId() {
        return WeekOffId;
    }

    public void setWeekOffId(String WeekOffId) {
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

    public Object getDeviceId() {
        return DeviceId;
    }

    public void setDeviceId(Object DeviceId) {
        this.DeviceId = DeviceId;
    }

    public String getReportingHead() {
        return ReportingHead;
    }

    public void setReportingHead(String ReportingHead) {
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
        dest.writeString(AreaId);
        dest.writeString(WeekOffId);
        dest.writeByte((byte) (Flag ? 1 : 0));
        dest.writeByte((byte) (IsDeleted ? 1 : 0));
        dest.writeString(ReportingHead);
    }
}
