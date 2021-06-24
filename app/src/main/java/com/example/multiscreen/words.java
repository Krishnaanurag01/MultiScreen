package com.example.multiscreen;

public class words {

    private String mdefaultTranslation;
    private String mMiwokTranslation;
    private int mihokImage=smallestint;
    private static final int smallestint=-1;
    private  int mihokAudio;

    public  words(String defaultTranslation, String mihokTranslation,int audio){
        mdefaultTranslation=defaultTranslation;
        mMiwokTranslation=mihokTranslation;
        mihokAudio=audio;
    }
    public  words(String defaultTranslation, String mihokTranslation,int imageId,int audio){
        mdefaultTranslation=defaultTranslation;
        mMiwokTranslation=mihokTranslation;
        mihokImage=imageId;
        mihokAudio=audio;
    }

    public String getMdefaultTranslation(){
        return  mdefaultTranslation;
    }
    public  String getmMiwokTranslation(){return  mMiwokTranslation;}
    public int getMihokImage(){
        return mihokImage;
    }

    public boolean hasImage(){
        return mihokImage!=smallestint;
    }
    public int getMihokAudio(){
        return mihokAudio;
    }

}
