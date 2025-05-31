# Robot Doméstico

[Link al Enunciado](https://docs.google.com/document/d/1TJVxY3xF8-Ig1GaY2PX6LDYja3RjdPzCVTwrkV0IPmo/edit?usp=sharing)

## Contexto

La empresa para la cual trabajamos tiene planificado crear robots que puedan ejecutar tareas domésticas, por lo cual nos solicitan que desarrollemos un primer conjunto de tareas que se le pueden ser cargadas al robot para que las ejecute. Una premisa es que luego se puedan agregar más tareas sin modificar el código existente. Y como segunda cosa importante a tener en cuenta es que la programación de robot sea fácil de realizar cargando la secuencia de tareas deseadas que queremos que el robot ejecute.

El robot cuenta con un nivel de carga de batería que disminuye luego que cada tarea es ejecutada. La carga total del robot demora 125 minutos es decir que cada 1 minutos de carga la bateria aumenta 0.8%. En todo momento el robot debe saber responder el nivel de bateria (con un 2 decimales) y también al tiempo de tareas (en segundos sin decimales) que podría ejecutar con el nivel de bateria que tiene.

Por otro lado el robot también lleva un registro detallado de las tareas ejecutadas con su correspondiente duración en segundos.

## Tareas

El área de hardware de la empresa nos pasó la lista de tareas mínimas que debe soportar la primer versión el robot

| Mnemotécnico | Descripción                                                                                                                                          | Consumo de Batería                                           | Duración de la tarea en Segundos                                                                                                                                                                           |
| :----------- | :--------------------------------------------------------------------------------------------------------------------------------------------------- | :----------------------------------------------------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| CARGE        | Ponerse a cargar una determinada cantidad de minutos que se especifica por parámetro.                                                                | 0.00%                                                        | La duración de la tarea es exactamente igual la cantidad de segundos necesarios para **completar** la carga. Se puede dar el caso de poner a cargar 15 minutos y solo necesitaba 5 para completar la carga |
| LIGON        | Encender la luz de una determinada habitación de la casa.                                                                                            | Si la luz estaba encendida \=\> 1.00%, de lo contrario 5.00% | Si la luz estaba encendida \=\> 25 segundos, de lo contrario 90 segundos.                                                                                                                                  |
| LIGOFF       | Apagar la luz de una determinada habitación de la casa                                                                                               | Si la luz estaba apagada \=\> 1.00% de lo contrario 5.00%    | Si la luz estaba apagada \=\> 25 segundos, de lo contrario 90 segundos.                                                                                                                                    |
| CLEAN        | Limpiar siempre el piso de una determinada habitación de la casa                                                                                     | 5.00% por cada metro cuadrado de la habitación               | 180 segundos por cada metro cuadrado de la habitación                                                                                                                                                      |
| INFO         | Informar (solo mostrando la información por consola) el promedio de tiempo de las tareas ejecutadas. Dentro del calculo no incluye la tarea de Info. | 10.00 %                                                      | 15 segundos                                                                                                                                                                                                |
