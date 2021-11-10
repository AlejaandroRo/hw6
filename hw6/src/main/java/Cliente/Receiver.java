package Cliente;

import Commands.Command;

import java.util.List;

public class Receiver {
    private HistoricoComandos historicoComandos;

    public Receiver(HistoricoComandos historicoComandos) {
        this.historicoComandos = historicoComandos;
    }

    public void moveForward() {
        System.out.println("Moviendo hacia delante 15cm");
    }

    public void moveBack() {
        System.out.println("Moviendo hacia atrás 15cm");
    }

    public void turnLeft() {
        System.out.println("Girarando hacia la izquierda 90º");
    }

    public void turnRight() {
        System.out.println("Girarando hacia la derecha 90º");
    }

    public void delete() {
        System.out.println("Borrado último comando elegido");
    }

    public void go() {
        System.out.println("Iniciando movimientos");
        List<Command> commands = historicoComandos.getHistorialComandos();
        for(Command command: commands){
            command.execute();
        }
    }
}
