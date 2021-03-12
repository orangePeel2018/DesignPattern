package com.structuralType.facade;

public class HomeTheatre {

    private DVDPlayer dvdPlayer;
    private Screen screen;
    private Lamplight lamplight;
    private Projector projector;
    private CornPopper cornPopper;
    private SurroundSound surroundSound;

    public HomeTheatre(){
        this.dvdPlayer=DVDPlayer.getInstance();
        this.screen=Screen.getInstance();
        this.lamplight=Lamplight.getInstance();
        this.projector=Projector.getInstance();
        this.cornPopper=CornPopper.getInstance();
        this.surroundSound=SurroundSound.getInstance();
    }

    public void prepare(){
        cornPopper.on();
        screen.down();
        projector.on();
        dvdPlayer.on();
        projector.focus();
        lamplight.dim();
        surroundSound.on();
        cornPopper.off();
        cornPopper.get();
        System.out.println("准备工作已完成");
    }

    public void start(){
        dvdPlayer.play();
    }
    public void pause(){
        //这里也可以加其他的
        dvdPlayer.pause();
    }
    public void terminate(){
        lamplight.light();
        surroundSound.off();
        dvdPlayer.off();
        projector.off();
        screen.up();

    }
}
