package com.example.user.userloginupdate.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class AddFollowUpRequest implements Parcelable{

    /**
     * UserId : 85b2b2c6-ad48-4218-89ee-95e7bb457b03
     * ClientId : 9ae64087-c877-4483-8e88-84fee8755bfc
     * CallRecordingId : null
     * RemarkId : 0af48502-7ff7-4475-a9df-af3aa6ec9a24
     * Description : asas
     * ReminderDT : 2018-09-20T13:09:00
     * VisitDT : 2018-09-15T00:00:00
     */

    private String UserId;
    private String ClientId;
    private Object CallRecordingId;
    private String RemarkId;
    private String Description;
    private String ReminderDT;
    private String VisitDT;

    protected AddFollowUpRequest(Parcel in) {
        UserId = in.readString();
        ClientId = in.readString();
        RemarkId = in.readString();
        Description = in.readString();
        ReminderDT = in.readString();
        VisitDT = in.readString();
    }

    public static final Creator<AddFollowUpRequest> CREATOR = new Creator<AddFollowUpRequest>() {
        @Override
        public AddFollowUpRequest createFromParcel(Parcel in) {
            return new AddFollowUpRequest(in);
        }

        @Override
        public AddFollowUpRequest[] newArray(int size) {
            return new AddFollowUpRequest[size];
        }
    };

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public String getClientId() {
        return ClientId;
    }

    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(UserId);
        dest.writeString(ClientId);
        dest.writeString(RemarkId);
        dest.writeString(Description);
        dest.writeString(ReminderDT);
        dest.writeString(VisitDT);
    }
}
