
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

/**
 * @author Ballini Juan Bautista
 */

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void agregarAuto(String modelo, String marca, String motor, String color, String patente, int puertas) {
        
        Auto auto = new Auto();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setPuertas(puertas);
        
        controlPersis.agregarAuto(auto);
    }

    public List<Auto> traerAutos() {
       return controlPersis.traerAutos();
    }

    public void borrarAuto(int idAuto) {
        controlPersis.borrarAuto(idAuto);
    }

    public Auto traerAuto(int idAuto) {
        return controlPersis.traerAuto(idAuto);
    }

    public void editarAuto(Auto auto, String modelo, String marca, String motor, String color, String patente, int parseInt) {
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setPuertas(parseInt);
        
        controlPersis.editarAuto(auto);
    }
    
}
