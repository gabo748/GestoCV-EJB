package BeansStateFul.Local;

import Models.CV;
import Models.UsuarioModel;

import javax.ejb.Stateful;

@Stateful

public class Aplicante implements IAplicante {

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

    @Override
    public UsuarioModel mostrarDatosAplicante(UsuarioModel usuario) {
        return  usuario;
    }

    @Override
    public int mostrarAplicanteAniosLaborados(CV curriculumAplicante) {
        return curriculumAplicante.getAniosDeTrabajo();
    }


}
