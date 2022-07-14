package com.example.snaphelperdemo;

import android.content.res.Resources;

public class ViewUtils {

    public static Float convertDpToPx(float value) {
        return  (value * Resources.getSystem().getDisplayMetrics().density);
    }

}
