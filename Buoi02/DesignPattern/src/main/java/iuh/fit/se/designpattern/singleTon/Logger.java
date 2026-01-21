package iuh.fit.se.designpattern.singleTon;

public class Logger {

    // 1. Biến static lưu instance duy nhất
    private static Logger instance;

    // 2. Constructor private -> không cho new từ bên ngoài
    private Logger() {
    }

    // 3. Method lấy instance (thread-safe)
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void logInfo(String message) {
        System.out.println("[INFO] " + message);
    }

    public void logError(String message) {
        System.err.println("[ERROR] " + message);
    }
}
