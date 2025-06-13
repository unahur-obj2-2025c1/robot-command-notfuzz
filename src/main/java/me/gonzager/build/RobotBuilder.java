package me.gonzager.build;

import java.util.ArrayList;

import me.gonzager.commands.Tarea;
import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;
import me.gonzager.excepciones.RobotException;

public class RobotBuilder {
    private Habitacion habitacion;
    private ArrayList<Tarea> tareasARealizar = new ArrayList<>();

    public RobotBuilder conHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
        return this;
    }

    public RobotBuilder conTareas(ArrayList<Tarea> tareas) {
        this.tareasARealizar = tareas;
        return this;
    }

    public RobotBuilder agregarTarea(Tarea tarea) {
        this.tareasARealizar.add(tarea);
        return this;
    }

    public Robot build() {
        if (habitacion == null) {
            throw new RobotException("El robot necesita una habitación.");
        }
        return new Robot(habitacion, tareasARealizar);
    }
}