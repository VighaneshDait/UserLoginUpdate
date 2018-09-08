package com.example.user.userloginupdate.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class AddTarget implements Parcelable{


    /**
     * TargetId : fe5ad517-9820-4350-8e86-57ab39cd8319
     * UserId : 75dd739b-8dbd-4333-8704-815d34641677
     * Username : Arya.STARK57
     * UserType : Admin
     * UserTypeId : 7e88be63-8afa-4dcc-bba6-addd00dd9ae5
     * MonthPosition : 12
     * MonthName : December
     * Target : 101
     * DailyCalls : null
     * DailySales : null
     * DailyTargetAmount : null
     * Flag : true
     * IsDeleted : false
     * MonthList : null
     * UserList : null
     */

    private String TargetId;
    private String UserId;
    private String Username;
    private String UserType;
    private String UserTypeId;
    private String MonthPosition;
    private String MonthName;
    private int Target;
    private Object DailyCalls;
    private Object DailySales;
    private Object DailyTargetAmount;
    private boolean Flag;
    private boolean IsDeleted;
    private Object MonthList;
    private Object UserList;

    protected AddTarget(Parcel in) {
        TargetId = in.readString();
        UserId = in.readString();
        Username = in.readString();
        UserType = in.readString();
        UserTypeId = in.readString();
        MonthPosition = in.readString();
        MonthName = in.readString();
        Target = in.readInt();
        Flag = in.readByte() != 0;
        IsDeleted = in.readByte() != 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(TargetId);
        dest.writeString(UserId);
        dest.writeString(Username);
        dest.writeString(UserType);
        dest.writeString(UserTypeId);
        dest.writeString(MonthPosition);
        dest.writeString(MonthName);
        dest.writeInt(Target);
        dest.writeByte((byte) (Flag ? 1 : 0));
        dest.writeByte((byte) (IsDeleted ? 1 : 0));
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<AddTarget> CREATOR = new Creator<AddTarget>() {
        @Override
        public AddTarget createFromParcel(Parcel in) {
            return new AddTarget(in);
        }

        @Override
        public AddTarget[] newArray(int size) {
            return new AddTarget[size];
        }
    };

    public String getTargetId() {
        return TargetId;
    }

    public void setTargetId(String TargetId) {
        this.TargetId = TargetId;
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

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    public String getUserTypeId() {
        return UserTypeId;
    }

    public void setUserTypeId(String UserTypeId) {
        this.UserTypeId = UserTypeId;
    }

    public String getMonthPosition() {
        return MonthPosition;
    }

    public void setMonthPosition(String MonthPosition) {
        this.MonthPosition = MonthPosition;
    }

    public String getMonthName() {
        return MonthName;
    }

    public void setMonthName(String MonthName) {
        this.MonthName = MonthName;
    }

    public int getTarget() {
        return Target;
    }

    public void setTarget(int Target) {
        this.Target = Target;
    }

    public Object getDailyCalls() {
        return DailyCalls;
    }

    public void setDailyCalls(Object DailyCalls) {
        this.DailyCalls = DailyCalls;
    }

    public Object getDailySales() {
        return DailySales;
    }

    public void setDailySales(Object DailySales) {
        this.DailySales = DailySales;
    }

    public Object getDailyTargetAmount() {
        return DailyTargetAmount;
    }

    public void setDailyTargetAmount(Object DailyTargetAmount) {
        this.DailyTargetAmount = DailyTargetAmount;
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

    public Object getMonthList() {
        return MonthList;
    }

    public void setMonthList(Object MonthList) {
        this.MonthList = MonthList;
    }

    public Object getUserList() {
        return UserList;
    }

    public void setUserList(Object UserList) {
        this.UserList = UserList;
    }

    @Override
    public String toString() {
        return "AddTarget{" +
                "TargetId='" + TargetId + '\'' +
                ", UserId='" + UserId + '\'' +
                ", Username='" + Username + '\'' +
                ", UserType='" + UserType + '\'' +
                ", UserTypeId='" + UserTypeId + '\'' +
                ", MonthPosition='" + MonthPosition + '\'' +
                ", MonthName='" + MonthName + '\'' +
                ", Target=" + Target +
                ", DailyCalls=" + DailyCalls +
                ", DailySales=" + DailySales +
                ", DailyTargetAmount=" + DailyTargetAmount +
                ", Flag=" + Flag +
                ", IsDeleted=" + IsDeleted +
                ", MonthList=" + MonthList +
                ", UserList=" + UserList +
                '}';
    }
}
