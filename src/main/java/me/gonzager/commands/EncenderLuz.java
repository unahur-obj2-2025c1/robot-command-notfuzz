package me.gonzager.commands;

import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;

public class EncenderLuz extends Tarea {

    public EncenderLuz(Robot robot, Habitacion habitacion) {
        super(robot, habitacion);
    }

    @Override
    public Double consumo() {
        if(habitacion.luzEstaPrendida()){
            return 1.0;
        }
        return 5.0;
    }

    @Override
    public void execute() {
        robot.consumirBateria(consumo());
        habitacion.encenderLuz();
    }

    @Override
    public Integer tiempo() {
        if(habitacion.luzEstaPrendida()){
            return 25;
        }
        return 50;
    }

}
