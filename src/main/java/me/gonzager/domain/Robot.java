package me.gonzager.domain;

import java.util.ArrayList;
import me.gonzager.commands.Tarea;
import me.gonzager.excepciones.RobotException;


public class Robot {
    private Habitacion habitacion;
    private Double bateria = 100.00d;
    private ArrayList<Tarea> tareasARealizar;
    private ArrayList<Tarea> tareasRealizadas = new ArrayList<Tarea>();
    
    public void agregartarea(Tarea tarea){
        tareasARealizar.add(tarea);
    }

    public Robot(Habitacion habitacion, ArrayList<Tarea> tareasARealizar) {
        this.habitacion = habitacion;
        this.tareasARealizar = tareasARealizar;
    }

    public void realizarTareas(){
        for (Tarea tarea : tareasARealizar) {
        tarea.execute();                
        tareasRealizadas.add(tarea);   
    }
    }

    public ArrayList<Tarea> getTareasRealizadas() {
        return tareasRealizadas;
    }

    public void agregarTareaRealizada(Tarea tarea){
        tareasRealizadas.add(tarea);
    }
    public Habitacion geHabitacion(){
        return habitacion;
    }
    public Double getBateria(){
        return bateria;
    }
    
    public void cargarBateria(Integer minutos) {
        bateria = Math.min(100.00d, bateria + minutos * 0.80d);
    }

    public Integer tiempoTareas(){
        Integer nuevoTiempoTareas = tareasRealizadas.stream().mapToInt(t -> t.tiempo()).sum();
        return nuevoTiempoTareas;    
    }
    
    public Double bateriaRestante(){
        return 100.0d - getBateria();
    }

    public void consumirBateria(Double bateriaAConsumir){
        if(bateria < bateriaAConsumir){
            throw new RobotException("Batería insuficiente para realizar esta acción");
        }
        bateria -= bateria;
    }

}
