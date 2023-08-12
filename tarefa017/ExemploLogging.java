import java.util.logging.Logger;

public class ExemploLogging {
    private static final Logger logger = Logger.getLogger(ExemploLogging.class.getName());
    
    public static void main(String[] args) {
        logger.info("Isso é uma mensagem de informação.");
        logger.warning("Isso é uma mensagem de aviso.");
        logger.severe("Isso é uma mensagem de erro grave.");
    }
}
