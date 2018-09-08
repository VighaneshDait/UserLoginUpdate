package com.example.user.userloginupdate.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class AddLeadTransfer implements Parcelable{


    /**
     * TransferId : 1c6908ef-1b35-48ef-8fb4-44069715ad4d
     * FromUserId : 85b2b2c6-ad48-4218-89ee-95e7bb457b03
     * ToUserId : 7b84e2a1-084c-41c9-b077-0ee3a47780b2
     * Remark : null
     * Username : Thanos.STARK28
     * ClientId : e87dea2e-60c1-4301-9bde-4a8070ad6c20
     * ClientName : Dr Manhatten
     * CreatedDT : 2018-09-01T13:12:20.373
     * UserList : null
     * ClientList : null
     * IsDeleted : false
     */

    private String TransferId;
    private String FromUserId;
    private String ToUserId;
    private Object Remark;
    private String Username;
    private String ClientId;
    private String ClientName;
    private String CreatedDT;
    private Object UserList;
    private Object ClientList;
    private boolean IsDeleted;

    protected AddLeadTransfer(Parcel in) {
        TransferId = in.readString();
        FromUserId = in.readString();
        ToUserId = in.readString();
        Username = in.readString();
        ClientId = in.readString();
        ClientName = in.readString();
        CreatedDT = in.readString();
        IsDeleted = in.readByte() != 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(TransferId);
        dest.writeString(FromUserId);
        dest.writeString(ToUserId);
        dest.writeString(Username);
        dest.writeString(ClientId);
        dest.writeString(ClientName);
        dest.writeString(CreatedDT);
        dest.writeByte((byte) (IsDeleted ? 1 : 0));
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<AddLeadTransfer> CREATOR = new Creator<AddLeadTransfer>() {
        @Override
        public AddLeadTransfer createFromParcel(Parcel in) {
            return new AddLeadTransfer(in);
        }

        @Override
        public AddLeadTransfer[] newArray(int size) {
            return new AddLeadTransfer[size];
        }
    };

    public String getTransferId() {
        return TransferId;
    }

    public void setTransferId(String TransferId) {
        this.TransferId = TransferId;
    }

    public String getFromUserId() {
        return FromUserId;
    }

    public void setFromUserId(String FromUserId) {
        this.FromUserId = FromUserId;
    }

    public String getToUserId() {
        return ToUserId;
    }

    public void setToUserId(String ToUserId) {
        this.ToUserId = ToUserId;
    }

    public Object getRemark() {
        return Remark;
    }

    public void setRemark(Object Remark) {
        this.Remark = Remark;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getClientId() {
        return ClientId;
    }

    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    public String getClientName() {
        return ClientName;
    }

    public void setClientName(String ClientName) {
        this.ClientName = ClientName;
    }

    public String getCreatedDT() {
        return CreatedDT;
    }

    public void setCreatedDT(String CreatedDT) {
        this.CreatedDT = CreatedDT;
    }

    public Object getUserList() {
        return UserList;
    }

    public void setUserList(Object UserList) {
        this.UserList = UserList;
    }

    public Object getClientList() {
        return ClientList;
    }

    public void setClientList(Object ClientList) {
        this.ClientList = ClientList;
    }

    public boolean isIsDeleted() {
        return IsDeleted;
    }

    public void setIsDeleted(boolean IsDeleted) {
        this.IsDeleted = IsDeleted;
    }

    @Override
    public String toString() {
        return "AddLeadTransfer{" +
                "TransferId='" + TransferId + '\'' +
                ", FromUserId='" + FromUserId + '\'' +
                ", ToUserId='" + ToUserId + '\'' +
                ", Remark=" + Remark +
                ", Username='" + Username + '\'' +
                ", ClientId='" + ClientId + '\'' +
                ", ClientName='" + ClientName + '\'' +
                ", CreatedDT='" + CreatedDT + '\'' +
                ", UserList=" + UserList +
                ", ClientList=" + ClientList +
                ", IsDeleted=" + IsDeleted +
                '}';
    }
}
