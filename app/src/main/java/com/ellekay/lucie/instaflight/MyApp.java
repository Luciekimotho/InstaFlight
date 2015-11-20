package com.ellekay.lucie.instaflight;

import android.app.Application;
import android.os.Bundle;

import com.twitter.sdk.android.*;
import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;

import io.fabric.sdk.android.Fabric;

/**
 * Created by lucie on 11/21/15.
 */
public class MyApp extends Application {

    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = "cIr4QYkOcBRd1zpZhmWg4J0Y1";
    private static final String TWITTER_SECRET = "o1hq6W1ihJ6NY1zGxjyZUpd3uMPtJ58g8mHOd75DikozHDdOlO ";

    @Override
    public void onCreate() {
        super.onCreate();
        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new Twitter(authConfig));
    }
}
