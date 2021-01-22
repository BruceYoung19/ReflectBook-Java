package com.example.reflectbook_java;

public class MoodItem {
    private String mMoodName;
    private int mMoodImage;

    public MoodItem(String MoodName,int MoodImage){
        mMoodName = MoodName;
        mMoodImage = MoodImage;
    }

    public String getmMoodName() {
        return mMoodName;
    }

    public int getmMoodImage() {
        return mMoodImage;
    }
}
