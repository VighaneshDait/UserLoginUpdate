package com.example.user.userloginupdate.Models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class EditProject implements Parcelable{


    /**
     * ProjectId : 77d83ae6-b01e-4585-9123-39c20d531e31
     * ProjectName : Palvaaaa City
     * LocatonId : bc48d10c-9d4b-451a-8db6-75eeaf3175a9
     * Floor : 15
     * AcresLand : 15
     * PossessionDT : 2017-07-28T00:00:00
     * ConfigurationId : null
     * projectConfiguration : [{"configurationId":"0190ca09-ed88-4b3a-bf21-7c9b974df192","configuration":"2 BHK","Checked":false},{"configurationId":"14f0ae30-7bf6-43da-acf9-04357a5a54b8","configuration":"1 BHK","Checked":true}]
     * BudgetId : 6845078d-f586-4421-80a8-7f900c168159
     * SqFtRate : 1000
     * BuilderId : 2b505daf-bb48-4343-ac02-6c0a460131e5
     * UserId : 85b2b2c6-ad48-4218-89ee-95e7bb457b03
     * ImagesPath : []
     * MediaPath : null
     * Flag : true
     * IsDeleted : false
     * LocationList : null
     * ConfigurationList : null
     * BudgetList : null
     * BuilderList : null
     * ManagerList : null
     */

    private String ProjectId;
    private String ProjectName;
    private String LocatonId;
    private String Floor;
    private String AcresLand;
    private String PossessionDT;
    private Object ConfigurationId;
    private String BudgetId;
    private String SqFtRate;
    private String BuilderId;
    private String UserId;
    private Object MediaPath;
    private boolean Flag;
    private boolean IsDeleted;
    private Object LocationList;
    private Object ConfigurationList;
    private Object BudgetList;
    private Object BuilderList;
    private Object ManagerList;
    private List<ProjectConfigurationBean> projectConfiguration;
    private List<?> ImagesPath;

    protected EditProject(Parcel in) {
        ProjectId = in.readString();
        ProjectName = in.readString();
        LocatonId = in.readString();
        Floor = in.readString();
        AcresLand = in.readString();
        PossessionDT = in.readString();
        BudgetId = in.readString();
        SqFtRate = in.readString();
        BuilderId = in.readString();
        UserId = in.readString();
        Flag = in.readByte() != 0;
        IsDeleted = in.readByte() != 0;
    }

    public static final Creator<EditProject> CREATOR = new Creator<EditProject>() {
        @Override
        public EditProject createFromParcel(Parcel in) {
            return new EditProject(in);
        }

        @Override
        public EditProject[] newArray(int size) {
            return new EditProject[size];
        }
    };

    public String getProjectId() {
        return ProjectId;
    }

    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    public String getLocatonId() {
        return LocatonId;
    }

    public void setLocatonId(String LocatonId) {
        this.LocatonId = LocatonId;
    }

    public String getFloor() {
        return Floor;
    }

    public void setFloor(String Floor) {
        this.Floor = Floor;
    }

    public String getAcresLand() {
        return AcresLand;
    }

    public void setAcresLand(String AcresLand) {
        this.AcresLand = AcresLand;
    }

    public String getPossessionDT() {
        return PossessionDT;
    }

    public void setPossessionDT(String PossessionDT) {
        this.PossessionDT = PossessionDT;
    }

    public Object getConfigurationId() {
        return ConfigurationId;
    }

    public void setConfigurationId(Object ConfigurationId) {
        this.ConfigurationId = ConfigurationId;
    }

    public String getBudgetId() {
        return BudgetId;
    }

    public void setBudgetId(String BudgetId) {
        this.BudgetId = BudgetId;
    }

    public String getSqFtRate() {
        return SqFtRate;
    }

    public void setSqFtRate(String SqFtRate) {
        this.SqFtRate = SqFtRate;
    }

    public String getBuilderId() {
        return BuilderId;
    }

    public void setBuilderId(String BuilderId) {
        this.BuilderId = BuilderId;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public Object getMediaPath() {
        return MediaPath;
    }

    public void setMediaPath(Object MediaPath) {
        this.MediaPath = MediaPath;
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

    public Object getLocationList() {
        return LocationList;
    }

    public void setLocationList(Object LocationList) {
        this.LocationList = LocationList;
    }

    public Object getConfigurationList() {
        return ConfigurationList;
    }

    public void setConfigurationList(Object ConfigurationList) {
        this.ConfigurationList = ConfigurationList;
    }

    public Object getBudgetList() {
        return BudgetList;
    }

    public void setBudgetList(Object BudgetList) {
        this.BudgetList = BudgetList;
    }

    public Object getBuilderList() {
        return BuilderList;
    }

    public void setBuilderList(Object BuilderList) {
        this.BuilderList = BuilderList;
    }

    public Object getManagerList() {
        return ManagerList;
    }

    public void setManagerList(Object ManagerList) {
        this.ManagerList = ManagerList;
    }

    public List<ProjectConfigurationBean> getProjectConfiguration() {
        return projectConfiguration;
    }

    public void setProjectConfiguration(List<ProjectConfigurationBean> projectConfiguration) {
        this.projectConfiguration = projectConfiguration;
    }

    public List<?> getImagesPath() {
        return ImagesPath;
    }

    public void setImagesPath(List<?> ImagesPath) {
        this.ImagesPath = ImagesPath;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(ProjectId);
        dest.writeString(ProjectName);
        dest.writeString(LocatonId);
        dest.writeString(Floor);
        dest.writeString(AcresLand);
        dest.writeString(PossessionDT);
        dest.writeString(BudgetId);
        dest.writeString(SqFtRate);
        dest.writeString(BuilderId);
        dest.writeString(UserId);
        dest.writeByte((byte) (Flag ? 1 : 0));
        dest.writeByte((byte) (IsDeleted ? 1 : 0));
    }

    public static class ProjectConfigurationBean {
        /**
         * configurationId : 0190ca09-ed88-4b3a-bf21-7c9b974df192
         * configuration : 2 BHK
         * Checked : false
         */

        private String configurationId;
        private String configuration;
        private boolean Checked;

        public String getConfigurationId() {
            return configurationId;
        }

        public void setConfigurationId(String configurationId) {
            this.configurationId = configurationId;
        }

        public String getConfiguration() {
            return configuration;
        }

        public void setConfiguration(String configuration) {
            this.configuration = configuration;
        }

        public boolean isChecked() {
            return Checked;
        }

        public void setChecked(boolean Checked) {
            this.Checked = Checked;
        }
    }

    @Override
    public String toString() {
        return "EditProject{" +
                "ProjectId='" + ProjectId + '\'' +
                ", ProjectName='" + ProjectName + '\'' +
                ", LocatonId='" + LocatonId + '\'' +
                ", Floor='" + Floor + '\'' +
                ", AcresLand='" + AcresLand + '\'' +
                ", PossessionDT='" + PossessionDT + '\'' +
                ", ConfigurationId=" + ConfigurationId +
                ", BudgetId='" + BudgetId + '\'' +
                ", SqFtRate='" + SqFtRate + '\'' +
                ", BuilderId='" + BuilderId + '\'' +
                ", UserId='" + UserId + '\'' +
                ", MediaPath=" + MediaPath +
                ", Flag=" + Flag +
                ", IsDeleted=" + IsDeleted +
                ", LocationList=" + LocationList +
                ", ConfigurationList=" + ConfigurationList +
                ", BudgetList=" + BudgetList +
                ", BuilderList=" + BuilderList +
                ", ManagerList=" + ManagerList +
                ", projectConfiguration=" + projectConfiguration +
                ", ImagesPath=" + ImagesPath +
                '}';
    }
}
