package org.example.state;

public class DownState implements State{
    private Elevator elevator;
    public DownState(Elevator elevator) {
        this.elevator = elevator;
    }
    @Override
    public void stop() {
        System.out.println("멈춥니다");
        elevator.setState(elevator.getStopState());
    }

    @Override
    public void up() {
        System.out.println("내려가는 중이라 올라갈 수가 없습니다");
    }

    @Override
    public void down() {
        System.out.println("이미 내려가는 중입니다.");
    }
}
