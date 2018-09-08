package com.example.user.userloginupdate.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class GetAllEmployeeLocationResponse implements Parcelable{


    /**
     * UserId : fece3ba8-7876-43cc-82f8-da7fb8487e90
     * FirstName : Raoul
     * LastName : Jadhav
     * Latitude : null
     * Longitude : null
     */

    private String UserId;
    private String FirstName;
    private String LastName;
    private Object Latitude;
    private Object Longitude;

    protected GetAllEmployeeLocationResponse(Parcel in) {
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

    public static final Creator<GetAllEmployeeLocationResponse> CREATOR = new Creator<GetAllEmployeeLocationResponse>() {
        @Override
        public GetAllEmployeeLocationResponse createFromParcel(Parcel in) {
            return new GetAllEmployeeLocationResponse(in);
        }

        @Override
        public GetAllEmployeeLocationResponse[] newArray(int size) {
            return new GetAllEmployeeLocationResponse[size];
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
