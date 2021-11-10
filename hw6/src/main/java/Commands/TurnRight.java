package Commands;

import Cliente.Receiver;

public class TurnRight implements Command {

    private Receiver reciver;
    private String param;

    public TurnRight(Receiver reciver, String param) {
        this.reciver = reciver;
        this.param = param;
    }

    @Override
    public void execute() {
        reciver.turnRight();
    }
}
