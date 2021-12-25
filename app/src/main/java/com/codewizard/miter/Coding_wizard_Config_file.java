package com.codewizard.miter;

import android.app.Application;
import android.os.Build;

import com.codewizard.miter.ui.fragm.player.NowPlayingScreen;
import com.kabouzeid.appthemehelper.ThemeStore;

import com.codewizard.miter.shortcuts.DynamicShortcutManager;
import com.codingwizard.miter.R;





public class Coding_wizard_Config_file extends Application {



    private static Coding_wizard_Config_file app;


    @Override
    public void onCreate() {
        super.onCreate();
        app = this;

        // default theme
        if (!ThemeStore.isConfigured(this, 1)) {
            ThemeStore.editTheme(this)
                    .primaryColorRes(R.color.design_default_color_on_primary)
                    .accentColorRes(R.color.md_black_1000)
                    .commit();
        }


        // Set up dynamic shortcuts
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N_MR1) {
            new DynamicShortcutManager(this).initDynamicShortcuts();
        }

        // automatically restores purchases

    }



    private static OnProVersionChangedListener onProVersionChangedListener;
    public static void setOnProVersionChangedListener(OnProVersionChangedListener listener) {
        onProVersionChangedListener = listener;
    }
    public static void notifyProVersionChanged() {
        if (onProVersionChangedListener != null) {
            onProVersionChangedListener.onProVersionChanged();
        }
    }
    public interface OnProVersionChangedListener {
        void onProVersionChanged();
    }

    public static Coding_wizard_Config_file getInstance() {
        return app;
    }



}
