package com.example.user.userloginupdate.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class DeleteLead implements Parcelable{


    /**
     * ClientId : b69c20f6-728d-4f8f-9817-04e395276773
     * UserId : 6c46b730-a3ce-434b-b6e2-efdfc0af76f6
     * Username : null
     * FirstName : Salman KhannaAAA
     * MiddleName : null
     * LastName : KhannaaAAA
     * ContactNo1 : 8558855855
     * LocationId : null
     * AreaId : null
     * AreaName : null
     * OTP : 0
     * Flag : true
     * IsDeleted : false
     * AreaList : null
     * UserList : null
     */

    private String ClientId;
    private String UserId;
    private Object Username;
    private String FirstName;
    private Object MiddleName;
    private String LastName;
    private String ContactNo1;
    private Object LocationId;
    private Object AreaId;
    private Object AreaName;
    private int OTP;
    private boolean Flag;
    private boolean IsDeleted;
    private Object AreaList;
    private Object UserList;

    protected DeleteLead(Parcel in) {
        ClientId = in.readString();
        UserId = in.readString();
        FirstName = in.readString();
        LastName = in.readString();
        ContactNo1 = in.readString();
        OTP = in.readInt();
        Flag = in.readByte() != 0;
        IsDeleted = in.readByte() != 0;
    }

    public static final Creator<DeleteLead> CREATOR = new Creator<DeleteLead>() {
        @Override
        public DeleteLead createFromParcel(Parcel in) {
            return new DeleteLead(in);
        }

        @Override
        public DeleteLead[] newArray(int size) {
            return new DeleteLead[size];
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

    public Object getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(Object MiddleName) {
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

    public Object getAreaId() {
        return AreaId;
    }

    public void setAreaId(Object AreaId) {
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
        dest.writeString(LastName);
        dest.writeString(ContactNo1);
        dest.writeInt(OTP);
        dest.writeByte((byte) (Flag ? 1 : 0));
        dest.writeByte((byte) (IsDeleted ? 1 : 0));
    }

    @Override
    public String toString() {
        return "DeleteLead{" +
                "ClientId='" + ClientId + '\'' +
                ", UserId='" + UserId + '\'' +
                ", Username=" + Username +
                ", FirstName='" + FirstName + '\'' +
                ", MiddleName=" + MiddleName +
                ", LastName='" + LastName + '\'' +
                ", ContactNo1='" + ContactNo1 + '\'' +
                ", LocationId=" + LocationId +
                ", AreaId=" + AreaId +
                ", AreaName=" + AreaName +
                ", OTP=" + OTP +
                ", Flag=" + Flag +
                ", IsDeleted=" + IsDeleted +
                ", AreaList=" + AreaList +
                ", UserList=" + UserList +
                '}';
    }
}
