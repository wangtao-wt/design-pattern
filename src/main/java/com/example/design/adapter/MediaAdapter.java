package com.example.design.adapter;

/**
 * 创建MediaPlayer接口的适配类
 */
public class MediaAdapter implements MediaPlayer {
    private AdvanceMediaPlayer advanceMusicPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advanceMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advanceMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String filename) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advanceMusicPlayer.playVlc(filename);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advanceMusicPlayer.playMp4(filename);
        }
    }
}
