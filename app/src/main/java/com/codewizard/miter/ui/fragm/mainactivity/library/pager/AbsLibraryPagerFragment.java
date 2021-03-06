package com.codewizard.miter.ui.fragm.mainactivity.library.pager;

import android.os.Bundle;
import androidx.loader.app.LoaderManager;

import com.codewizard.miter.ui.fragm.AbsMusicServiceFragment;
import com.codewizard.miter.ui.fragm.mainactivity.library.LibraryFragment;

/**
 * @author Karim Abou Zeid (kabouzeid)
 */
public class AbsLibraryPagerFragment extends AbsMusicServiceFragment {

    /* http://stackoverflow.com/a/2888433 */
    @Override
    public LoaderManager getLoaderManager() {
        return getParentFragment().getLoaderManager();
    }

    public LibraryFragment getLibraryFragment() {
        return (LibraryFragment) getParentFragment();
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);
    }
}
