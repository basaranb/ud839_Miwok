package com.example.android.miwok;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.annotation.DrawableRes;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private Drawable mWord_image;

    public Word (String defaultTranslation, String miwokTranslation, Drawable word_image)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mWord_image = word_image;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public Drawable getWord_image(){
        return mWord_image;
    }

}
