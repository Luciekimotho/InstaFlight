package com.ellekay.lucie.instaflight;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucie on 10/31/15.
 */
public class MySpeaker {
    String name;
    String descr;
    String twitter;
    int imgId;

    MySpeaker(String name, String descr, String twitter, int imgId){
        this.name = name;
        this.descr = descr;
        this.twitter = twitter;
        this.imgId = imgId;
    }
}

/*private List<MySpeaker> speaker;
private void initializeData(){
    speaker = new ArrayList<>();
    speaker.add(new MySpeaker("Lulu","Software developer","@luekim",R.drawable.speakers ));

*/
