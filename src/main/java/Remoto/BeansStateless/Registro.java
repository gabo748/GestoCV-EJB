package Remoto.BeansStateless;

import Local.Util.IAplicante;
import Models.UsuarioModel;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class Registro implements IRegistro {

    private UsuarioModel usuario;

    @EJB
    private IAplicante iAplicanteLocal;

    @Override
    public UsuarioModel crearUsuario() {
        usuario = new UsuarioModel();

        usuario.setNombre("Gabriel");
        usuario.setApellidos("Campos");
        usuario.setEdad(21);

        return iAplicanteLocal.mostrarDatosAplicante(usuario);
    }

    @Override
    public UsuarioModel actualizarUsuario(UsuarioModel usuario) {
        usuario = new UsuarioModel();

        usuario.setNombre("Juan");
        usuario.setApellidos("Lopez");
        usuario.setEdad(21);


        return usuario;
    }
}
