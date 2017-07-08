package com.example.android.musicworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by ravi on 6/23/2017.
 */

public class storeActivity extends AppCompatActivity {
    Button album;
    Button playList;
    Button MusicPlayer;
    Button store;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
        album = (Button) findViewById(R.id.album_at_store);
        playList = (Button) findViewById(R.id.playlist_at_store);
        MusicPlayer = (Button) findViewById(R.id.music_player_at_store);
        store = (Button) findViewById(R.id.store_at_store);

        //implementing on onclick listener methods to pass through an an  activity
        album.setOnClickListener(albumOnClickListener);
        playList.setOnClickListener(playListOnClickListener);
        MusicPlayer.setOnClickListener(MusicPlayerOnClickListener);
        store.setOnClickListener(storeOnClickListener);
    }

    /**
     * onclick listeners helps us to make the own activity of others
     * it is later retrieved by intents
     */
    final View.OnClickListener albumOnClickListener = new View.OnClickListener() {
        public void onClick(final View v) {
            openAlbumActivity(album);
        }
    };
    final View.OnClickListener playListOnClickListener = new View.OnClickListener() {
        public void onClick(final View v) {
            openPlayListActivity(playList);
        }
    };
    final View.OnClickListener MusicPlayerOnClickListener = new View.OnClickListener() {
        public void onClick(final View v) {
            openMusicPlayerActivity(MusicPlayer);
        }
    };
    final View.OnClickListener storeOnClickListener = new View.OnClickListener() {
        public void onClick(final View v) {
            openStoreActivity(store);
        }
    };

    /**
     * setting up the intents to take to their own activities
     */
    public void openAlbumActivity(View view) {
        Intent intent = new Intent(this, albumActivity.class);
        startActivity(intent);
    }

    public void openPlayListActivity(View view) {
        Intent intent = new Intent(this, chooseSongActivity.class);
        startActivity(intent);
    }

    public void openMusicPlayerActivity(View view) {
        Intent intent = new Intent(this, musicPlayer.class);
        startActivity(intent);
    }

    public void openStoreActivity(View view) {
        Intent intent = new Intent(this, storeActivity.class);
        startActivity(intent);
    }
}
