package org.example.command;

public class TvCommand implements Command{

    Tv tv;

    public TvCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.work();
    }
}
