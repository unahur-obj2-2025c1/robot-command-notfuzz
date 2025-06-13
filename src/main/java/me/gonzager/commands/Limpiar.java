package me.gonzager.commands;

import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;

public class Limpiar extends Tarea {

    @Override
    public Double consumo() {
        return (double)(habitacion.getMetrosCuadrados() * 5);
    }

    @Override
    public void execute() {
        robot.consumirBateria(consumo());
    }
    @Override
    public Integer tiempo() {
        if(habitacion.luzEstaPrendida()){
            return 50;
        }
        return 25;
    }

}
