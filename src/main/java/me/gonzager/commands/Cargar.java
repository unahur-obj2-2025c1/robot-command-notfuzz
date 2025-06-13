package me.gonzager.commands;

import me.gonzager.domain.Robot;

public class Cargar extends Tarea {
    private Integer minutos;
    @Override
    public void execute() {
        int tiempoRestante = (int)(robot.bateriaRestante() * 1.25);
        if(minutos > tiempoRestante){
            minutos = tiempoRestante;
        }
        robot.consumirBateria(consumo());
        this.robot.cargarBateria(minutos);

    }
    @Override
    public Double consumo() {
        return 0.0;
    }
    @Override
    public Integer tiempo() {
        return 0;
    }
 

    /*	La duración de la tarea es exactamente igual la cantidad 
    de segundos necesarios para completar la carga. Se puede dar 
    el caso de poner a cargar 15 minutos y solo necesitaba 5 para completar la carga */


}
