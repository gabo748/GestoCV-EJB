package Local.Lib;

import Models.CV;

import javax.ejb.Local;

@Local
public interface IAplicanteLib {
    public CV actualizarDatosAplicante(CV curriculumAplicante);
}
