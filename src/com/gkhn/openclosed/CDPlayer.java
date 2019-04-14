package com.gkhn.openclosed;

/*
public class CDPlayer {
    public void cdOn(){
        System.out.println("TV açıldı.");
    }
    public void cdOff(){
        System.out.println("TV kapandi");
    }
}*/
public class CDPlayer implements RemoteControlInterface{
    public void on(){
        System.out.println("CD PLAYER açıldı.");
    }
    public void off(){
        System.out.println("CD PLAYER kapandi");
    }
}

