package com.bignerdranch.com.criminallntent;

import java.util.UUID;

/**
 * Created by user on 11/04/2016.
 */
public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime(){
        //Generate unique identifier
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
