package Models;

import javax.ejb.Stateless;
import javax.enterprise.inject.Model;
import java.io.Serializable;


public class CV implements Serializable {
    public UsuarioModel usuario;

    public String experienciaLaboral;

    public int aniosDeTrabajo;

    public UsuarioModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioModel usuario) {
        this.usuario = usuario;
    }

    public String getExperienciaLaboral() {
        return experienciaLaboral;
    }

    public void setExperienciaLaboral(String experienciaLaboral) {
        this.experienciaLaboral = experienciaLaboral;
    }

    public int getAniosDeTrabajo() {
        return aniosDeTrabajo;
    }

    public void setAniosDeTrabajo(int aniosDeTrabajo) {
        this.aniosDeTrabajo = aniosDeTrabajo;
    }

    @Override
    public String toString() {
        return "CV{" +
                "usuario=" + usuario +
                ", experienciaLaboral='" + experienciaLaboral + '\'' +
                ", aniosDeTrabajo=" + aniosDeTrabajo +
                '}';
    }
}
