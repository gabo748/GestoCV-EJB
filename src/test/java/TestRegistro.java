import Remoto.BeansStateless.IRegistro;
import Models.UsuarioModel;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class TestRegistro {
    public static void main(String[] args) {
        testRegistro();
    }

    public static void testRegistro() {
        try {
            Context jndi = new InitialContext();
            IRegistro registro = (IRegistro) jndi.lookup("java:global/GestorCV-1.0-SNAPSHOT/Registro!Remoto.BeansStateless.IRegistro");

            System.out.println("LlAMANDO EJB REMOTO");

            UsuarioModel nuevoUsuario = new UsuarioModel();
            nuevoUsuario.setNombre("Pepe");
            nuevoUsuario.setApellidos("Choto");
            nuevoUsuario.setEdad(90);

            System.out.println("EL NUEVO USUARIO ES: \n" + registro.actualizarUsuario(nuevoUsuario));

            System.out.println("LlAMANDO EJB LOCAL");
            System.out.println(registro.crearUsuario());

        } catch (NamingException e) {
            e.printStackTrace(System.out);
        }
    }
}
