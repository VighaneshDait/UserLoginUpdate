package com.example.user.userloginupdate.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class GetAllProject implements Parcelable{



    /**
     * SchemeId : 7e85977b-d169-4bd8-bb9a-5710f1fc5e09
     * ProjectId : 5264eda4-7534-443d-96a2-5115389cd7eb
     * SchemeName : gareg
     * ProjectName : DNS
     * SchemeDescription : gfxnjgfnb g
     * StartedDT : 2018-08-22T00:00:00
     * EndedDT : 2018-08-31T00:00:00
     * Flag : true
     * IsDeleted : false
     * projectList : null
     */

    private String SchemeId;
    private String ProjectId;
    private String SchemeName;
    private String ProjectName;
    private String SchemeDescription;
    private String StartedDT;
    private String EndedDT;
    private boolean Flag;
    private boolean IsDeleted;
    private Object projectList;

    protected GetAllProject(Parcel in) {
        SchemeId = in.readString();
        ProjectId = in.readString();
        SchemeName = in.readString();
        ProjectName = in.readString();
        SchemeDescription = in.readString();
        StartedDT = in.readString();
        EndedDT = in.readString();
        Flag = in.readByte() != 0;
        IsDeleted = in.readByte() != 0;
    }

    public static final Creator<GetAllProject> CREATOR = new Creator<GetAllProject>() {
        @Override
        public GetAllProject createFromParcel(Parcel in) {
            return new GetAllProject(in);
        }

        @Override
        public GetAllProject[] newArray(int size) {
            return new GetAllProject[size];
        }
    };

    public String getSchemeId() {
        return SchemeId;
    }

    public void setSchemeId(String SchemeId) {
        this.SchemeId = SchemeId;
    }

    public String getProjectId() {
        return ProjectId;
    }

    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public String getSchemeName() {
        return SchemeName;
    }

    public void setSchemeName(String SchemeName) {
        this.SchemeName = SchemeName;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    public String getSchemeDescription() {
        return SchemeDescription;
    }

    public void setSchemeDescription(String SchemeDescription) {
        this.SchemeDescription = SchemeDescription;
    }

    public String getStartedDT() {
        return StartedDT;
    }

    public void setStartedDT(String StartedDT) {
        this.StartedDT = StartedDT;
    }

    public String getEndedDT() {
        return EndedDT;
    }

    public void setEndedDT(String EndedDT) {
        this.EndedDT = EndedDT;
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

    public Object getProjectList() {
        return projectList;
    }

    public void setProjectList(Object projectList) {
        this.projectList = projectList;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(SchemeId);
        dest.writeString(ProjectId);
        dest.writeString(SchemeName);
        dest.writeString(ProjectName);
        dest.writeString(SchemeDescription);
        dest.writeString(StartedDT);
        dest.writeString(EndedDT);
        dest.writeByte((byte) (Flag ? 1 : 0));
        dest.writeByte((byte) (IsDeleted ? 1 : 0));
    }

    @Override
    public String toString() {
        return "GetAllProject{" +
                "SchemeId='" + SchemeId + '\'' +
                ", ProjectId='" + ProjectId + '\'' +
                ", SchemeName='" + SchemeName + '\'' +
                ", ProjectName='" + ProjectName + '\'' +
                ", SchemeDescription='" + SchemeDescription + '\'' +
                ", StartedDT='" + StartedDT + '\'' +
                ", EndedDT='" + EndedDT + '\'' +
                ", Flag=" + Flag +
                ", IsDeleted=" + IsDeleted +
                ", projectList=" + projectList +
                '}';
    }
}
