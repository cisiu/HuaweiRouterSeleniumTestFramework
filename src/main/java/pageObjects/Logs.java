package pageObjects;

        import java.io.IOException;
        import java.util.logging.Level;
        import java.util.logging.Logger;

public class Logs {
    private final static Logger LOGGER = Logger.getLogger(Logs.class .getName());
    public static void main(String args[]) throws IOException {
//        FileHandler fh;
//        fh = new FileHandler("C:\\Users\\Cisu\\Documents\\dziennik.txt");
//        LOGGER.addHandler(fh);
        LOGGER.setLevel(Level.INFO);
    }
}