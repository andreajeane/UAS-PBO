package id.ac.poliban.mi.vc.andrea.wisataapp_e020320064.utils;

import android.content.Context;

public class Tools {

    // Nama  : Andrea Jeane Elquita
    // NIM   : E020320064
    // Kelas : 5C MI

    public static int dp2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    public static int px2dp(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }
}
