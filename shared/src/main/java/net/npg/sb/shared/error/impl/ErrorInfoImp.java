/**
 *
 */
package net.npg.sb.shared.error.impl;

import net.npg.sb.shared.error.ErrorInfo;
import org.apache.commons.lang3.Validate;

import java.util.Optional;

/**
 * @author cymric
 */
public class ErrorInfoImp implements ErrorInfo {

    private final String message;
    private final boolean fatal;
    private final Optional<Exception> exception;

    public ErrorInfoImp(final String message, final boolean fatal, final Exception exception) {
        Validate.notNull(message);
        this.message = message;
        this.fatal = fatal;
        this.exception = Optional.ofNullable(exception);
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Optional<Exception> getException() {
        return exception;
    }

    @Override
    public boolean isFatal() {
        return fatal;
    }

}
