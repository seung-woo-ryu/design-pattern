package org.example.state;

public class StopState implements State{
    private Elevator elevator;
    public StopState(Elevator elevator) {
        this.elevator = elevator;
    }
    @Override
    public void stop() {
        System.out.println("이미 멈춰있습니다");
    }

    @Override
    public void up() {
        System.out.println("올라갑니다");
        elevator.setState(elevator.getUpState());
    }

    @Override
    public void down() {
        System.out.println("내려갑니다");
        elevator.setState(elevator.getDownState());
    }
}
