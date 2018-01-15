package com.vivi.playertest;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void play_onclick(View view) {
        MusicRemote.play();
    }


    public void pause_onclick(View view) {
        MusicRemote.pause();
    }

    public void stop_onclick(View view) {
        MusicRemote.stop();
    }
}
