package transport;

public class DiagnosticNotAllowedException extends Exception {
    public DiagnosticNotAllowedException() {
    }

    public DiagnosticNotAllowedException(String message) {
        super(message);
    }

    public DiagnosticNotAllowedException(String message, Throwable cause) {
        super(message, cause);
    }

    public DiagnosticNotAllowedException(Throwable cause) {
        super(cause);
    }

    public DiagnosticNotAllowedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
