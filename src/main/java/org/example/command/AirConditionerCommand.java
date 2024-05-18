package org.example.command;

public class AirConditionerCommand implements Command{

    AirConditioner airConditioner;

    public AirConditionerCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.work();
    }
}
