import java.util.ArrayList;

public class Auto {
    String modelo;
    int precio;
    ArrayList<Asiento> asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    int cantidadAsientos(){
        cantidadCreados = 0;
        for (Asiento i: asientos){
            if (i instanceof Asiento){
                cantidadCreados ++;
            }
        }
        return cantidadCreados;
    }

    String verificarIntegridad(){
        if (this.motor.registro == registro ){
            for (Asiento i: asientos){
                if (i.registro != registro){
                    return "Las piezas no son originales";
                }
            }
        }else {
            
        }
    }
}