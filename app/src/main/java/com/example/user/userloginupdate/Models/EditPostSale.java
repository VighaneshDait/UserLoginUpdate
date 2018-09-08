package com.example.user.userloginupdate.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class EditPostSale implements Parcelable{


    /**
     * PostsaleId : 0ef449fa-561e-4c8d-b378-4cc968702db7
     * ClientId : e87dea2e-60c1-4301-9bde-4a8070ad6c20
     * BuilderId : 62096e01-db84-48c8-a94c-84963d71e485
     * ProjectId : 0168cd93-d881-41bc-9bdb-fba68bb852ce
     * ConfigurationId : 0190ca09-ed88-4b3a-bf21-7c9b974df192
     * BankId : fc2bb2be-8d74-4168-bcb7-9329c9034239
     * FlatCost : 20
     * ProjectName : Green City
     * ClientName : Dr Manhatten
     * BuilderName : NV Builder
     * InterestedBankName : BOI
     * PaymentModeId : 836ed45c-8a17-4a01-842e-ffc8ede8ec60
     * InterstedBankForLoan : null
     * Remark : fgbshfbnsfg
     * FlatDetails : srb srthbhgb fgbfsvbdrstgbvb
     * projectList : null
     * ClientList : null
     * BuilderList : null
     * ConfigurationList : null
     * PaymentModeList : null
     * BankList : null
     * Flag : true
     * IsDeleted : false
     */

    private String PostsaleId;
    private String ClientId;
    private String BuilderId;
    private String ProjectId;
    private String ConfigurationId;
    private String BankId;
    private int FlatCost;
    private String ProjectName;
    private String ClientName;
    private String BuilderName;
    private String InterestedBankName;
    private String PaymentModeId;
    private Object InterstedBankForLoan;
    private String Remark;
    private String FlatDetails;
    private Object projectList;
    private Object ClientList;
    private Object BuilderList;
    private Object ConfigurationList;
    private Object PaymentModeList;
    private Object BankList;
    private boolean Flag;
    private boolean IsDeleted;

    protected EditPostSale(Parcel in) {
        PostsaleId = in.readString();
        ClientId = in.readString();
        BuilderId = in.readString();
        ProjectId = in.readString();
        ConfigurationId = in.readString();
        BankId = in.readString();
        FlatCost = in.readInt();
        ProjectName = in.readString();
        ClientName = in.readString();
        BuilderName = in.readString();
        InterestedBankName = in.readString();
        PaymentModeId = in.readString();
        Remark = in.readString();
        FlatDetails = in.readString();
        Flag = in.readByte() != 0;
        IsDeleted = in.readByte() != 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(PostsaleId);
        dest.writeString(ClientId);
        dest.writeString(BuilderId);
        dest.writeString(ProjectId);
        dest.writeString(ConfigurationId);
        dest.writeString(BankId);
        dest.writeInt(FlatCost);
        dest.writeString(ProjectName);
        dest.writeString(ClientName);
        dest.writeString(BuilderName);
        dest.writeString(InterestedBankName);
        dest.writeString(PaymentModeId);
        dest.writeString(Remark);
        dest.writeString(FlatDetails);
        dest.writeByte((byte) (Flag ? 1 : 0));
        dest.writeByte((byte) (IsDeleted ? 1 : 0));
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<EditPostSale> CREATOR = new Creator<EditPostSale>() {
        @Override
        public EditPostSale createFromParcel(Parcel in) {
            return new EditPostSale(in);
        }

        @Override
        public EditPostSale[] newArray(int size) {
            return new EditPostSale[size];
        }
    };

    public String getPostsaleId() {
        return PostsaleId;
    }

    public void setPostsaleId(String PostsaleId) {
        this.PostsaleId = PostsaleId;
    }

    public String getClientId() {
        return ClientId;
    }

    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    public String getBuilderId() {
        return BuilderId;
    }

    public void setBuilderId(String BuilderId) {
        this.BuilderId = BuilderId;
    }

    public String getProjectId() {
        return ProjectId;
    }

    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public String getConfigurationId() {
        return ConfigurationId;
    }

    public void setConfigurationId(String ConfigurationId) {
        this.ConfigurationId = ConfigurationId;
    }

    public String getBankId() {
        return BankId;
    }

    public void setBankId(String BankId) {
        this.BankId = BankId;
    }

    public int getFlatCost() {
        return FlatCost;
    }

    public void setFlatCost(int FlatCost) {
        this.FlatCost = FlatCost;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    public String getClientName() {
        return ClientName;
    }

    public void setClientName(String ClientName) {
        this.ClientName = ClientName;
    }

    public String getBuilderName() {
        return BuilderName;
    }

    public void setBuilderName(String BuilderName) {
        this.BuilderName = BuilderName;
    }

    public String getInterestedBankName() {
        return InterestedBankName;
    }

    public void setInterestedBankName(String InterestedBankName) {
        this.InterestedBankName = InterestedBankName;
    }

    public String getPaymentModeId() {
        return PaymentModeId;
    }

    public void setPaymentModeId(String PaymentModeId) {
        this.PaymentModeId = PaymentModeId;
    }

    public Object getInterstedBankForLoan() {
        return InterstedBankForLoan;
    }

    public void setInterstedBankForLoan(Object InterstedBankForLoan) {
        this.InterstedBankForLoan = InterstedBankForLoan;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public String getFlatDetails() {
        return FlatDetails;
    }

    public void setFlatDetails(String FlatDetails) {
        this.FlatDetails = FlatDetails;
    }

    public Object getProjectList() {
        return projectList;
    }

    public void setProjectList(Object projectList) {
        this.projectList = projectList;
    }

    public Object getClientList() {
        return ClientList;
    }

    public void setClientList(Object ClientList) {
        this.ClientList = ClientList;
    }

    public Object getBuilderList() {
        return BuilderList;
    }

    public void setBuilderList(Object BuilderList) {
        this.BuilderList = BuilderList;
    }

    public Object getConfigurationList() {
        return ConfigurationList;
    }

    public void setConfigurationList(Object ConfigurationList) {
        this.ConfigurationList = ConfigurationList;
    }

    public Object getPaymentModeList() {
        return PaymentModeList;
    }

    public void setPaymentModeList(Object PaymentModeList) {
        this.PaymentModeList = PaymentModeList;
    }

    public Object getBankList() {
        return BankList;
    }

    public void setBankList(Object BankList) {
        this.BankList = BankList;
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

    @Override
    public String toString() {
        return "EditPostSale{" +
                "PostsaleId='" + PostsaleId + '\'' +
                ", ClientId='" + ClientId + '\'' +
                ", BuilderId='" + BuilderId + '\'' +
                ", ProjectId='" + ProjectId + '\'' +
                ", ConfigurationId='" + ConfigurationId + '\'' +
                ", BankId='" + BankId + '\'' +
                ", FlatCost=" + FlatCost +
                ", ProjectName='" + ProjectName + '\'' +
                ", ClientName='" + ClientName + '\'' +
                ", BuilderName='" + BuilderName + '\'' +
                ", InterestedBankName='" + InterestedBankName + '\'' +
                ", PaymentModeId='" + PaymentModeId + '\'' +
                ", InterstedBankForLoan=" + InterstedBankForLoan +
                ", Remark='" + Remark + '\'' +
                ", FlatDetails='" + FlatDetails + '\'' +
                ", projectList=" + projectList +
                ", ClientList=" + ClientList +
                ", BuilderList=" + BuilderList +
                ", ConfigurationList=" + ConfigurationList +
                ", PaymentModeList=" + PaymentModeList +
                ", BankList=" + BankList +
                ", Flag=" + Flag +
                ", IsDeleted=" + IsDeleted +
                '}';
    }
}
