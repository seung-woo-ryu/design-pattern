package org.example.state;

public class UpState implements State{

    private Elevator elevator;
    public UpState(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void stop() {
        System.out.println("멈춥니다");
        elevator.setState(elevator.getStopState());
    }

    @Override
    public void up() {
        System.out.println("이미 올라가는 중입니다");
    }

    @Override
    public void down() {
        System.out.println("올라가는 중이라 내려갈 수가 없습니다.");
    }
}
