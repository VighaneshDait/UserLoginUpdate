package com.example.user.userloginupdate.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class UserLoginRequest implements Parcelable {


    /**
     * Username : MAX.Petra
     * Password : MAX@535
     */

    private String Username;
    private String Password;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.Username);
        dest.writeString(this.Password);
    }

    public UserLoginRequest() {
    }

    protected UserLoginRequest(Parcel in) {
        this.Username = in.readString();
        this.Password = in.readString();
    }

    public static final Parcelable.Creator<UserLoginRequest> CREATOR = new Parcelable.Creator<UserLoginRequest>() {
        @Override
        public UserLoginRequest createFromParcel(Parcel source) {
            return new UserLoginRequest(source);
        }

        @Override
        public UserLoginRequest[] newArray(int size) {
            return new UserLoginRequest[size];
        }
    };
}
