package com.example.user.userloginupdate.Models;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.telephony.TelephonyManager;

import com.example.user.userloginupdate.MainActivity;

public class DeviceRequestModel extends Activity{


    /**
     * Username : MAX.Petra
     * Password : MAX@535
     */

    private String Username;
    private String Password;

    Activity activity = DeviceRequestModel.this;
    String wantPermission = Manifest.permission.READ_PHONE_STATE;

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

    public String getPhone() {
        TelephonyManager phoneMgr = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        if (ActivityCompat.checkSelfPermission(activity, wantPermission) != PackageManager.PERMISSION_GRANTED) {
            return "";
        }
        return phoneMgr.getLine1Number();
    }

    public String getDeviceId() {
        TelephonyManager phoneMgr = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        if (ActivityCompat.checkSelfPermission(activity, wantPermission) != PackageManager.PERMISSION_GRANTED) {
            return "";
        }
        return phoneMgr.getDeviceId();
    }

    public String getManufactuere(){

        String manufact = android.os.Build.MANUFACTURER;
        return manufact;
    }

    public String getModel(){

        String model = android.os.Build.MODEL;
        return model;
    }

    public String getBrand(){

        String brand = android.os.Build.BRAND;
        return brand;
    }

    public String getAndroidId(){

        String product = android.os.Build.PRODUCT;
        return product;
    }
}
