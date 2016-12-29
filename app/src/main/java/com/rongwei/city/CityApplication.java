package com.rongwei.city;

import android.app.Application;
import com.rongwei.city.db.DBManager;

/**
 * Created by dell on 2016/7/20.
 */
public class CityApplication extends Application{
    private DBManager dbManager;



    @Override
    public void onCreate() {
        super.onCreate();
        dbManager=new DBManager(getApplicationContext());
        dbManager.openDatabase();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        dbManager.closeDatabase();
    }
}
