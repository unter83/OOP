package exeptions;

import logger.Log;
import logger.impl.Logging;

public class Exeption {
    private Log log;

    public Exeption() {
        this.log = new Logging();
    }

    public void idNotFound(Long id) {
        System.out.println("No such id!");
        log.warning(id + " - No such ID");
    }

    public void wrongID(Long id) {
        System.out.println("Wrong id!");
        log.warning(id + " - Wrong id!");
    }

    public void wrongCommand(String command) {
        System.out.println("No such command!");
        log.warning(command + " - No such command!");
    }

    public void oops() {
        System.out.println("Something goes wrong!");
        log.warning(" - Oops!");
    }

}
