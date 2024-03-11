package BeansStateFul.Local;

import Models.CV;
import Models.UsuarioModel;

import javax.ejb.Local;

@Local
public interface IAplicante {


    public CV actualizarDatosAplicante(CV curriculumAplicante);

    public UsuarioModel mostrarDatosAplicante(UsuarioModel usuario);

    public int mostrarAplicanteAniosLaborados(CV curriculumAplicante);

}
