package com.example.user.userloginupdate.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class AddLeadResponse implements Parcelable{


    /**
     * ClientId : 00000000-0000-0000-0000-000000000000
     * UserId : 85b2b2c6-ad48-4218-89ee-95e7bb457b03
     * Username : null
     * FirstName : Raoul
     * MiddleName : S
     * LastName : Jadhav
     * ContactNo1 : 5412147875
     * LocationId : null
     * AreaId : e783080e-ae29-4e3e-8a7c-0e209c37a219
     * AreaName : null
     * OTP : 7428
     * Flag : false
     * IsDeleted : false
     * AreaList : null
     * UserList : null
     */

    private String ClientId;
    private String UserId;
    private Object Username;
    private String FirstName;
    private String MiddleName;
    private String LastName;
    private String ContactNo1;
    private Object LocationId;
    private String AreaId;
    private Object AreaName;
    private int OTP;
    private boolean Flag;
    private boolean IsDeleted;
    private Object AreaList;
    private Object UserList;

    protected AddLeadResponse(Parcel in) {
        ClientId = in.readString();
        UserId = in.readString();
        FirstName = in.readString();
        MiddleName = in.readString();
        LastName = in.readString();
        ContactNo1 = in.readString();
        AreaId = in.readString();
        OTP = in.readInt();
        Flag = in.readByte() != 0;
        IsDeleted = in.readByte() != 0;
    }

    public static final Creator<AddLeadResponse> CREATOR = new Creator<AddLeadResponse>() {
        @Override
        public AddLeadResponse createFromParcel(Parcel in) {
            return new AddLeadResponse(in);
        }

        @Override
        public AddLeadResponse[] newArray(int size) {
            return new AddLeadResponse[size];
        }
    };

    public String getClientId() {
        return ClientId;
    }

    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public Object getUsername() {
        return Username;
    }

    public void setUsername(Object Username) {
        this.Username = Username;
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

    public Object getLocationId() {
        return LocationId;
    }

    public void setLocationId(Object LocationId) {
        this.LocationId = LocationId;
    }

    public String getAreaId() {
        return AreaId;
    }

    public void setAreaId(String AreaId) {
        this.AreaId = AreaId;
    }

    public Object getAreaName() {
        return AreaName;
    }

    public void setAreaName(Object AreaName) {
        this.AreaName = AreaName;
    }

    public int getOTP() {
        return OTP;
    }

    public void setOTP(int OTP) {
        this.OTP = OTP;
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

    public Object getAreaList() {
        return AreaList;
    }

    public void setAreaList(Object AreaList) {
        this.AreaList = AreaList;
    }

    public Object getUserList() {
        return UserList;
    }

    public void setUserList(Object UserList) {
        this.UserList = UserList;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(ClientId);
        dest.writeString(UserId);
        dest.writeString(FirstName);
        dest.writeString(MiddleName);
        dest.writeString(LastName);
        dest.writeString(ContactNo1);
        dest.writeString(AreaId);
        dest.writeInt(OTP);
        dest.writeByte((byte) (Flag ? 1 : 0));
        dest.writeByte((byte) (IsDeleted ? 1 : 0));
    }
}
