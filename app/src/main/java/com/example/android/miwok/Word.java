package com.example.android.miwok;

/**
 * Created by victo on 5/29/2017.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private int mAudioResourceID;
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create new Word object
     *
     * @param defaultTranslation is the word in a language the user uses
     * @param miwokTranslation is the word translation in Miwok
     * @param audioResourceID is the audio resource id
     */

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceID = audioResourceID;
    }

    /**
     * Create new Word object
     *
     * @param defaultTranslation is the word in a language the user uses
     * @param miwokTranslation is the word translation in Miwok
     * @param imageResourceID is the drawable resource ID for the image assets
     * @param audioResourceID is the audio resource id
     */

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceID, int imageResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
        mAudioResourceID = audioResourceID;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceID() { return mImageResourceID;}

    public int getAudioResourceID() { return mAudioResourceID;}

    public boolean hasImage() { return mImageResourceID != NO_IMAGE_PROVIDED;}
}
