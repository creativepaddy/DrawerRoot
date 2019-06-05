package com.pradiptambe.drawerroot.transform;

import android.view.View;

import com.pradiptambe.drawerroot.util.SideNavUtils;

/**
 * Created by pradiptambe on 25.03.2017.
 */

public class ScaleTransformation implements RootTransformation {

    private static final float START_SCALE = 1f;

    private final float endScale;

    public ScaleTransformation(float endScale) {
        this.endScale = endScale;
    }

    @Override
    public void transform(float dragProgress, View rootView) {
        float scale = SideNavUtils.evaluate(dragProgress, START_SCALE, endScale);
        rootView.setScaleX(scale);
        rootView.setScaleY(scale);
    }
}
