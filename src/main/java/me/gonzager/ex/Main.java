package me.gonzager.ex;

import me.gonzager.commands.ApagarLuz;
import me.gonzager.commands.Cargar;
import me.gonzager.commands.EncenderLuz;
import me.gonzager.commands.MostrarInfo;
import me.gonzager.commands.Tarea;
import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Habitacion cocina = new Habitacion(20);
        ApagarLuz apagarLuz = new ApagarLuz(robot, cocina);
        EncenderLuz encenderLuz = new EncenderLuz(robot, cocina);
        Cargar cargar = new Cargar(robot, cocina, 100000);
        MostrarInfo info = new MostrarInfo(robot, cocina);
        /*
         * robot.agregarTarea(encenderLuz);
         * robot.agregarTarea(apagarLuz);
         * robot.agregarTarea(encenderLuz);
         * robot.agregarTarea(apagarLuz);
         * robot.realizarTareas();
         * 
         * System.out.println(robot.getBateria());
         * 
         * robot.agregarTarea(cargar);
         * robot.realizarTareas();
         * System.out.println(robot.getBateria());
         * System.out.println(cargar.tiempo());
         * robot.agregarTarea(info);
         * robot.realizarTareas();
         */

        robot.agregarTarea(encenderLuz);
        robot.agregarTarea(apagarLuz);
        robot.agregarTarea(apagarLuz);
        robot.realizarTareas();
        System.out.println(robot.tiempoTareas());
        robot.agregarTarea(info);
        robot.realizarTareas();
        System.out.println(robot.tiempoParaHacerTareas());
    }

}