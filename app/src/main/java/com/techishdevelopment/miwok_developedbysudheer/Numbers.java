package com.techishdevelopment.miwok_developedbysudheer;

import android.widget.ImageView;

public class Numbers {


    String numbersInMiwok;
    String numbersInEnglish;
    ImageView imageView;
    public Numbers(String numbersInMiwok, String numbersInEnglish,ImageView img) {
        this.numbersInMiwok = numbersInMiwok;
        this.numbersInEnglish = numbersInEnglish;
        this.imageView=img;
    }

    public String getNumbersInMiwok() {
        return numbersInMiwok;
    }

    public void setNumbersInMiwok(String numbersInMiwok) {
        this.numbersInMiwok = numbersInMiwok;
    }

    public String getNumbersInEnglish() {
        return numbersInEnglish;
    }

    public void setNumbersInEnglish(String numbersInEnglish) {
        this.numbersInEnglish = numbersInEnglish;
    }
    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }
}
