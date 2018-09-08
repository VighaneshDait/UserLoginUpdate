package com.example.user.userloginupdate.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class GetAllFollowupResponse implements Parcelable{

    /**
     * FollowupId : f03e172d-cfeb-45d5-ab74-1381d852c6d9
     * UserId : 85b2b2c6-ad48-4218-89ee-95e7bb457b03
     * Username : shailesh.bhor
     * ClientId : 9ae64087-c877-4483-8e88-84fee8755bfc
     * ClientName : Abhishek  Pawar
     * CallRecordingId : null
     * RemarkId : 0af48502-7ff7-4475-a9df-af3aa6ec9a24
     * Description : asas
     * ReminderDT : 2018-09-20T13:09:00
     * VisitDT : 2018-09-15T00:00:00
     * CreatedDT : null
     * IsDeleted : false
     * clientList : null
     * EmployeeList : null
     * RemarkList : null
     */

    private String FollowupId;
    private String UserId;
    private String Username;
    private String ClientId;
    private String ClientName;
    private Object CallRecordingId;
    private String RemarkId;
    private String Description;
    private String ReminderDT;
    private String VisitDT;
    private Object CreatedDT;
    private boolean IsDeleted;
    private Object clientList;
    private Object EmployeeList;
    private Object RemarkList;

    protected GetAllFollowupResponse(Parcel in) {
        FollowupId = in.readString();
        UserId = in.readString();
        Username = in.readString();
        ClientId = in.readString();
        ClientName = in.readString();
        RemarkId = in.readString();
        Description = in.readString();
        ReminderDT = in.readString();
        VisitDT = in.readString();
        IsDeleted = in.readByte() != 0;
    }

    public static final Creator<GetAllFollowupResponse> CREATOR = new Creator<GetAllFollowupResponse>() {
        @Override
        public GetAllFollowupResponse createFromParcel(Parcel in) {
            return new GetAllFollowupResponse(in);
        }

        @Override
        public GetAllFollowupResponse[] newArray(int size) {
            return new GetAllFollowupResponse[size];
        }
    };

    public String getFollowupId() {
        return FollowupId;
    }

    public void setFollowupId(String FollowupId) {
        this.FollowupId = FollowupId;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
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

    public Object getCallRecordingId() {
        return CallRecordingId;
    }

    public void setCallRecordingId(Object CallRecordingId) {
        this.CallRecordingId = CallRecordingId;
    }

    public String getRemarkId() {
        return RemarkId;
    }

    public void setRemarkId(String RemarkId) {
        this.RemarkId = RemarkId;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getReminderDT() {
        return ReminderDT;
    }

    public void setReminderDT(String ReminderDT) {
        this.ReminderDT = ReminderDT;
    }

    public String getVisitDT() {
        return VisitDT;
    }

    public void setVisitDT(String VisitDT) {
        this.VisitDT = VisitDT;
    }

    public Object getCreatedDT() {
        return CreatedDT;
    }

    public void setCreatedDT(Object CreatedDT) {
        this.CreatedDT = CreatedDT;
    }

    public boolean isIsDeleted() {
        return IsDeleted;
    }

    public void setIsDeleted(boolean IsDeleted) {
        this.IsDeleted = IsDeleted;
    }

    public Object getClientList() {
        return clientList;
    }

    public void setClientList(Object clientList) {
        this.clientList = clientList;
    }

    public Object getEmployeeList() {
        return EmployeeList;
    }

    public void setEmployeeList(Object EmployeeList) {
        this.EmployeeList = EmployeeList;
    }

    public Object getRemarkList() {
        return RemarkList;
    }

    public void setRemarkList(Object RemarkList) {
        this.RemarkList = RemarkList;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(FollowupId);
        dest.writeString(UserId);
        dest.writeString(Username);
        dest.writeString(ClientId);
        dest.writeString(ClientName);
        dest.writeString(RemarkId);
        dest.writeString(Description);
        dest.writeString(ReminderDT);
        dest.writeString(VisitDT);
        dest.writeByte((byte) (IsDeleted ? 1 : 0));
    }
}
