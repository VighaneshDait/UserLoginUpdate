package com.example.user.userloginupdate.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class AddLeadRequest implements Parcelable{


    /**
     * UserId : 85b2b2c6-ad48-4218-89ee-95e7bb457b03
     * FirstName : Raoul
     * MiddleName : S
     * LastName : Jadhav
     * ContactNo1 : 5412147875
     * AreaId : e783080e-ae29-4e3e-8a7c-0e209c37a219
     */

    private String UserId;
    private String FirstName;
    private String MiddleName;
    private String LastName;
    private String ContactNo1;
    private String AreaId;

    protected AddLeadRequest(Parcel in) {
        UserId = in.readString();
        FirstName = in.readString();
        MiddleName = in.readString();
        LastName = in.readString();
        ContactNo1 = in.readString();
        AreaId = in.readString();
    }

    public static final Creator<AddLeadRequest> CREATOR = new Creator<AddLeadRequest>() {
        @Override
        public AddLeadRequest createFromParcel(Parcel in) {
            return new AddLeadRequest(in);
        }

        @Override
        public AddLeadRequest[] newArray(int size) {
            return new AddLeadRequest[size];
        }
    };

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
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

    public String getAreaId() {
        return AreaId;
    }

    public void setAreaId(String AreaId) {
        this.AreaId = AreaId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(UserId);
        dest.writeString(FirstName);
        dest.writeString(MiddleName);
        dest.writeString(LastName);
        dest.writeString(ContactNo1);
        dest.writeString(AreaId);
    }
}
