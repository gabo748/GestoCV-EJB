package Remoto.BeansSingleton;

import Local.Util.IAplicante;
import Models.CV;
import Models.UsuarioModel;

import javax.ejb.EJB;
import javax.ejb.Singleton;

@Singleton
public class Curriculum implements ICurriculum {
    private CV curriculum;

    @EJB IAplicante iAplicanteLocal;


    @Override
    public CV agregarCV() {
        curriculum = new CV();

        UsuarioModel usuario = new UsuarioModel();
        usuario.setNombre("Angie");
        usuario.setApellidos("Espinoza");
        usuario.setEdad(21);

        curriculum.setUsuario(usuario);
        curriculum.setAniosDeTrabajo(1);
        curriculum.setExperienciaLaboral("Programadora Vue");

        return curriculum;
    }

    @Override
    public CV actualizarCV() {
        return curriculum = iAplicanteLocal.actualizarDatosAplicante(curriculum);
    }
}
