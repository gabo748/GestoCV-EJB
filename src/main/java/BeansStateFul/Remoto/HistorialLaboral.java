package BeansStateFul.Remoto;

import BeansStateFul.Local.IAplicante;
import Models.CV;
import Models.UsuarioModel;

import javax.ejb.EJB;
import javax.ejb.Stateful;

@Stateful
public class HistorialLaboral implements IHistorialLaboral {
    private CV curriculumAplicante;

    @EJB
    private IAplicante aplicanteLocal;

    @Override
    public double mesesLaborados() {
        curriculumAplicante = new CV();
        curriculumAplicante.setUsuario(obtenerUsuario());
        curriculumAplicante.setAniosDeTrabajo(3);
        curriculumAplicante.setExperienciaLaboral("Programamador react");

        return curriculumAplicante.getAniosDeTrabajo() / 12.008;
    }

    @Override
    public double diasLaborados() {
        curriculumAplicante = new CV();
        curriculumAplicante.setUsuario(obtenerUsuario());
        curriculumAplicante.setAniosDeTrabajo(2);
        curriculumAplicante.setExperienciaLaboral("Programador Android");

        return curriculumAplicante.getAniosDeTrabajo() / 365.08;
    }

    @Override
    public String ultimoTrabajo() {
        curriculumAplicante = new CV();
        curriculumAplicante.setUsuario(obtenerUsuario());
        curriculumAplicante.setAniosDeTrabajo(2);
        curriculumAplicante.setExperienciaLaboral("Programador iOS");

        return curriculumAplicante.getExperienciaLaboral();
    }

    @Override
    public int aniosLaboradorados() {
        curriculumAplicante = new CV();
        curriculumAplicante.setUsuario(obtenerUsuario());
        curriculumAplicante.setAniosDeTrabajo(2);
        curriculumAplicante.setExperienciaLaboral("Programador iOS");

        return aplicanteLocal.mostrarAplicanteAniosLaborados(curriculumAplicante);
    }

    private UsuarioModel obtenerUsuario() {
        UsuarioModel usuario = new UsuarioModel();
        usuario.setNombre("Marta");
        usuario.setNombre("Lopez");
        usuario.setEdad(27);

        return usuario;
    }
}
