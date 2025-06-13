package me.gonzager.commands;

import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;

public class Info extends Tarea {
    public Info(Robot robot, Habitacion habitacion) {
        super(robot, habitacion);
    }

    /*Informar (solo mostrando la información por consola) el promedio de tiempo de las tareas ejecutadas.
      Dentro del calculo no incluye la tarea de Info.	10.00 %	15 segundos */
    @Override
    public Integer tiempo() {
        return 15;
    }

    @Override
    public Double consumo() {
        return 10.0;
    }

    @Override
    public void execute() {
        System.out.println(robot.tiempoTareas() / robot.getTareasRealizadas().size());
        robot.consumirBateria(consumo());
    }


}
