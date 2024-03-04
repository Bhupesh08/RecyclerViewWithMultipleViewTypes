package com.example.recyclerviewwithmultipleviewtypes;

import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ModalClass {

    public static final int LAYOUT_ONE = 1;
    public static final int LAYOUT_TWO = 2;
    public static final int LAYOUT_THREE = 3;
    public static final int LAYOUT_FOUR = 4;


    private final int viewType;
    private int imageview;
    private String textview;

    private ArrayList<ChildModal> childModalList;


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

    public ModalClass(int viewType, ArrayList<ChildModal> childModalList) {
        this.viewType = viewType;
        this.childModalList = childModalList;
    }

    public int getViewType() {
        return viewType;
    }

    public int getImageview() {
        return imageview;
    }

    public String getTextview() {
        return textview;
    }

    public ArrayList<ChildModal> getChildModalList() {
        return childModalList;
    }
}
