package Local.Util;

import Local.Lib.IAplicanteLib;
import Models.CV;
import Models.UsuarioModel;

import javax.ejb.EJB;
import javax.ejb.Stateful;

@Stateful

public class Aplicante implements IAplicante {

    @EJB
    private IAplicanteLib aplicanteUtil;

    @Override
    public CV actualizarDatosAplicante(CV curriculumAplicante) {
        return aplicanteUtil.actualizarDatosAplicante(curriculumAplicante);
    }

    @Override
    public UsuarioModel mostrarDatosAplicante(UsuarioModel usuario) {
        return  usuario;
    }

    @Override
    public int mostrarAplicanteAniosLaborados(CV curriculumAplicante) {
        return curriculumAplicante.getAniosDeTrabajo();
    }


}
