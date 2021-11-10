package Commands;

import Cliente.Receiver;

public class TurnLeft implements Command{

    private Receiver reciver;
    private String param;

    public TurnLeft(Receiver reciver, String param) {
        this.reciver = reciver;
        this.param = param;
    }

    @Override
    public void execute() {
        reciver.turnLeft();
    }
}
