package logging;

import java.io.IOException;

import java.util.logging.*;

public class JulWithJavaConfig {

    //    Может быть глобальным
    private static Logger globalLogger = Logger.getGlobal();

    //    Может быть на уровне класса
    private static final Logger LOGGER = Logger.getLogger(JulWithJavaConfig.class.getName());

    public static void main(String[] args) throws IOException {
//        LOGGER.info("test");

        JulWithJavaConfig logging = new JulWithJavaConfig();


//        logging.consoleHandlerWithFineLevel();

//        logging.consoleHandlerWithFilter();

//        logging.consoleHandlerWithFormatter();

//        logging.fileHandlerWithPath();

//        logging.fileHandlerWithPathAndSimpleFormatter();

    }

    public void loggerLevelsAndExamples() {

//        Уровни
        LOGGER.log(Level.SEVERE, "Level SEVERE");
        LOGGER.log(Level.WARNING, "Level WARNING");
        LOGGER.log(Level.INFO, "Level INFO");
        LOGGER.log(Level.CONFIG, "Level CONFIG");
        LOGGER.log(Level.FINE, "Level FINE");
        LOGGER.log(Level.FINER, "Level FINER");
        LOGGER.log(Level.FINEST, "Level FINEST");

//      Примеры вывода
        LOGGER.info("Level info");

//        Можно указать исключение
        LOGGER.log(Level.WARNING, "Level warning", new Exception());

        try {
            System.out.println("sd");
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error " + e.getLocalizedMessage(), e);
        }

    }

    /**
     * Список хэндлеров
     */
    public void listOfHandlers() throws IOException {
        new ConsoleHandler();
        new FileHandler();
        new StreamHandler();
        new SocketHandler();
        new MemoryHandler();
    }


    public void fileHandlerWithPath() throws IOException {

//      Файл хэндлер
        Handler fileHandler;

        try {

            fileHandler = new FileHandler("C:/Users/ILKIN/IdeaProjects/step_io/src/logging/log.log");
//          Не использовать хэндлер по умолчанию, т е не выводить в консоль
            LOGGER.setUseParentHandlers(false);
//          Добавить хэндлер для записи в файл
            LOGGER.addHandler(fileHandler);
//          Вывод
            LOGGER.info("INFO FILE HANDLER");

        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }

    }

    public void fileHandlerWithPathAndSimpleFormatter() {

//      Файл хэндлер
        Handler fileHandler;

        try {

            fileHandler = new FileHandler("C:/Users/ILKIN/IdeaProjects/step_io/src/logging/log.log");
//          Добавить форматтер
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
//          Добавить хэндлер для записи в файл
            LOGGER.addHandler(fileHandler);
//          Вывод
            LOGGER.info("INFO FILE HANDLER");

        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }

    }

    public void consoleHandlerWithFineLevel() {

//      Консоль хэндлер
        Handler consoleHandler = new ConsoleHandler();
//      Добавляем уровень fine хэндлеру
        consoleHandler.setLevel(Level.FINE);
//      Не используем хэндлер по умолчанию, чтобы можно было выводить fine level
        LOGGER.setUseParentHandlers(false);
//      Добавляем хэндлер
        LOGGER.addHandler(consoleHandler);
//      Вывод
        LOGGER.info("LOGGER INFO");
        LOGGER.fine("LOGGER FINE");

    }

    public void consoleHandlerWithFilter() {

//      Консоль хэндлер
        Handler consoleHandler = new ConsoleHandler();
//      Добавляем собственный фильтр
        consoleHandler.setFilter(new MyFilter());
//      Не используем хэндлер по умолчанию
        LOGGER.setUseParentHandlers(false);
//      Добавляем хэндлер
        LOGGER.addHandler(consoleHandler);
//      Вывод
        LOGGER.info("LOGGER INFO");
        LOGGER.info("LOGGER INFO IT STEP");

    }

    public void consoleHandlerWithFormatter() {

//      Консоль хэндлер
        Handler consoleHandler = new ConsoleHandler();
//      Добавляем собственный форматтер
        consoleHandler.setFormatter(new MyFormatter());
//      Не используем хэндлер по умолчанию
        LOGGER.setUseParentHandlers(false);
//      Добавляем хэндлер
        LOGGER.addHandler(consoleHandler);
//      Вывод
        LOGGER.info("LOGGER INFO");

    }
}

//    Фильтр
class MyFilter implements Filter {

    @Override
    public boolean isLoggable(LogRecord logRecord) {
        return logRecord.getMessage().endsWith("IT STEP");
    }
}

//    Форматтер
class MyFormatter extends Formatter {

    @Override
    public String format(LogRecord logRecord) {
        return logRecord.getLevel() + ": " + logRecord.getMessage() + "\n";
    }

}
