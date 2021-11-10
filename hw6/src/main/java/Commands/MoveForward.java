package Commands;

import Cliente.Receiver;

public class MoveForward implements Command{

    private Receiver reciver;
    private String param;

    public MoveForward(Receiver reciver, String param) {
        this.reciver = reciver;
        this.param = param;
    }

    @Override
    public void execute() {
        reciver.moveForward();
    }
}
