package com.vivi.playertest;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.NonNull;

public class MusicService extends Service {

    public static final String PHONOGRAPH_PACKAGE_NAME = "com.kabouzeid.gramophone";
    public static final String META_CHANGED = PHONOGRAPH_PACKAGE_NAME + ".metachanged";
    public static final String QUEUE_CHANGED = PHONOGRAPH_PACKAGE_NAME + ".queuechanged";
    public static final String PLAY_STATE_CHANGED = PHONOGRAPH_PACKAGE_NAME + ".playstatechanged";
    public static final String REPEAT_MODE_CHANGED = PHONOGRAPH_PACKAGE_NAME + ".repeatmodechanged";
    public static final String SHUFFLE_MODE_CHANGED = PHONOGRAPH_PACKAGE_NAME + ".shufflemodechanged";
    public static final String MEDIA_STORE_CHANGED = PHONOGRAPH_PACKAGE_NAME + ".mediastorechanged";

    private MediaPlayer mediaPlayer;
    private final IBinder musicBind = new MusicBinder();


    public MusicService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return musicBind;
    }

    public class MusicBinder extends Binder {
        @NonNull
        public MusicService getService() {
            return MusicService.this;
        }
    }

    public void play(){
        if (mediaPlayer == null) {
            mediaPlayer = MediaPlayer.create(this,R.raw.test);
        }
        mediaPlayer.start();
    }

    public void stop(){
        if (mediaPlayer !=null) {
            mediaPlayer.stop();
            mediaPlayer.reset();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    public void pause(){
        if (mediaPlayer !=null && mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
        }
    }
}
