package com.pradiptambe.drawerroot.util;

/**
 * Created by pradiptambe on 25.03.2017.
 */

public abstract class SideNavUtils {

    public static float evaluate(float fraction, float startValue, float endValue) {
        return startValue + fraction * (endValue - startValue);
    }
}
