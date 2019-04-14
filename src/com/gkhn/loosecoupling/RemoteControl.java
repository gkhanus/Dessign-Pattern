package com.gkhn.loosecoupling;

public class RemoteControl {
    private RemoteControlInterface remote;

    public RemoteControl(RemoteControlInterface _remote){
        this.remote = _remote;
    }
    public void on(){
        remote.on();
    }
    public void off(){
        remote.off();
    }
}
