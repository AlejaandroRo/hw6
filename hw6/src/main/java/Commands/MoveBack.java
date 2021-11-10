package Commands;

import Cliente.Receiver;

public class MoveBack implements Command {
    private Receiver reciver;
    private String param;

    public MoveBack(Receiver reciver, String param) {
        this.reciver = reciver;
        this.param = param;
    }

    @Override
    public void execute() {
        reciver.moveBack();
    }
}
