package com.marcioporto.android.ribbit;

import android.app.Application;

import com.marcioporto.android.ribbit.utils.ParseConstants;
import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseUser;

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

        Parse.initialize(this,
                "02xUbMGUM57dADEJdw5l96mrSnQ1ADoJR1tHJrDN",
                "0F1KOVrA1gpubIyaHhLwrP61vxwnQRRREhS3LXtm");
        ParseInstallation.getCurrentInstallation().saveInBackground();

    }

    public static void updateParseInstallation(ParseUser user) {
        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        installation.put(ParseConstants.KEY_USER_ID, user.getObjectId());
        installation.saveInBackground();
    }

}
