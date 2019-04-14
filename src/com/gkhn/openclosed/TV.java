package com.gkhn.openclosed;

public class TV implements RemoteControlInterface {
    public void on(){
        System.out.println("TV açıldı.");
    }
    public void off(){
        System.out.println("TV kapandi");
    }
}

