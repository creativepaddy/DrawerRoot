package com.pradiptambe.drawerroot.callback;

/**
 * Created by pradiptambe on 15.05.2016.
 */

public interface DragStateListener {

    void onDragStart();

    void onDragEnd(boolean isMenuOpened);
}
