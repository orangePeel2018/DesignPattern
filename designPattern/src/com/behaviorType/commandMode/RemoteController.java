package com.behaviorType.commandMode;

public class RemoteController {
    private Command onCommands[];
    private Command offCommands[];
    private Command unDoCommand;

    public RemoteController(){
        onCommands=new Command[5];
        offCommands=new Command[5];
        for(int i=0;i<5;i++){
            onCommands[i]=new NoCommand();
            offCommands[i]=new NoCommand();
        }
    }

    public void setCommand(int on,Command onCommand,Command offCommand){
        this.onCommands[on]=onCommand;
        this.offCommands[on]=offCommand;
    }

    public void clickOnButton(int on){
        onCommands[on].execute();
        unDoCommand=onCommands[on];
    }

    public void clickOffButton(int on){
        offCommands[on].execute();
        unDoCommand=offCommands[on];
    }

    public void repeal(){
        if(unDoCommand!=null){
            unDoCommand.undo();
        }
    }

}
