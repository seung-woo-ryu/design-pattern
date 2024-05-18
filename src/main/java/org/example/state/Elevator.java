package org.example.state;

public class Elevator {
    private State upState = new UpState(this);
    private State downState = new DownState(this);
    private State stopState = new StopState(this);
    private State state;
    public Elevator() {
        // 처음은 멈춰있는 상태
        this.state = stopState;
    }
    public State getUpState() {
        return upState;
    }
    public State getDownState() {
        return downState;
    }
    public State getStopState() {
        return stopState;
    }
    public void setState(State state) {
        this.state = state;
    }
    public void pushUpButton() {
        this.state.up();
    }
    public void pushDownButton() {
        this.state.down();
    }
    public void pushStopButton() {
        this.state.stop();
    }
}