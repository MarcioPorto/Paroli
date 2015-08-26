package com.marcioporto.android.ribbit;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Marcio on 8/26/2015.
 *
 */
public class ParoliApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "02xUbMGUM57dADEJdw5l96mrSnQ1ADoJR1tHJrDN", "0F1KOVrA1gpubIyaHhLwrP61vxwnQRRREhS3LXtm");

    }

}
