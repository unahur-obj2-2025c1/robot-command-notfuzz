package me.gonzager.domain;

import java.util.ArrayList;
import me.gonzager.commands.Tarea;
import me.gonzager.excepciones.RobotException;


public class Robot {
    private Double bateria = 100.00d;
    private ArrayList<Tarea> tareasARealizar = new ArrayList<Tarea>();
    private ArrayList<Tarea> tareasRealizadas = new ArrayList<Tarea>();
    
    public ArrayList<Tarea> getTareasARealizar() {
        return tareasARealizar;
    }

    public void agregarTarea(Tarea tarea){
        tareasARealizar.add(tarea);
    }

    public Robot() {
    }

    public void realizarTareas(){
        for (Tarea tarea : tareasARealizar) {
        tarea.execute();                
        tareasRealizadas.add(tarea);  
        }
        tareasARealizar.clear();
   }

    public ArrayList<Tarea> getTareasRealizadas() {
        return tareasRealizadas;
    }

    public Double getBateria(){
        return bateria;
    }
    
    public void cargarBateria(Integer minutos) {
        bateria = Math.min(100.0, bateria + minutos * 0.80);
    }

    public Integer tiempoTareas(){
        Integer nuevoTiempoTareas = tareasRealizadas.stream().mapToInt(t -> t.tiempo()).sum();
        return nuevoTiempoTareas;    
    }

    public Integer tiempoParaHacerTareas(){
        return (int)((getBateria() * 125) * 60);
    }
    
    public Double bateriaRestante(){
        return 100.0d - getBateria();
    }

    public void consumirBateria(Double bateriaAConsumir){
        if(bateria < bateriaAConsumir){
            throw new RobotException("Batería insuficiente para realizar esta acción");
        }
        bateria -= bateriaAConsumir;
    }

}
