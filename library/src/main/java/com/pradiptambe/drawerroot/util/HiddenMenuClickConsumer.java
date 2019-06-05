package com.pradiptambe.drawerroot.util;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

import com.pradiptambe.drawerroot.SlidingRootNavLayout;

/**
 * Created by pradiptambe on 15.05.2016.
 */

public class HiddenMenuClickConsumer extends View {

    private SlidingRootNavLayout menuHost;

    public HiddenMenuClickConsumer(Context context) {
        super(context);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return menuHost.isMenuClosed();
    }

    public void setMenuHost(SlidingRootNavLayout layout) {
        this.menuHost = layout;
    }
}
