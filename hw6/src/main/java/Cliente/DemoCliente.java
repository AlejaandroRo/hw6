package Cliente;

import Commands.*;

public class DemoCliente {
    public static void main (String [ ] args) {
        HistoricoComandos historicoComandos = new HistoricoComandos();
        Invoker boton = new Invoker(historicoComandos);
        Receiver robot = new Receiver(historicoComandos);
        Command adelante = new MoveForward(robot, "15");
        Command atras = new MoveBack(robot, "15");
        Command derecha = new TurnRight(robot, "90");
        Command izquierda = new TurnLeft(robot, "90");

        boton.setCommand(adelante);
        boton.setCommand(izquierda);
        boton.setCommand(adelante);
        boton.setCommand(adelante);
        boton.setCommand(derecha);
        boton.setCommand(atras);

        //Esto seria pulsar boton DELETE
        boton.deleteLastCommand();

        //Esto seria pulsar el boton GO
        boton.executeCommand();
    }
}
