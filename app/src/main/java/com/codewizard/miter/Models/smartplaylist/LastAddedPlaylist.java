package com.codewizard.miter.Models.smartplaylist;

import android.content.Context;
import android.os.Parcel;
import androidx.annotation.NonNull;

import com.codewizard.miter.coding_wizard_loader.LastAddedLoader;
import com.codewizard.miter.Models.Song;
import com.codingwizard.miter.R;

import java.util.List;

/**
 * @author Karim Abou Zeid (kabouzeid)
 */
public class LastAddedPlaylist extends AbsSmartPlaylist {

    public LastAddedPlaylist(@NonNull Context context) {
        super(context.getString(R.string.last_added), R.drawable.ic_library_add_white_24dp);
    }

    @NonNull
    @Override
    public List<Song> getSongs(@NonNull Context context) {
        return LastAddedLoader.getLastAddedSongs(context);
    }

    @Override
    public void clear(@NonNull Context context) {
    }


    @Override
    public int describeContents() {
        return 0;
    }

    protected LastAddedPlaylist(Parcel in) {
        super(in);
    }

    public static final Creator<LastAddedPlaylist> CREATOR = new Creator<LastAddedPlaylist>() {
        public LastAddedPlaylist createFromParcel(Parcel source) {
            return new LastAddedPlaylist(source);
        }

        public LastAddedPlaylist[] newArray(int size) {
            return new LastAddedPlaylist[size];
        }
    };
}
