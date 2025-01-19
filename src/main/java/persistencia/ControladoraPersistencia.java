
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Auto;
import persistencia.exceptions.NonexistentEntityException;

/**
 * @author Ballini Juan Bautista
 */

public class ControladoraPersistencia {
    
    AutoJpaController autoJpa = new AutoJpaController();
    
    public void agregarAuto(Auto auto) {
        autoJpa.create(auto);
    }

    public List<Auto> traerAutos() {
        return autoJpa.findAutoEntities();
    }

    public void borrarAuto(int idAuto) {
        try {
            autoJpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            System.out.println("Error al Eliminar un auto");
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Auto traerAuto(int idAuto) {
        return autoJpa.findAuto(idAuto);
    }

    public void editarAuto(Auto auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            System.out.println("Error al Editar Auto");
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
