package com.example.design.adapter;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;
    @Override
    public void play(String audioType, String filename) {
        //播放mp3音乐文件的内置支持
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name:" + filename);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, filename);
        } else {
            System.out.println("Invalid media." + audioType + "format not supported");
        }
    }
}
