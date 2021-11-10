package Cliente;

import Commands.Command;

import java.util.ArrayList;
import java.util.List;

public class HistoricoComandos {
    private static List<Command> historialComandos;

    public HistoricoComandos() {
        this.historialComandos = new ArrayList<Command>();
    }

    public void addCommand(Command command) {
        historialComandos.add(command);
    }

    public void deleteLastCommand() {
        if(historialComandos.size() >= 1) {
            historialComandos.remove(historialComandos.size()-1);
        } else {
            System.out.println("Ya has borrado todos los comandos");
        }
    }

    public List<Command> getHistorialComandos() {
        return historialComandos;
    }
}
