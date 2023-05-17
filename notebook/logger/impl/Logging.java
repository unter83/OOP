package logger.impl;

import java.io.FileInputStream;
import java.util.logging.*;

import logger.Log;

public class Logging implements Log {
    private Logger logger = Logger.getLogger(Logging.class.getName());

    public Logging() {

        try (FileInputStream in = new FileInputStream("Lesson_5/notebook/logger/impl/log.config")) { // полный путь до
                                                                                                     // файла
            // с
            // конфигами
            LogManager.getLogManager().readConfiguration(in);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void userEnteredData(String data, String entry) {
        logger.setLevel(Level.INFO);
        logger.info("user entered " + data + " in data " + entry);
    }

    public void warning(String data) {
        logger.setLevel(Level.WARNING);
        logger.warning(data);
    }

}
