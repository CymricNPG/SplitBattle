package net.npg.sb.shared.error;

import java.util.Optional;

/**
 * @author cymric
 */
public interface ErrorInfo {

    String getMessage();

    Optional<Exception> getException();

    /**
     * if true -> stop all current activities
     */
    boolean isFatal();
}
