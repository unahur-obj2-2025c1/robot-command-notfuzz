package me.gonzager.commands;

import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;

public class ApagarLuz extends Tarea {
    public ApagarLuz(Robot robot, Habitacion habitacion) {
        super(robot, habitacion);
    }

    @Override
    public Double consumo() {
        if(habitacion.luzEstaPrendida()){
            return 5.0;
        }
        return 1.0;
    }

    @Override
    public void execute() {
        robot.consumirBateria(consumo());
        habitacion.apagarLuz();
    }

    @Override
    public Integer tiempo() {
        if(habitacion.luzEstaPrendida()){
            return 50;
        }
        return 25;
    }
    
    
}
