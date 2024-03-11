package BeansStateFul.Remoto;


import javax.ejb.Remote;

@Remote
public interface IHistorialLaboral {
    public double mesesLaborados();

    public double diasLaborados();

    public String ultimoTrabajo();

    public int aniosLaboradorados();


}
