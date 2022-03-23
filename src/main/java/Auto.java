import java.util.ArrayList;

public class Auto {
    String modelo;
    int precio;
    ArrayList<Asiento> asientos;
    String marca;
    Motor motor;
    int registros;
    int cantidadCreados;

    int cantidadAsientos(){
        return 3;
    }

    String verificarIntegridad(){
        return "peguelosocito";
    }
}