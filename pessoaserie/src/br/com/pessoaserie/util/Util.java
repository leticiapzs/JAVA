package br.com.pessoaserie.util;

import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Util {
    private static Logger logger = Logger.getLogger(Util.class.getName());

    private Util() {
        throw new IllegalStateException("Erro ao tentar criar uma instância desta classe!");
    }

    public static Logger setupLogger() {
        logger.setUseParentHandlers(false);
        customizer();
        ConsoleHandler customHandler = new ConsoleHandler();
        customHandler.setFormatter(new Formatter() {
            public String format(LogRecord rec) {
                return rec.getMessage() + "\n";
            }
        });
        logger.addHandler(customHandler);
        return logger;
    }

    public static void customizer() {
        if (logger.getHandlers().length > 0) {
            Handler[] var3;
            int var2 = (var3 = logger.getHandlers()).length;

            for(int var1 = 0; var1 < var2; ++var1) {
                Handler log = var3[var1];
                logger.removeHandler(log);
                if (logger.getHandlers().length == 1) {
                    break;
                }
            }
        }

    }
}