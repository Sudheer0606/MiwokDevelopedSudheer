package com.techishdevelopment.miwok_developedbysudheer;

import android.widget.ImageView;

public class Numbers {


    String numbersInMiwok;
    String numbersInEnglish;

    public Numbers(String numbersInMiwok, String numbersInEnglish) {
        this.numbersInMiwok = numbersInMiwok;
        this.numbersInEnglish = numbersInEnglish;

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

}
