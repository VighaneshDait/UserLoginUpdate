package com.example.user.userloginupdate.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class ConfirmLeadOTPRequest implements Parcelable{


    /**
     * Message : An error has occurred.
     * ExceptionMessage : Contact Number is Already Registered
     * ExceptionType : CompasMoney.Core.Helper.CustomException
     * StackTrace :    at CompasMoney.Core.Repository.LeadAddRepository.Add(LeadAddModel entity)
     at CompasMoney.Areas.MobileAPI.Controllers.LeadController.ConfirmLeadOTP(LeadAddModel request)
     */

    private String Message;
    private String ExceptionMessage;
    private String ExceptionType;
    private String StackTrace;

    protected ConfirmLeadOTPRequest(Parcel in) {
        Message = in.readString();
        ExceptionMessage = in.readString();
        ExceptionType = in.readString();
        StackTrace = in.readString();
    }

    public static final Creator<ConfirmLeadOTPRequest> CREATOR = new Creator<ConfirmLeadOTPRequest>() {
        @Override
        public ConfirmLeadOTPRequest createFromParcel(Parcel in) {
            return new ConfirmLeadOTPRequest(in);
        }

        @Override
        public ConfirmLeadOTPRequest[] newArray(int size) {
            return new ConfirmLeadOTPRequest[size];
        }
    };

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public String getExceptionMessage() {
        return ExceptionMessage;
    }

    public void setExceptionMessage(String ExceptionMessage) {
        this.ExceptionMessage = ExceptionMessage;
    }

    public String getExceptionType() {
        return ExceptionType;
    }

    public void setExceptionType(String ExceptionType) {
        this.ExceptionType = ExceptionType;
    }

    public String getStackTrace() {
        return StackTrace;
    }

    public void setStackTrace(String StackTrace) {
        this.StackTrace = StackTrace;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Message);
        dest.writeString(ExceptionMessage);
        dest.writeString(ExceptionType);
        dest.writeString(StackTrace);
    }
}
