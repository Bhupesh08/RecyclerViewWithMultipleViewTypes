package com.example.recyclerviewwithmultipleviewtypes;

import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ModalClass {

    public static final int LAYOUT_ONE = 1;
    public static final int LAYOUT_TWO = 2;
    public static final int LAYOUT_THREE = 3;

    private final int viewType;
    private int imageview;
    private String textview;
    //private String edittext;

    public ModalClass(int viewType, int imageview) {
        this.viewType = viewType;
        this.imageview = imageview;
    }

    public ModalClass(int viewType) {
        this.viewType = viewType;
    }

    public ModalClass(int viewType, int imageview, String textview) {
        this.viewType = viewType;
        this.imageview = imageview;
        this.textview = textview;
    }

//    public ModalClass(int viewType, String edittext) {
//        this.viewType = viewType;
//        this.edittext = edittext;
//    }

    public int getViewType() {
        return viewType;
    }

    public int getImageview() {
        return imageview;
    }

    public String getTextview() {
        return textview;
    }
}
