package com.jstevenunez.androidstarter.bean;

/**
 * Created by steven on 2/23/2015.
 */
public class SearchText {
    private final String text;

    public SearchText() {
        text ="";
    }

    public SearchText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
