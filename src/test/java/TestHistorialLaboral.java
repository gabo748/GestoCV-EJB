import BeansSingleton.ICurriculum;
import BeansStateFul.Remoto.IHistorialLaboral;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class TestHistorialLaboral {
    public static void main(String[] args) {
        testHistorialLaboral();
    }

    public static void testHistorialLaboral() {
        try {
            Context jndi = new InitialContext();
            IHistorialLaboral historialLaboral = (IHistorialLaboral) jndi.lookup("java:global/GestorCV-1.0-SNAPSHOT/HistorialLaboral!BeansStateFul.Remoto.IHistorialLaboral");

            System.out.println("LlAMANDO EJB REMOTO");
            System.out.println("SU ULTIMO TRABAJO FUE: " + historialLaboral.ultimoTrabajo());
            System.out.println("SUS DIAS LABORALES FUERON: " + historialLaboral.diasLaborados());
            System.out.println("SUS MESES LABORALES FUERON: " + historialLaboral.mesesLaborados());


            System.out.println("LlAMANDO EJB LOCAL");
            System.out.println("SUS ANIOS LABORADOS SON: " + historialLaboral.aniosLaboradorados());

        } catch (NamingException e) {
            e.printStackTrace(System.out);
        }
    }
}
