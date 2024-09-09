package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MusicPlayer lyrics = new MusicPlayer();
        VideoPlayer video = new VideoPlayer();

        MediaController MediaController = new MediaController();
        MediaController.playMedia(lyrics);
        MediaController.playMedia(video);
    }
}