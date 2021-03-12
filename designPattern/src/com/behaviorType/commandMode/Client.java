package com.behaviorType.commandMode;

public class Client {
    public static void main(String[] args) {
        LightReceiver lightReceiver=new LightReceiver();
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        RemoteController remoteController=new RemoteController();
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);
        remoteController.clickOnButton(0);
        remoteController.clickOffButton(0);
        remoteController.repeal();
    }
}
