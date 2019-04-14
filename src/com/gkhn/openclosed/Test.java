package com.gkhn.openclosed;

public class Test {
    public static void main(String[] args) {
        /*RemoteControl control = new RemoteControl();
        Object obj = new Object();
        control.on(obj);
        control.off(obj);*/

        RemoteControlInterface rciTV = new TV();
        RemoteControlInterface rciCD = new CDPlayer();
        RemoteControl controlTV = new RemoteControl(rciTV);
        RemoteControl controlCD = new RemoteControl(rciCD);
        controlTV.on();
        controlCD.on();
        controlTV.off();
        controlCD.off();
    }
}
