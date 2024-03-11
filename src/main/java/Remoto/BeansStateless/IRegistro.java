package Remoto.BeansStateless;

import Models.UsuarioModel;

import javax.ejb.Remote;

@Remote
public interface IRegistro {
    public UsuarioModel crearUsuario();

    public UsuarioModel actualizarUsuario(UsuarioModel user);

}
