package me.gonzager.commands;

import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;
//command
public abstract class Tarea  {
    protected Robot robot;
    protected Habitacion habitacion;
    
    public abstract Integer tiempo();
    public abstract Double consumo();
    public abstract void execute();
}
