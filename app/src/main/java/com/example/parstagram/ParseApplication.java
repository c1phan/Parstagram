package com.example.parstagram;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    //Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        // set applicationId, and server based on the values in the Heroku settings
        //clientKey is not needed unless explicitly configured
        //any network interceptions must be added with the Configuration Builder
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("XTyF8f1kp42IFz03Dq6vhheCRw8WqZoBJlNaurcm")
                .clientKey("SBifWJTQIYZfYVsuILAKvxBf4vco7DKFZmPdTGh0")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
