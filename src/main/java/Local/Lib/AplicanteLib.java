package Local.Lib;

import Models.CV;
import Models.UsuarioModel;

import javax.ejb.Stateful;

@Stateful
public class AplicanteLib implements IAplicanteLib {
    @Override
    public CV actualizarDatosAplicante(CV curriculumAplicante) {
        UsuarioModel usuario = new UsuarioModel();
        usuario.setNombre("Tony");
        usuario.setApellidos("Hernandez");
        usuario.setEdad(22);

        curriculumAplicante.setUsuario(usuario);
        curriculumAplicante.setAniosDeTrabajo(10);
        curriculumAplicante.setExperienciaLaboral("Programador web");

        return curriculumAplicante;
    }
}
