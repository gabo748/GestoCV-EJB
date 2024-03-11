import Remoto.BeansSingleton.ICurriculum;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class TestCurriculumSingleton {
    public static void main(String[] args) {
        testCurriculum();
    }

    public static void testCurriculum() {
        try {
            Context jndi = new InitialContext();
            ICurriculum curriculum = (ICurriculum) jndi.lookup("java:global/GestorCV-1.0-SNAPSHOT/Curriculum!Remoto.BeansSingleton.ICurriculum");

            System.out.println("LlAMANDO EJB REMOTO");
            System.out.println(curriculum.agregarCV());

            System.out.println("LlAMANDO EJB LOCAL");
            System.out.println(curriculum.actualizarCV());

        } catch (NamingException e) {
            e.printStackTrace(System.out);
        }
    }
}
