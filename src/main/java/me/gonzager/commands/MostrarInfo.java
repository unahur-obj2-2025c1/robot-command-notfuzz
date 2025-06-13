package me.gonzager.commands;

import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;

public class MostrarInfo extends Tarea {
    public MostrarInfo(Robot robot, Habitacion habitacion) {
        super(robot, habitacion);
    }
    
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
