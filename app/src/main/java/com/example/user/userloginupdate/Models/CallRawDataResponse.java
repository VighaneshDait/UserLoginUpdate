package com.example.user.userloginupdate.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class CallRawDataResponse implements Parcelable{


    /**
     * RawId : 30fbcbfd-8966-4a24-9671-d3b36b73747f
     * ExcelId : 00000000-0000-0000-0000-000000000000
     * ClientName : Salman Khanna
     * ContactNo : 3654168741
     * AssignTo : 41d10c8e-b5a0-478a-aecb-5ee316d1860d
     * Flag : false
     * IsDeleted : false
     * AreaId : e783080e-ae29-4e3e-8a7c-0e209c37a219
     * AreaName : Bombay
     * CallDone : false
     */

    private String RawId;
    private String ExcelId;
    private String ClientName;
    private String ContactNo;
    private String AssignTo;
    private boolean Flag;
    private boolean IsDeleted;
    private String AreaId;
    private String AreaName;
    private boolean CallDone;

    protected CallRawDataResponse(Parcel in) {
        RawId = in.readString();
        ExcelId = in.readString();
        ClientName = in.readString();
        ContactNo = in.readString();
        AssignTo = in.readString();
        Flag = in.readByte() != 0;
        IsDeleted = in.readByte() != 0;
        AreaId = in.readString();
        AreaName = in.readString();
        CallDone = in.readByte() != 0;
    }

    public static final Creator<CallRawDataResponse> CREATOR = new Creator<CallRawDataResponse>() {
        @Override
        public CallRawDataResponse createFromParcel(Parcel in) {
            return new CallRawDataResponse(in);
        }

        @Override
        public CallRawDataResponse[] newArray(int size) {
            return new CallRawDataResponse[size];
        }
    };

    public String getRawId() {
        return RawId;
    }

    public void setRawId(String RawId) {
        this.RawId = RawId;
    }

    public String getExcelId() {
        return ExcelId;
    }

    public void setExcelId(String ExcelId) {
        this.ExcelId = ExcelId;
    }

    public String getClientName() {
        return ClientName;
    }

    public void setClientName(String ClientName) {
        this.ClientName = ClientName;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String ContactNo) {
        this.ContactNo = ContactNo;
    }

    public String getAssignTo() {
        return AssignTo;
    }

    public void setAssignTo(String AssignTo) {
        this.AssignTo = AssignTo;
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

    public String getAreaId() {
        return AreaId;
    }

    public void setAreaId(String AreaId) {
        this.AreaId = AreaId;
    }

    public String getAreaName() {
        return AreaName;
    }

    public void setAreaName(String AreaName) {
        this.AreaName = AreaName;
    }

    public boolean isCallDone() {
        return CallDone;
    }

    public void setCallDone(boolean CallDone) {
        this.CallDone = CallDone;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(RawId);
        dest.writeString(ExcelId);
        dest.writeString(ClientName);
        dest.writeString(ContactNo);
        dest.writeString(AssignTo);
        dest.writeByte((byte) (Flag ? 1 : 0));
        dest.writeByte((byte) (IsDeleted ? 1 : 0));
        dest.writeString(AreaId);
        dest.writeString(AreaName);
        dest.writeByte((byte) (CallDone ? 1 : 0));
    }
}
