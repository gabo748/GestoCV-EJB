package BeansSingleton;

import Models.CV;

import javax.ejb.Remote;

@Remote
public interface ICurriculum {
    public CV agregarCV();

    public CV actualizarCV();
}
