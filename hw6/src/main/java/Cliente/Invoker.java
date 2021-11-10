package Cliente;

import Commands.Command;

import java.util.List;

public class Invoker {
    private HistoricoComandos historicoComandos;

    public Invoker(HistoricoComandos historicoComandos) {
        this.historicoComandos = historicoComandos;
    }

    public void setCommand(Command command) {
        historicoComandos.addCommand(command);
    }

    public void executeCommand() {
        List<Command> comandos = historicoComandos.getHistorialComandos();
        for(Command command: comandos){
            command.execute();
        }
    }

    public void deleteLastCommand() {
        historicoComandos.deleteLastCommand();
    }
}
