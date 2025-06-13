package me.gonzager.commands;

import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;

public class Cargar extends Tarea {
    private Integer minutos;
    private Integer tiempo;
    public Cargar(Robot robot, Habitacion habitacion, Integer minutos) {
        super(robot, habitacion);
        this.minutos = minutos;
    }
    @Override
    public void execute() {
        double bateriaRestante = robot.bateriaRestante(); // en porcentaje
        int maximoMinutosParaCarga = (int)(bateriaRestante * 1.25);

        // Si pidió más de lo necesario, se ajusta
        if (minutos > maximoMinutosParaCarga) {
            minutos = maximoMinutosParaCarga;
        }

        robot.cargarBateria(minutos);
        tiempo = minutos * 60;

    }
    @Override
    public Double consumo() {
        return 0.0;
    }
    @Override
    public Integer tiempo() {
        return tiempo;
    }
 

    /*	La duración de la tarea es exactamente igual la cantidad 
    de segundos necesarios para completar la carga. Se puede dar 
    el caso de poner a cargar 15 minutos y solo necesitaba 5 para completar la carga */


}
