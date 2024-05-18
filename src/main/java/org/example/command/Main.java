package org.example.command;

public class Main {

    public static void main(String[] args) {
        Tv tv = new Tv();
        AirConditioner airConditioner = new AirConditioner();

        Command tvCommand =  new TvCommand(tv);
        Command airConditionerCommand = new AirConditionerCommand(airConditioner);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(tvCommand);
        remoteControl.executeCommand();

        remoteControl.setCommand(airConditionerCommand);
        remoteControl.executeCommand();

//        Command[] commands = new Command[]{command, command2};
//
//        ThreadInvoker threadInvoker = new ThreadInvoker();
//        threadInvoker.setCommands(commands);
//
//        threadInvoker.executeCommand();
    }
}
