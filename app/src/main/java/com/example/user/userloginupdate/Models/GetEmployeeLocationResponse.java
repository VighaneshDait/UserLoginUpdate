package com.example.user.userloginupdate.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class GetEmployeeLocationResponse implements Parcelable{


    /**
     * UserId : 41d10c8e-b5a0-478a-aecb-5ee316d1860d
     * FirstName : MAX
     * LastName : Petra
     * Latitude : null
     * Longitude : null
     */

    private String UserId;
    private String FirstName;
    private String LastName;
    private Object Latitude;
    private Object Longitude;

    protected GetEmployeeLocationResponse(Parcel in) {
        UserId = in.readString();
        FirstName = in.readString();
        LastName = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(UserId);
        dest.writeString(FirstName);
        dest.writeString(LastName);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<GetEmployeeLocationResponse> CREATOR = new Creator<GetEmployeeLocationResponse>() {
        @Override
        public GetEmployeeLocationResponse createFromParcel(Parcel in) {
            return new GetEmployeeLocationResponse(in);
        }

        @Override
        public GetEmployeeLocationResponse[] newArray(int size) {
            return new GetEmployeeLocationResponse[size];
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

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
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
}
