package ru.vladbstrv.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext(
          "applicationContext.xml"
        );

//        Music rockMusic = context.getBean("rockMusic", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(rockMusic);
//        musicPlayer.playMusic();
//
//        Music classicalMusic = context.getBean("classicalMusic", Music.class);
//        MusicPlayer classicalMusicPlayer = new MusicPlayer(classicalMusic);
//        classicalMusicPlayer.playMusic();

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
